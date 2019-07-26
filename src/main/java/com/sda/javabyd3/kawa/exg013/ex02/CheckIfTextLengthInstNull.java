package com.sda.javabyd3.kawa.exg013.ex02;

import java.util.Optional;

public class CheckIfTextLengthInstNull {

    public <T> int checkingIfTextLengthIsntNull (T value) {
        return Optional.ofNullable(value).map(e ->value.toString().length()).orElse(-1);
    }
}
