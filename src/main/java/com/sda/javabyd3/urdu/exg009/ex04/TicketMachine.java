package com.sda.javabyd3.urdu.exg009.ex04;

public class TicketMachine {

    public String ticketMachine(int tickets, int money) {
        int charge = tickets * 4;
        String result="";
        if (charge > money) {
            return "Za mała kwota.";
        } else {
            int change = money - charge;
            if (change == 0) {
                return "Ilość kupionych biletów to " + tickets + " brak reszty do wydania.";
            } else {

                result= returnChange(change);
            }
        }
        return "Ilość kupionych biletów: " + tickets +
                " Zwrócona reszta to: " + result;

    }

    public String returnChange(int charge) {
        String result = "";
        int temporary;
        int tempCharge = charge;

        if (tempCharge >= 200) {
            temporary = tempCharge / 200;
            result =result+ "200*" + temporary;
            tempCharge = tempCharge - (200 * temporary);
                if ( tempCharge>0) {result=result+"+";}
                    else result=result+" PLN";
        }
          if (tempCharge >= 100) {
              temporary = tempCharge / 100;
              result = result + " 100*" + temporary;
              tempCharge = tempCharge - (100 * temporary);
              if ( tempCharge>0) {result=result+"+";}
              else result=result+" PLN";
        }
               if (tempCharge >= 50) {
                temporary = tempCharge / 50;
                result = result + " 50*" + temporary;
                tempCharge = tempCharge - (50 * temporary);
                   if ( tempCharge>0) {result=result+"+";}
                   else result=result+" PLN";
        }
             if (tempCharge >= 20) {
                  temporary = tempCharge / 20;
                  result = result + " 20*" + temporary;
                  tempCharge = tempCharge - (20 * temporary);
                 if ( tempCharge>0) {result=result+"+";}
                 else result=result+" PLN";
        }
                if (tempCharge >= 10) {
                    temporary = tempCharge / 10;
                    result = result + " 10*" + temporary;
                    tempCharge = tempCharge - (10 * temporary);
                    if ( tempCharge>0) {result=result+"+";}
                    else result=result+" PLN";
                }
                    if (tempCharge >= 5) {
                        temporary = tempCharge / 5;
                        result = result + " 5*" + temporary;
                        tempCharge = tempCharge - (5 * temporary);
                        if ( tempCharge>0) {result=result+"+";}
                        else result=result+" PLN";
                    }
                        if (tempCharge >= 2) {
                            temporary = tempCharge / 2;
                            result = result + " 2*" + temporary;
                            tempCharge = tempCharge - (2 * temporary);
                            if ( tempCharge>0) {result=result+"+";}
                            else result=result+" PLN";
                        }

                            if (tempCharge >= 1) {
                                temporary = tempCharge / 1;
                                result = result + " 1*" + temporary ;
                                tempCharge = tempCharge - (1 * temporary);
                                if ( tempCharge>0) {result=result+"+";}
                                else result=result+" PLN";
                            }

        return result;
    }


}
