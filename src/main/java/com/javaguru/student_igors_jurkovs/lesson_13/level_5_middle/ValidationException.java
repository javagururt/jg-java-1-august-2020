package com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle;

public class ValidationException extends Exception {

    private final String ruleName;
    private final String description;
    private final String fieldName;

    public ValidationException(String ruleName, String description, String fieldName) {
        this.ruleName = ruleName;
        this.description = description;
        this.fieldName = fieldName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public String getDescription() {
        return description;
    }

    public String getFieldName() {
        return fieldName;
    }
}
