package com.sda.javabyd3.mizi.exg015.ex03;

/**
 * Created by Michal Ziolecki.
 */
public enum SexEnum2 {
    FEMALE("kobieta"),
    MALE("mezczyna");

    String sex;

    SexEnum2(String sexOfPerson){
        this.sex = sexOfPerson;
    }

    public String getSex(){
        return sex;
    }


}
