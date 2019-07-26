package com.sda.javabyd3.kawa.exg014.ex02;

public class NSumerForEx02 {
    public int summingNTimes(int number) {
        if (number > 0) {
            return number + summingNTimes(number - 1);
        } else return 0;
    }

    public int summingNTimesWithForLoop(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        return result;
    }
}
