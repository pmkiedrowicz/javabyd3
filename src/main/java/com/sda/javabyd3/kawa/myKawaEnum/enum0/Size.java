package com.sda.javabyd3.kawa.myKawaEnum.enum0;

public enum Size {
    XXL(1) {
        @Override
        public boolean isLarge() {
            return true;
        }
    },

    XL(2) {
        @Override
        public boolean isLarge() {
            return true;
        }
    },

    L(1) {
        @Override
        public boolean isLarge() {
            return true;
        }
    },

    M(2),
    S(3) {
        @Override
        public boolean isSmall() {
            return true;
        }
    };

    private int size;

    public boolean isLarge() {
        return false;
    }

    public boolean isSmall() {
        return false;
    }

    Size(int size) {
        this.size = size;
    }

}
