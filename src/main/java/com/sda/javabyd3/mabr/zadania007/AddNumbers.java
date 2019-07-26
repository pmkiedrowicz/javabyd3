package com.sda.javabyd3.mabr.zadania007;

public class AddNumbers {
    public Integer addNumbers(int arg0, int... args) {
        Integer sum = arg0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }
}
