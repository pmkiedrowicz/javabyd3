package com.sda.javabyd3.toki.exg014.ex02;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Backwarder {

    public int addThemAll(int number){

        if (number<=0){
            return 0;
        }else{
            return number+addThemAll(number-1);
        }
    }
}
