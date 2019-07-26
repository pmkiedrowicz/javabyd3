package com.sda.javabyd3.lusi.introduction.regularexpression.ex09;

import static com.sda.javabyd3.lusi.introduction.Utils.displayTextOnConsole;

public class Main {

    private static final String text = "\"Drogi Marszałku, Wysoka Izbo. PKB rośnie. Z pełną odpowiedzialnością mogę\n" +
            "stwierdzić iż realizacja określonych zadań stanowionych przez organizację. Dalszy\n" +
            "rozwój jest ważne zadanie w większym stopniu tworzenie odpowiednich warunków\n" +
            "aktywizacji. Często niezauważanym szczegółem jest to, że zakres i rozwijanie\n" +
            "struktur pociąga za najważniejszy punkt naszych działań obierzemy praktykę, nie zaś\n" +
            "teorię, okazuje się jasne.\"";

    public static void main(String[] args) {
        TextStatistics textStatistics = new TextStatistics();
        Statistics statistics = textStatistics.getTextStatistics(text);
        displayTextOnConsole(statistics.toString());
    }
}
