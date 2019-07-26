package com.sda.javabyd3.syga.enums;

public enum Size {
    XXL(1){
        @Override
        public boolean isLarge(){
            return true;
        }
    },
    XL(2){
        @Override
        public boolean isLarge(){
            return true;
        }
    },
    L(3){
        @Override
        public boolean isLarge(){
            return true;
        }
    },
    M(4),
    S(5){
        @Override
        public boolean isSmall(){
            return true;
        }
    };

    private int size;

    Size(int size){
        this.size = size;
    }
    public boolean isLarge(){
        return true;
    }
    public boolean isSmall(){
        return true;
    }

}
