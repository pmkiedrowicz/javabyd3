package com.sda.javabyd3.mizi.exg015.ex01;

/**
 * Created by Michal Ziolecki.
 */
public class Person015 {
    private String name;
    private String lastName;
    private EyeEnum eyeColor;
    private SexEnum sex;

    public Person015(String name, String lastName, EyeEnum eyeColor, SexEnum sex) {
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
                ", sex='" + sex + '\'' +
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

    public SexEnum getSex() {
        return sex;
    }
}
