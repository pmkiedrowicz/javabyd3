package com.sda.javabyd3.toki.exg009general.ex04;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
public class ExchangeMachine {
    private int temp = 0;

    public void exchangeMachine(int numberOfTickets, int inputCash) {
        Map resultMap = new HashMap<>();
        int ticketsCost = numberOfTickets * 4;
        int modulo = inputCash - ticketsCost;

        resultMap.put(1, 0);
        resultMap.put(2, 0);
        resultMap.put(5, 0);
        resultMap.put(10, 0);
        resultMap.put(20, 0);
        resultMap.put(50, 0);
        resultMap.put(100, 0);
        resultMap.put(200, 0);

        while (modulo > 0) {
            while (modulo >= 200) {
                modulo -= 200;
                temp += 1;
                resultMap.replace(200, temp);
                continue;
            }
            temp = 0;
            while (modulo >= 100) {
                modulo -= 100;
                temp += 1;
                resultMap.replace(100, temp);
                continue;
            }
            temp = 0;
            while (modulo >= 50) {
                modulo -= 50;
                temp += 1;
                resultMap.replace(50, temp);
                continue;
            }
            temp = 0;
            while (modulo >= 20) {
                modulo -= 20;
                temp += 1;
                resultMap.replace(20, temp);
                continue;
            }
            temp = 0;
            while (modulo >= 10) {
                modulo -= 10;
                temp += 1;
                resultMap.replace(10, temp);
                continue;
            }
            temp = 0;
            while (modulo >= 5) {
                modulo -= 5;
                temp += 1;
                resultMap.replace(5, temp);
                continue;
            }
            temp = 0;
            while (modulo >= 2) {
                modulo -= 2;
                temp += 1;
                resultMap.replace(2, temp);
                continue;
            }
            temp = 0;
            while (modulo >= 1) {
                modulo -= 1;
                temp += 1;
                resultMap.replace(1, temp);
                continue;
            }
            break;
        }

        System.out.println("The rest is: \n200zl sztuk " + resultMap.get(200) +
                "\n100zl sztuk " + resultMap.get(100) +
                "\n50zl sztuk " + resultMap.get(50) +
                "\n20zl sztuk " + resultMap.get(20) +
                "\n10zl sztuk " + resultMap.get(10) +
                "\n5zl sztuk " + resultMap.get(5) +
                "\n2zl sztuk " + resultMap.get(2) +
                "\n1zl sztuk " + resultMap.get(1));

    }
}
