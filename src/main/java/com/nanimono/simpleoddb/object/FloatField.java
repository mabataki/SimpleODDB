package com.nanimono.simpleoddb.object;

import java.lang.Object;

public class FloatField implements Field {

    private float value;

    public float getValue() { return value; }

    public FloatField(float value) { this.value = value; }

    @Override
    public String toString() { return Float.toString(value); }

    @Override
    public int hashCode() { return Float.hashCode(value); }

    @Override
    public boolean equals(Object field) { return ((FloatField) field).value == value; }

    @Override
    public TypeEnum getType() {
        return TypeEnum.FLOAT_TYPE;
    }

    @Override
    public int getSize() {
        return TypeEnum.FLOAT_TYPE.getSize();
    }
}
