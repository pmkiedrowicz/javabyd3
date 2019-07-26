package com.sda.javabyd3.urdu.exg010.ex02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Point {

    private int x;
    private int y;

    @Override
    public String toString() {
        return "Point:( x= "+x + " y= " +y + ")";
    }
}
