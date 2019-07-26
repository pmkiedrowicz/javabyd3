package com.sda.javabyd3.kawa.exg013.ex01;

import java.util.Optional;

public class IsntNullChecker {

    public <T> boolean checkingIfObiectIsntNull (T value){
        return Optional.ofNullable(value).isPresent();
    }

}
