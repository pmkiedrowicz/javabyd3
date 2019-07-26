package com.sda.javabyd3.mizi.Zadania_dodatkowe001.ZadDod7;

import java.util.HashMap;
import java.util.stream.Stream;

/**
 * Created by Michal Ziolecki.
 */
public class Zad7SortedMachine {

    public String [][] SortmyJogger(String [][] myJogger)
    {
        // uwaga nie efektywny kod testowy :D ale dziala
        // triger do przerwania jesli juz jest posortowane
        boolean isSordted = false;
        for(int j = 0; j < myJogger.length; j++)
        {
            isSordted = true;
            for (int k = 1; k < myJogger.length - j; k++)
            {
                for (int i = 0; i < myJogger[k][1].length() - j; i++)
                {
                    if (myJogger[k][1].compareTo( myJogger[k - 1][1] ) < myJogger[k - 1][1].compareTo( myJogger[k][1] ))
                    {
                        String Temporary0 = myJogger[k][0];
                        String Temporary1 = myJogger[k][1];

                        myJogger[k][0] = myJogger[k - 1][0];
                        myJogger[k][1] = myJogger[k - 1][1];

                        myJogger[k - 1][0] = Temporary0;
                        myJogger[k - 1][1] = Temporary1;
                        isSordted = false;
                        break;
                    }
                }
            }
            if(isSordted == true) break;
        }
        return myJogger;
    }
}
