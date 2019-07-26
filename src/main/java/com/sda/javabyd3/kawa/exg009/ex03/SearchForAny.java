package com.sda.javabyd3.kawa.exg009.ex03;

import java.util.List;
import java.util.stream.Collectors;

public class SearchForAny implements ContactSearcher {

    @Override
    public String searchFor(List<Contacts> list, String args) {
        String result;
        List<Contacts> checkSur;
        List<Contacts> checkEmail;
        List<Contacts> checkName;
        checkSur = list.stream().filter(e -> e.surname.contains(args)).collect(Collectors.toList());
        checkEmail = list.stream().filter(e -> e.emailAdress.contains(args)).collect(Collectors.toList());
        checkName = list.stream().filter(e -> e.name.contains(args)).collect(Collectors.toList());

        if (!checkSur.isEmpty()) result = checkSur.toString();
        else if (!checkName.isEmpty()) result = checkName.toString();
        else if (!checkEmail.isEmpty()) result = checkEmail.toString();
        else result = "dunno";

        return result;
    }
}
