package com.sda.javabyd3.kawa.exg012.ex03;
;
import java.util.ArrayList;
import java.util.List;

public class GenericListT <T> {

    private List<T> myGenericListT;

    public GenericListT() {
        this.myGenericListT = new ArrayList<>();
    }

    public void addToMyGenericListT (T object){
        this.myGenericListT.add(object);
    }

    public List<T> getMyGenericListT() {
        return myGenericListT;
    }

    public T getObjectFromMyList (int item){
        return myGenericListT.get((item-1));
    }
}
