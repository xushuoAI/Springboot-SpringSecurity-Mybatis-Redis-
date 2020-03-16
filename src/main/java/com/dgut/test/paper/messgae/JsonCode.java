package com.dgut.test.paper.messgae;

public enum JsonCode {
    /* 成功状态码 */
    SUCCESS(0, "成功"),
    /* 失败状态码 */
    FAILED(9001,"失败"),
    /* 错误状态码 */
    ERROR(9002,"不存在该资源，请检查参数是否正确。");


    private Integer code;

    private String message;

    JsonCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    public Integer code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }


    public static String getMessage(String name) {
        for (JsonCode item : JsonCode.values()) {
            if (item.name().equals(name)) {
                return item.message;
            }
        }
        return name;
    }

    public static Integer getCode(String name) {
        for (JsonCode item : JsonCode.values()) {
            if (item.name().equals(name)) {
                return item.code;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.name();
    }

}
