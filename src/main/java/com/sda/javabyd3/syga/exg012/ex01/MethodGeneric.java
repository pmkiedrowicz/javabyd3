package com.sda.javabyd3.syga.exg012.ex01;

public class MethodGeneric<T,S,U>{
    public T Integer[];
    public S Double[];
    public U Character[];

    public MethodGeneric(T[] integer, S[] aDouble, U[] character) {
        Integer = integer;
        Double = aDouble;
        Character = character;
    }

    public MethodGeneric() {
    }

    public T[] getInteger() {
        return Integer;
    }

    public S[] getDouble() {
        return Double;
    }

    public U[] getCharacter() {
        return Character;
    }

    MethodGeneric methodGeneric = new MethodGeneric();

    public MethodGeneric getMethodGeneric() {
        return methodGeneric;
    }
}
