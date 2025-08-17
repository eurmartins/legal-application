package com.io.github.eurmartins.demo.enums;

public enum Role {
    ADMIN(1),
    LAWYER(2),
    ANALYST(3),
    ASSISTANT(4);

    private final int code;

    Role(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Role valueOf(int code) {
        for (Role role : Role.values()) {
            if (role.getCode() == code) {
                return role;
            }
        }
        throw new IllegalArgumentException("Código de role inválido: " + code);
    }
}
