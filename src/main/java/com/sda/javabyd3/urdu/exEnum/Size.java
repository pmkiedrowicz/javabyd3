package com.sda.javabyd3.urdu.exEnum;

public enum Size {

    XXl(1){
        @Override
    public boolean isLarge(){
        return  true;
        }
        },
    Xl(2){
        @Override
        public boolean isLarge(){
            return  true;
        }
    },
    L(3){
        @Override
        public boolean isLarge(){
            return  true;
        }
    },
    M(4),
    S(5){
        @Override
        public boolean isSmall() {
          return true ;
        }
    };


    private int size;

    public boolean isLarge(){
        return false;
    }

    public boolean isSmall(){
        return false;
    }

    Size(int size){
        this.size = size;
    }
}
