package com.sda.javabyd3.syga.enums.person;

public enum Sex {
    Male(1){
        @Override
        public boolean isMale(){
            return true;
        }
    },
    Female(2){
        @Override
        public boolean isFemale(){
            return true;
        }
    };

    private int sex;

    Sex (int sex){
        this.sex = sex;
    }
    public boolean isMale(){
        return true;
    }

    public boolean isFemale(){
        return true;
    }
}
