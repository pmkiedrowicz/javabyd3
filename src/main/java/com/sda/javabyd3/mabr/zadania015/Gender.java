package com.sda.javabyd3.mabr.zadania015;

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





