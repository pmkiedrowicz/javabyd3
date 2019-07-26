package com.sda.javabyd3.mizi.exg009.ex04;

/**
 * Created by Michal Ziolecki.
 */
public class CashMachine {

    int costOfTicket;


    public CashMachine()
    {
        this.costOfTicket = 4;
    }

    public void returnTheRestOfCash(int numberOfTicket, int Money) {

        int cost = numberOfTicket*4;
        int rest = Money - cost;
        int twohundred = 0, onehundred = 0, fifty = 0, twenty = 0, ten = 0, five = 0, two = 0, one = 0;
        while(rest > 0)
        {
            if(rest >= 200 ) {
                twohundred++;
                rest = rest - 200;
                continue;
            }
            else if(rest >= 100 ) {
                onehundred++;
                rest = rest - 100;
                continue;
            }
            else if(rest >= 50 ){
                fifty++;
                rest = rest - 50;
                continue;
            }
            else if(rest >= 20 ){
                twenty++;
                rest = rest - 20;
                continue;
            }
            else if(rest  >= 10 ){
                ten++;
                rest = rest - 10;
                continue;
            }
            else if(rest >= 5 ){
                five++;
                rest = rest - 5;
                continue;
            }
            else  if(rest >= 2 ){
                two++;
                rest = rest - 2;
                continue;
            }
            else if(rest == 1 ){
                one++;
                rest = rest - 1;
                continue;
            }
            System.out.println(" stn inputmoney " + rest);
        }
        System.out.println("Suma reszty to: a = 200*" + twohundred
                + " b = 100*" + onehundred + " c = 50*" + fifty + " d = 20*"
                + twenty + " e = 10*" + ten + " f = 5*" + five + " g = 2*"
                + two + " h = 1*" +one);
    }
}
