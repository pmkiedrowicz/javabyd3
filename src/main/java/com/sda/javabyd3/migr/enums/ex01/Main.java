package com.sda.javabyd3.migr.enums.ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(Size.S);





        for (Size size : Size.values()) {
            System.out.println(size);

        }

        List<Tshirt> tshirtList = new ArrayList<>();
        for(Tshirt t: tshirtList) {
            switch (t.getSize()){


                case XL:
                    break;
                case M:
                    break;
                case S:
                    break;

            }
        }
    }
}
