package com.sda.javabyd3.jaja.exg012.ex03;

import java.util.ArrayList;
import java.util.List;

public class GenericClass<T> {

    private List<T> list;

    public GenericClass() {
        this.list = new ArrayList<>();
    }

    public void addElement(T element) {
        this.list.add(element);
    }

    public List<T> getList() {
        return list;
    }

    public T getElement(int index) {
        T element;
        element = list.get(index);
        return element;
    }
}
