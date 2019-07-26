package com.sda.javabyd3.kawa.exg004.StreamAndLambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class AllExFrom01To07 {

    //Main
    public int streamingMax (ArrayList<Integer> args){
        return args.stream().max(Integer::compare).get();
    }
    //ex02
    public int streamingMin (ArrayList<Integer> args){
        return args.stream().min(Integer::compare).get();
    }
    //ex03
    public double streamingAvg (ArrayList<Integer> args){
        return args.stream().mapToInt(Integer::valueOf).average().getAsDouble();
    }
    //ex04
    public int streamingSum (ArrayList<Integer> args){
        return args.stream().mapToInt(Integer::valueOf).sum();
    }
    //ex05
    public int streamingQuantOfNumbsGreaterThanAvg (ArrayList<Integer> args){
        double avgNumb = args.stream().mapToInt(Integer::valueOf).average().getAsDouble();
        return args.stream().filter(e->e>avgNumb).collect(Collectors.toList()).size();
    }
    //ex06
    public double steamingAvgOf5NumbsGreaterThanAverageOfAllNumbs (ArrayList<Integer> args){
        double avgNumb = args.stream().mapToInt(Integer::valueOf).average().getAsDouble();
        List<Integer> listOfAvgNumbs = args.stream().sorted(Comparator.naturalOrder()).filter(e->e>avgNumb).limit(5)
                .collect
                (Collectors.toList());
        return listOfAvgNumbs.stream().mapToInt(Integer::valueOf).average().getAsDouble();
    }
    //ex07
    public List<Double> streamingSqrtOfAllNumbs (ArrayList<Integer> args){
        return args.stream().mapToDouble(e->Math.sqrt(e)).boxed().collect(Collectors.toList());
    }
}
