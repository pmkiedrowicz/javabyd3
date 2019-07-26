package com.sda.javabyd3.mizi.exg001.watki.ex05;

/**
 * Created by Michal Ziolecki.
 */
public class PersonZ5 {
    private String name;
    private String surname;
    private Integer age;

    public PersonZ5()
    {
        this.name = null;
        this.surname = null;
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{ \n \"name\": " + name + ", \n" +
                "\"surname\": " + surname + ", \n" +
                "\"age\": " + age + "\n }";
    }
}
