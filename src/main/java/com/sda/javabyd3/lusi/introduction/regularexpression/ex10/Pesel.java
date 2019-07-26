package com.sda.javabyd3.lusi.introduction.regularexpression.ex10;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pesel {

    private String yearOfBirth;
    private String dayOfBirth;
    private String monthOfBirth;
    private String serialNumber;
    private sex sex;
    private byte controlNumber;

    @Override
    public String toString() {
        return "Data urodzenia:" + System.lineSeparator() +
                "dzień: " + dayOfBirth + System.lineSeparator() +
                "miesiąc: " + monthOfBirth + System.lineSeparator() +
                "rok: " + yearOfBirth + System.lineSeparator() +
                "Numer serii: " + serialNumber + System.lineSeparator() +
                "Płeć: " + sex.getSex() + System.lineSeparator() +
                "Cyfra kontrolna: " + controlNumber;
    }

    public enum sex {
        Man('M'),
        Woman('K');

        private Character sex;

        sex(Character sex) {
            this.sex = sex;
        }

        public Character getSex() {
            return sex;
        }
    }
}
