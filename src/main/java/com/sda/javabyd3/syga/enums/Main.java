package com.sda.javabyd3.syga.enums;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(Size.S);

        if (tshirt.getSize() == Size.S){

        }
        if(tshirt.getSize().isLarge()){

        }

        for (Size size : Size.values()) {
            System.out.println(size);
        }

        List<Tshirt> tshirtList = new ArrayList<>();
        for (Tshirt tshirtl : tshirtList) {
            switch (tshirtl.getSize()) {
                case L:
                    break;
                case M:
                    break;
                case S:
                    break;

            }
        }
    }
}
