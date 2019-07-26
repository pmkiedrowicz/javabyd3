package com.sda.javabyd3.mizi.exg012.ex03;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class GenericMethodEx03<T> {

    private List<T> listOfObject;

    public GenericMethodEx03(){
        this.listOfObject = new ArrayList <>(  );
    }

    public void addToList(T object){
        this.listOfObject.add( object );
    }

    public List<T> getListOfObject(){
        return listOfObject;
    }

    public T getElelemntOfList(int index){
        T elementOfList;
        elementOfList = listOfObject.get( index );
        return elementOfList;
    }
}
