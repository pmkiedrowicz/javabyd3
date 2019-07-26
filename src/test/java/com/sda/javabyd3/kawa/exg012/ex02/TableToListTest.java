package com.sda.javabyd3.kawa.exg012.ex02;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class TableToListTest {

    TableToList test = new TableToList();

    @Test
    public void addingFromTableToList() {
        Integer [] myIntList = {3,2,1,3,2,3,123};
        List<Integer> expectedList = new ArrayList<Integer>(){{
            for(Integer element: myIntList){
                add(element);
            }
        }};
        Assert.assertEquals(expectedList,test.addingFromTableToList(myIntList));
    }
}