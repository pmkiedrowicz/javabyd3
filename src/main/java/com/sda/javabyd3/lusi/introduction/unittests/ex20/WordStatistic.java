package com.sda.javabyd3.lusi.introduction.unittests.ex20;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordStatistic {
    private static final Set<Character> vovels = Stream.of('a', 'e', 'y', 'u', 'i', 'o', 'ó', 'ą', 'ę').collect(Collectors.toSet());
    private static final Set<Character> consonants = Stream.of('q', 'w', 'r', 't', 'p', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm', 'ł', 'ć', 'ż', 'ź', 'ń', 'ś').collect(Collectors.toSet());

    public int countVovels(String text) {
        return countCharacters(text, vovels);
    }

    public int countConsonants(String text) {
        return countCharacters(text, consonants);
    }

    private int countCharacters(String text, Set<Character> pattern) {
        int result = 0;
        for (int i = 0; i < text.length(); i++) {
            result += pattern.contains(text.toLowerCase().charAt(i)) ? 1 : 0;
        }
        return result;
    }
}
