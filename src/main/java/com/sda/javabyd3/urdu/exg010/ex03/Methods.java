package com.sda.javabyd3.urdu.exg010.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {

    public Double sumBalanceAccount(List<BankAccount> account){
        double sum=0;
        for(int i=0 ; i<account.size();i++){

            sum += account.get(i).getBalance();
        }
        return sum;
    }

    public List<Person> sortOfAccountsBalance(List<Person> person){

        List<Person> sortedPerson = new ArrayList<>();
        sortedPerson=person;

       sortedPerson = sortedPerson.stream().sorted((k1,k2) -> Double.compare(
               k1.getAccounts().stream().mapToDouble(n -> n.getBalance()).sum(),
               k2.getAccounts().stream().mapToDouble(n -> n.getBalance()).sum()))
               .collect(Collectors.toList());

       sortedPerson.forEach(per -> System.out.println(per.toString() + "Suma środków na kontach to: "+ sumBalanceAccount(per.getAccounts())));

       return  sortedPerson;
    }
}
