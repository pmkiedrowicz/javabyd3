package com.sda.javabyd3.lusi.introduction.regularexpression.ex09;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class Statistics {
    private int numerOfWords;
    private int numberOfCharacters;
    private int avgWordLength;
    private int longestWord;
    private int shortestWord;

    @Override
    public String toString() {
        return "Ilość słów: " + numerOfWords + System.lineSeparator() +
                "Ilość wprowadzonych znaków" + numberOfCharacters + System.lineSeparator() +
                "Średnia długość wprowadzonego słowa:" + avgWordLength + System.lineSeparator() +
                "Najdłuższe słowo:" + longestWord + System.lineSeparator() +
                "Najkrótsze słowo:" + shortestWord;
    }
}
