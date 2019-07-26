package com.sda.javabyd3.mizi.exg013.ex03;

import java.util.Optional;

/**
 * Created by Michal Ziolecki.
 */
public class Main03 {
    public static void main(String[] args) {
        String colorRed = "RED";
        String colorEmpty = null;
        //ColorEnum color = ColorEnum.valueOf( colorRed );
        System.out.println(" For null: ");
        System.out.println(Optional.ofNullable( colorEmpty )
                .map( color1 -> ColorEnum.valueOf( color1 ) ).orElse( ColorEnum.UNKNOWN ));
        System.out.println(" For value: ");
        System.out.println(Optional.ofNullable( colorRed )
                .map( color1 -> ColorEnum.valueOf( color1 ) ).orElse( ColorEnum.UNKNOWN ));

    }
}
