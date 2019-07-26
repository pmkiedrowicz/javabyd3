package com.sda.javabyd3.kawa.exg009.ex03;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByPhoneNumber implements ContactSearcher {

    @Override
    public String searchFor(List<Contacts> list, String args) {
        long toNumb = Long.parseLong(args);
        return list.stream().filter(e -> e.phoneNumber == (toNumb)).collect(Collectors.toList()).toString();
    }
}
