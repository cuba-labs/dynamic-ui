package com.company.sample.web.test;

import com.company.sample.entity.TestEnum;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.sample.entity.Test;
import com.haulmont.cuba.gui.components.FieldGroup;
import com.haulmont.cuba.gui.data.Datasource;

import javax.inject.Inject;
import java.util.Map;

public class TestEdit extends AbstractEditor<Test> {

    @Inject
    private Datasource<Test> testDs;
    @Inject
    private FieldGroup fieldGroup;

    @Override
    public void init(Map<String, Object> params) {
        testDs.addItemPropertyChangeListener(e -> {
            if ("field".equals(e.getProperty())) {
                updateFields();

                // Set value to the Entity field according to the Enum value
                switch (getItem().getField()) {
                    case TEST_1:
                        getItem().setField1("Field1");
                        break;
                    case TEST_2:
                        getItem().setField2("Field2");
                        break;
                    case TEST_3:
                        getItem().setField3("Field3");
                        break;
                }
            }
        });
    }

    @Override
    protected void postInit() {
        updateFields();
    }

    private void updateFields() {
        // Update fields visibility according to the Enum value
        fieldGroup.getFieldNN("field1").setVisible(TestEnum.TEST_1.equals(getItem().getField()));
        fieldGroup.getFieldNN("field2").setVisible(TestEnum.TEST_2.equals(getItem().getField()));
        fieldGroup.getFieldNN("field3").setVisible(TestEnum.TEST_3.equals(getItem().getField()));
    }
}