package com.sda.javabyd3.mizi.exg001.Ogolne;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Michal Ziolecki.
 */
public class Zad7 {
    public static void main(String[] args) {
        Random random = new Random(  );
        List<Integer> list = new ArrayList <>(  );

        for(int i =0; i <20 ; i++)
        {
            list.add( random.nextInt( 1001 ) );
        }

        System.out.println("Nieposortowane: ");
        for(Integer item : list)
        {
            System.out.print(" " + item );
        }

        System.out.println("\n Posortowane babelkowo: ");
        for( int i =0; i < list.size() ; i++ )
        {
            for(int j =0; j < list.size()  ; j++ )
            {
                Integer temporaryContainerNumbers;
                if(list.get( i ) >= list.get( j ))
                {
                    //nic
                }
                else
                {
                    temporaryContainerNumbers =  list.get( i );
                    list.set( i , list.get( j ) );
                    list.set( j, temporaryContainerNumbers );
                }
            }
        }
        for(Integer item : list)
        {
            System.out.print(" " + item );
        }

    }
}
