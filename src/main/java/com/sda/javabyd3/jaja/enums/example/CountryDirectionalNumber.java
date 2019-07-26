package com.sda.javabyd3.jaja.enums.example;

import lombok.Getter;

@Getter
public enum CountryDirectionalNumber {
    Polska("+48", "Złoty") {
        @Override
        public boolean isInEurope() {
            return true;
        }},
    Niemcy("+49", "Euro") {
        @Override
        public boolean isInEurope() {
            return true;
        }},
    Australia("+61", "Dolar"){
        @Override
        public boolean isInEurope(){
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
