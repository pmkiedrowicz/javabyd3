package com.sda.javabyd3.urdu.exEnum;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Tshirt tshirt1 = new Tshirt(Size.S);

        if(tshirt1.getSize()==Size.L ||
                tshirt1.getSize()==Size.Xl ||
                tshirt1.getSize()==Size.XXl){

        }

        if ( tshirt1.getSize().isSmall()){

        }

        for (Size size : Size.values()) {
            System.out.println(size);
        }

        List<Tshirt> tshirtsList = new ArrayList<>();
        for (Tshirt tshirt : tshirtsList) {
            switch (tshirt.getSize()) {

                case L:
                    break;
                case M:
                    break;
                case S:
                    break;


            }
        }

      Size size1= Size.valueOf(Size.class, "S");  // nadanie przez użytkownika jakby
        System.out.println("Size1: " + size1);

    }
}