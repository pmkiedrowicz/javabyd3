package com.sda.javabyd3.lusi.introduction.regularexpression.ex11;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashMap;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private static HashMap<Integer, String> months = new HashMap<Integer, String>() {{
        put(1, "stycznia");
        put(2, "lutego");
        put(3, "marca");
        put(4, "kwietnia");
        put(5, "maja");
        put(6, "czerwca");
        put(7, "lipca");
        put(8, "sierpnia");
        put(9, "września");
        put(10, "października");
        put(11, "listopada");
        put(12, "grudnia");
    }};
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private Character sex;
    private String NIN;

    @Override
    public String toString() {
        return name + " " + surname + ", " +
                (sex.equals('M') ? "mężczyzna" : "kobieta") + " " +
                (sex.equals('M') ? "urodzony" : "urodzona") + " " +
                dateOfBirth.getDayOfMonth() + " " +
                months.get(dateOfBirth.getMonthValue()) + " " +
                dateOfBirth.getYear() +
                " roku o PESEL-u " +
                NIN;
    }
}
