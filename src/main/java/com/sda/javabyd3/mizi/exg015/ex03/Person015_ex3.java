package com.sda.javabyd3.mizi.exg015.ex03;

import com.sda.javabyd3.mizi.exg015.ex01.EyeEnum;
import com.sda.javabyd3.mizi.exg015.ex01.SexEnum;

/**
 * Created by Michal Ziolecki.
 */
public class Person015_ex3 {
    private String name;
    private String lastName;
    private EyeEnum eyeColor;
    private SexEnum2 sex;

    public Person015_ex3(String name, String lastName, EyeEnum eyeColor, SexEnum2 sex) {
        this.name = name;
        this.lastName = lastName;
        this.eyeColor = eyeColor;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person015{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", sex='" + sex.getSex() + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public EyeEnum getEyeColor() {
        return eyeColor;
    }

    public SexEnum2 getSex() {
        return sex;
    }
}
