package com.sda.javabyd3.kawa.exg001.ogolne.ex01;


public class Main {
    public static void main(String[] args) {

        Scan3Numbers letsScanSomeNumbers = new Scan3Numbers();
        letsScanSomeNumbers.scaningNumbers();

        ShowHighestLowest letsDoIt = new ShowHighestLowest();
        letsDoIt.showHighest(letsScanSomeNumbers.firstNumber, letsScanSomeNumbers.secondNumber,
                letsScanSomeNumbers.thirdNumber);

        letsDoIt.showLowest(letsScanSomeNumbers.firstNumber, letsScanSomeNumbers.secondNumber,letsScanSomeNumbers.thirdNumber);

        letsDoIt.sumAllNumbers(letsScanSomeNumbers.firstNumber, letsScanSomeNumbers.secondNumber,
                letsScanSomeNumbers.thirdNumber);
    }
}
