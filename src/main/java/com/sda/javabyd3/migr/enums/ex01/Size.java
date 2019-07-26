package com.sda.javabyd3.migr.enums.ex01;

public enum Size {
    XXL(1) {
        @Override
        public boolean isLarge() {
            return true;
        }},
        XL(2) {
            @Override
            public boolean isLarge () {
                return true;
            }
        },
        M(3),
        S(4) {
            @Override
            public boolean isSmall () {
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
