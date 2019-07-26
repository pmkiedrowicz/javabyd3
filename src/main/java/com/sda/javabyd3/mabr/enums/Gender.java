package com.sda.javabyd3.mabr.enums;

public enum Gender {

    Kobieta("F"){
        @Override
        public boolean isWoman(){
            return true;
        }
    },

    Mezczyzna("M");

    public boolean isWoman(){
        return  false;
    }

    private String shortGender;

    Gender(String shortGender){
        this.shortGender = shortGender;
    }
}





