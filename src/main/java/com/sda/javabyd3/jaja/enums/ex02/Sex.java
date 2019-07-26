package com.sda.javabyd3.jaja.enums.ex02;


import lombok.Getter;


@Getter

public enum Sex {
    male {@Override
    public boolean isMale(){
        return true;
    }},
    female;

    public boolean isMale(){
        return false;
    }
}


