package com.sda.javabyd3.lusi.introduction.regularexpression.ex09;

import java.util.Arrays;

public class TextStatistics {

    public Statistics getTextStatistics(String text) {
        Statistics statistics = new Statistics();
        statistics.setNumberOfCharacters(text.length());
        text = text.replaceAll("[,.\"']", "");
        String[] words = text.split("\\s");
        statistics.setNumerOfWords(words.length);
        statistics.setAvgWordLength((int) Arrays.stream(words).mapToInt(w -> w.length()).average().getAsDouble());
        statistics.setLongestWord(Arrays.stream(words).mapToInt(w -> w.length()).max().getAsInt());
        statistics.setShortestWord(Arrays.stream(words).mapToInt(w -> w.length()).min().getAsInt());
        return statistics;
    }
}
