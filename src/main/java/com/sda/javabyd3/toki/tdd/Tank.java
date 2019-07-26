//package com.sda.javabyd3.toki.tdd;
//
//import lombok.*;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Tank {
//    private boolean isItFull;
//    private boolean couldFill;
//    private int status;
//    private int max;
//
//    public Tank(int status, int max) {
//        this.status = status;
//        this.max = max;
//    }
//
//    public boolean isFull() {
//        if (status == max) {
//            isItFull = true;
//        } else {
//            isItFull = false;
//        }
//
//        return isItFull;
//    }
//
//    public boolean tankUserValue() {
//        if (status <= max) {
//            couldFill = true;
//        } else {
//            couldFill = false;
//        }
//        return couldFill;
//    }
//}
