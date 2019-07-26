package com.sda.javabyd3.jaja.enums.ex03;

import lombok.Getter;

@Getter
public enum Sex {
    male("Mężczyzna") {
        @Override
        public boolean isMale() {
            return true;
        }
    },
    female("Kobieta");


    private String inPolish;

    Sex(String inPolish) {
        this.inPolish = inPolish;
    }

    public boolean isMale() {
        return false;
    }
}


