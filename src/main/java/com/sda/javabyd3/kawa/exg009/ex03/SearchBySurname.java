package com.sda.javabyd3.kawa.exg009.ex03;

import java.util.List;
import java.util.stream.Collectors;

public class SearchBySurname implements ContactSearcher {

    @Override
    public String searchFor(List<Contacts> list, String args) {
        return list.stream().filter(e -> e.surname.equals(args)).collect(Collectors.toList()).toString();
    }
}
