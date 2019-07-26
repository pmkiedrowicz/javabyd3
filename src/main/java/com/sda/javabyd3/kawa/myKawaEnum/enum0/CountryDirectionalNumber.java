package com.sda.javabyd3.kawa.myKawaEnum.enum0;

import lombok.Getter;

@Getter
public enum CountryDirectionalNumber {
    Polska("+48", "PLN") {
        @Override
        public boolean isInEurope() {
            return true;
        }
    },
    Niemcy("+49", "EURO") {
        @Override
        public boolean isInEurope() {
            return true;
        }
    },
    Australia("+61", "DOLLAR"){
        @Override
        public  boolean isInEurope() {
            return false;
        }
    };

    private String directional;
    private String currency;

    public boolean isInEurope() {
        return false;
    }

    CountryDirectionalNumber(String directional, String currency) {
        this.directional = directional;
        this.currency = currency;
    }
}
