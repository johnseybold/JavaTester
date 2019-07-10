package com.example.javatester.MoneyExample;

public class Denomination {
    private String singularName;
    private String pluralName;
    private int value;


    public String getPluralName() {
        return pluralName;
    }

    public void setPluralName(String pluralName) {
        this.pluralName = pluralName;
    }

    public String getSingularName() {
        return singularName;
    }

    public void setSingularName(String singularName) {
        this.singularName = singularName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Denomination(String singularName, String pluralName, int value) {
        this.singularName = singularName;
        this.pluralName = pluralName;
        this.value = value;
    }
}
