package com.masai.enums;

public enum Status {
    SUCCESS(200),
    ERROR(500),
    NOT_FOUND(484);

    private final int code;

    Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
