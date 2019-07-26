package com.sda.javabyd3.toki.exg001.collections.ex03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int howLongIsQue = 10;
        //adding n names to the queue
        Scanner scanner = new Scanner(System.in);
        Queue<String> myQue = new LinkedList<String>();
        for (int i = 0; i < howLongIsQue; i++) {
            myQue.add(scanner.next());
        }

        //showing first and the last person of que
        System.out.println(myQue.peek());

        for (int i = 0; i < howLongIsQue-1; i++) {
        myQue.remove(myQue.peek());

        }

        System.out.println(myQue.peek());

    }
}
