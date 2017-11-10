package com.company.sample.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "SAMPLE_TEST")
@Entity(name = "sample$Test")
public class Test extends StandardEntity {
    private static final long serialVersionUID = 5167017039057206421L;

    @Column(name = "FIELD", nullable = false)
    protected Integer field;

    @Column(name = "FIELD1")
    protected String field1;

    @Column(name = "FIELD2")
    protected String field2;

    @Column(name = "FIELD3")
    protected String field3;

    public void setField(TestEnum field) {
        this.field = field == null ? null : field.getId();
    }

    public TestEnum getField() {
        return field == null ? null : TestEnum.fromId(field);
    }


    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField1() {
        return field1;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField2() {
        return field2;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField3() {
        return field3;
    }


}