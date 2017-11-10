package com.company.sample.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TestEnum implements EnumClass<Integer> {

    TEST_1(10),
    TEST_2(20),
    TEST_3(30);

    private Integer id;

    TestEnum(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static TestEnum fromId(Integer id) {
        for (TestEnum at : TestEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}