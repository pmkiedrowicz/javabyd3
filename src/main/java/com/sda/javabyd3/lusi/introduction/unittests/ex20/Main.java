package com.sda.javabyd3.lusi.introduction.unittests.ex20;


import com.sda.javabyd3.lusi.introduction.Utils;

import static com.sda.javabyd3.lusi.introduction.Utils.displayTextOnConsole;

public class Main {
    public static void main(String[] args) {
        String word = Utils.displayTextAndGetValue("Podaj wyraz do sprawdzenia: ", false);
        WordStatistic wordStatistic = new WordStatistic();
        displayTextOnConsole(String.format("Ilość samogłosek: %s, Ilość spółgłosek: %s", wordStatistic.countVovels(word), wordStatistic.countConsonants(word)));
    }
}
