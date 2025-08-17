package com.io.github.eurmartins.demo.enums;

public enum UserType {
    ADMIN(1),
    LAWYER(2),
    ANALYST(3),
    ASSISTANT(4);

    private final int code;

    UserType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static UserType valueOf(int code) {
        for (UserType userType : UserType.values()) {
            if (userType.getCode() == code) {
                return userType;
            }
        }
        throw new IllegalArgumentException("Código de role inválido: " + code);
    }
}
