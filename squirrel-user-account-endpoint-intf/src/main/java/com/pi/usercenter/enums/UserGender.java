package com.pi.usercenter.enums;

import com.pi.common.utils.enums.NamedEnumEntity;

public enum UserGender implements NamedEnumEntity<Byte> {

    UNKNOWN(0, "妖"),

    MALE(1, "男"),

    FEMALE(2, "女");

    private Byte value;

    private String name;

    private UserGender(int value, String name) {
        this.value = (byte) value;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Byte getValue() {
        return value;
    }
}
