package com.sda.javabyd3.mizi.exg001.Ogolne;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Random;

/**
 * Created by Michal Ziolecki.
 */
public class Zad5 {
    public static void main(String[] args) {
        Random random = new Random();
        List <Integer> listOfNumbers = new ArrayList <>();
        List<Integer> repeatedNumbers = new ArrayList <>(  );
        Integer randomNumber;
        Integer counter = 1;
        while (counter < 20) {
            randomNumber = random.nextInt( 10 ) ;
            if (listOfNumbers.contains( randomNumber ) == true) {
                Integer temporaryRepeatedValue = repeatedNumbers.get( listOfNumbers.indexOf( randomNumber ) );
                temporaryRepeatedValue += 1;
                repeatedNumbers.set( listOfNumbers.indexOf( randomNumber ), temporaryRepeatedValue);
               /* System.out.println( "liczba sie powtorzyla, w losowaniu nr " + counter
                        + " powtorzona liczba to " + randomNumber
                        + " ilosc powtorzen to " + temporaryRepeatedValue);*/
            } else {
                listOfNumbers.add( randomNumber );
                repeatedNumbers.add( 1 );
            }
            counter++;
        }

        System.out.println("\n ---Przed sortowaniem babelkowym");
        System.out.println(" lista liczb ");
        for(Integer item :  listOfNumbers)
        {
            System.out.print(" " + item);
        }

        System.out.println("\n lista powtorek ");
        for(Integer item :  repeatedNumbers)
        {
            System.out.print(" " + item);
        }

        //sortowanie babelkowe - dwoch tablic na raz :)
        for( int i =0; i < repeatedNumbers.size() ; i++ )
        {
            for(int j =0; j < repeatedNumbers.size()  ; j++ )
            {
                Integer temporaryContainerNumbers;
                Integer temporaryContainerRepeated;
                if(repeatedNumbers.get( i ) >= repeatedNumbers.get( j ))
                {
                    //nic
                }
                else
                {
                    temporaryContainerRepeated =  repeatedNumbers.get( i );
                    repeatedNumbers.set( i , repeatedNumbers.get( j ) );
                    repeatedNumbers.set( j, temporaryContainerRepeated );

                    temporaryContainerNumbers =  listOfNumbers.get( i );
                    listOfNumbers.set( i , listOfNumbers.get( j ) );
                    listOfNumbers.set( j, temporaryContainerNumbers );
                }
            }
        }

        System.out.println("\n ---Po sortowaniu babelkowym");
        System.out.println(" lista liczb ");
        for(Integer item :  listOfNumbers)
        {
            System.out.print(" " + item);
        }

        System.out.println("\n lista powtorek ");
        for(Integer item :  repeatedNumbers)
        {
            System.out.print(" " + item);
        }

        System.out.println("\n Trzy liczby z najwieksza liczba powtorek to :");
        for(int i = listOfNumbers.size()-1; i > listOfNumbers.size() - 4; i--)
        {
            System.out.print(" " + listOfNumbers.get( i ));
        }
    }
}
