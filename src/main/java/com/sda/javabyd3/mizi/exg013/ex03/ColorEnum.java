package com.sda.javabyd3.mizi.exg013.ex03;

/**
 * Created by Michal Ziolecki.
 */
public enum ColorEnum {
    RED("czerwony"),
    GREEN("zielony"),
    BLUE("niebieski"),
    UNKNOWN(null);

    String color;
    ColorEnum(String colorToConvert){
     this.color = colorToConvert;
    }

    public String getColor(){
        return color;
    }

}
