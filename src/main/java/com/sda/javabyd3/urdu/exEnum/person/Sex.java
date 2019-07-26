package com.sda.javabyd3.urdu.exEnum.person;

import lombok.Getter;

@Getter

public enum Sex {

    Kobieta("K"){
        @Override
        public boolean isWoman(){
            return true;
        }
    },

    Mężczyzna("M");

    public boolean isWoman(){
        return  false;
    }

    private String shortSex;

    Sex(String shortSex){
        this.shortSex = shortSex;
    }
}
