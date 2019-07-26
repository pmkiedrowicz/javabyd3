package com.sda.javabyd3.urdu.exEnum;

import lombok.Getter;

@Getter
public enum CountryDirectionalNumber {

    Polska("+48","PLN"){
        @Override
        public boolean isInEurope(){
            return  true;
        }
    },
    Niemcy("+49", "Euro"){
        @Override
        public boolean isInEurope(){
            return  true;
        }
    },
    Australia("+61","Dolar");

    private String directional;
    private String currency;

   CountryDirectionalNumber(String directional, String currency){
        this.directional =directional;
        this.currency = currency;
    }
    public boolean isInEurope(){
       return  false;
    }
}
