package com.sda.javabyd3.mizi.Zadania_dodatkowe001.ZadDod5Kolko_Krzyzyk;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class CircleAndCross {

    private Scanner scanner;
    private String[][] cellsOfField;
    private boolean endOfGameFlag;
    private int x;
    private int y;

    public CircleAndCross(Integer size)
    {
        this.cellsOfField = new String[size][size];
        this.endOfGameFlag = false;
        this.scanner = new Scanner( System.in );
        fileCellsOfTable();
    }

    private  void fileCellsOfTable()
    {
        for(int i = 0; i < cellsOfField.length; i++)
        {
            for(int j = 0; j < cellsOfField.length; j++)
            {
                cellsOfField[i][j] = " ";
            }
        }
    }

    public void mainLoopGame(){
        printGameField();
        for(int turn = 0; turn < cellsOfField.length*cellsOfField.length; turn ++)
        {
            setCoordinates( turn );
            printGameField();
            endOfGameFlag = checkStatusOfGame();
            //wychodze z petli gry jesli w pionie lub poziomie jest zaliczone
            if(endOfGameFlag == true) break;
        }
        if(endOfGameFlag == false) System.out.println("Niestety nikt nie wygral :)");
    }

    private void setCoordinates(int turn)
    {
        // ustalanie wspolrzednych
        System.out.println("Nowa runda! ");
        if(turn % 2 == 0) {
            //jego znak to "X"
            while(true)
            {
                System.out.println("Teraz zawodnik X");
                System.out.println("Graczu 1. - podaj wspolrzedna x: ");
                x = scanner.nextInt();
                System.out.println("Graczu 1. - podaj wspolrzedna y: ");
                y = scanner.nextInt();
                if( (x < cellsOfField.length && x >=0) && (y < cellsOfField.length && y >=0)
                        && cellsOfField[x][y].equals( " " ) == true )
                {
                    cellsOfField[x][y] = "X";
                    break;
                }
                else{
                    System.out.println(" Podales nieprawidlowe wspolrzedne ! Podaj je jeszcze raz");
                }
            }

        }
        else{
            //jego znak do "O"
            while(true)
            {
                System.out.println("Teraz zawodnik X");
                System.out.println("Graczu 2. - podaj wspolrzedna x: ");
                x = scanner.nextInt();
                System.out.println("Graczu 2. - podaj wspolrzedna y: ");
                y = scanner.nextInt();
                if( (x < cellsOfField.length && x >=0) && (y < cellsOfField.length && y >=0)
                        && cellsOfField[x][y].equals( " " ) == true )
                {
                    cellsOfField[x][y] = "O";
                    break;
                }
                else{
                    System.out.println(" Podales nieprawidlowe wspolrzedne ! Podaj je jeszcze raz");
                }
            }
        }
    }

    private void printGameField() {

        for(int j = 0; j < cellsOfField.length; j++)
        {
            if(j ==0 ) System.out.print("x\\y|");
            System.out.print(" " + j + " |");
        }
        System.out.print("\n");
        for(int j = 0; j < cellsOfField.length + 1; j++)
        {
            System.out.print("--- ");
        }
        System.out.print("\n");
        for(int i = 0; i < cellsOfField.length; i++)
        {
            System.out.print(" " + i + " |");
            for(int j = 0; j < cellsOfField.length; j++)
            {
                System.out.print(" " + cellsOfField[i][j] + " |");
            }
            System.out.print("\n");
            for(int j = 0; j < cellsOfField.length + 1; j++)
            {
                System.out.print("--- ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }


    private boolean checkStatusOfGame()
    {
        boolean endOfGame = false;
        // sprawdzanie warunku w grze - kolumny pion i poziom - sprawdzanie uniwersalne
        for(int i = 0; i < cellsOfField.length; i++)
        {
            String testColumn = "";
            String testVerse = "";
            int columnCounterX = 0;
            int columnCounterO = 0;
            int verseCounterX = 0;
            int verseCounterO = 0;
            for(int j = 0; j < cellsOfField.length; j++)
            {
                //---- test kolumn
                testColumn = cellsOfField[i][j];
                if(testColumn.equals( "X" ) == true && testColumn.length() > 0 ) columnCounterX ++;
                else if(testColumn.equals( "O" ) == true && testColumn.length() > 0 ) columnCounterO ++;
                //---- test wierszy
                testVerse = cellsOfField[j][i];
                if(testVerse.equals( "X" ) == true && testVerse.length() > 0 ) verseCounterX ++;
                else if(testVerse.equals( "O" ) == true && testVerse.length() > 0 ) verseCounterO ++;

            }
            //----koncowa weryfikacja kolumn i wierszy
            if(columnCounterX == cellsOfField.length || verseCounterX == cellsOfField.length) {
                System.out.println("Zawodnik X wygrywa!");
                endOfGame = true;
                break;
            }
            if(columnCounterO == cellsOfField.length || verseCounterO == cellsOfField.length) {
                System.out.println("Zawodnik O wygrywa!");
                endOfGame = true;
                break;
            }
        }

        //sprawdzenie dla skosow - uniwersalnie
        int varabialeYrightLeft = cellsOfField.length - 1;
        int LeftRightCounterX = 0;
        int LeftRightCounterO = 0;
        int RightLeftCounterX = 0;
        int RightLeftCounterO = 0;
        for(int i = 0; i < cellsOfField.length; i++)
        {
            String testLeftRight = "";
            String testRightLeft = "";
            //---- test skosu od lewej do prawej
            testLeftRight = cellsOfField[i][i];
            if(testLeftRight.equals( "X" ) == true && testLeftRight.length() > 0 ) LeftRightCounterX ++;
            else if(testLeftRight.equals( "O" ) == true && testLeftRight.length() > 0 ) LeftRightCounterO ++;
            //---- test skosu od prawej do lewej
            testRightLeft = cellsOfField[i][varabialeYrightLeft];
            if(testRightLeft.equals( "X" ) == true && testRightLeft.length() > 0 ) RightLeftCounterX ++;
            else if(testRightLeft.equals( "O" ) == true && testRightLeft.length() > 0 ) RightLeftCounterO ++;

            //----koncowa weryfikacja kolumn i wierszy
            if(LeftRightCounterX == cellsOfField.length || RightLeftCounterX  == cellsOfField.length) {
                System.out.println("Zawodnik X wygrywa!");
                endOfGame = true;
                break;
            }
            if(LeftRightCounterO == cellsOfField.length || RightLeftCounterO  == cellsOfField.length) {
                System.out.println("Zawodnik O wygrywa!");
                endOfGame = true;
                break;
            }
            varabialeYrightLeft --;
        }

        return endOfGame;
    }
}
