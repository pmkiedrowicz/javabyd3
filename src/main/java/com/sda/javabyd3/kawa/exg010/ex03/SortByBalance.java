package com.sda.javabyd3.kawa.exg010.ex03;

import java.util.List;
import java.util.stream.Collectors;

public class SortByBalance {

public List<Person> sortingByBalance (List<Person> args){
    return args.stream().sorted((e1, e2) -> Double.compare(
            e1.accounts.stream().mapToDouble(f -> f.balance).sum(),
            e2.accounts.stream().mapToDouble(g -> g.balance).sum())).collect(Collectors.toList());
}
}
