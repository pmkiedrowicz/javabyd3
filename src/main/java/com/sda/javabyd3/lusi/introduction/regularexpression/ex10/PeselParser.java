package com.sda.javabyd3.lusi.introduction.regularexpression.ex10;

import com.sda.javabyd3.lusi.introduction.regularexpression.ex01.NumberValidator;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselParser {
    private static final String YEAR_GROUP_NAME = "year";
    private static final String MONTH_GROUP_NAME = "month";
    private static final String DAY_GROUP_NAME = "day";
    private static final String SN_GROUP_NAME = "serialNumber";
    private static final String SEX_GROUP_NAME = "sex";
    private static final String CRC_GROUP_NAME = "crc";

    private Pattern patternElements = Pattern.compile(String.format("^(?<%s>\\d{2})(?<%s>\\d{2})(?<%s>\\d{2})(?<%s>\\d{3}(?<%s>\\d))(?<%s>\\d)$",
            YEAR_GROUP_NAME, MONTH_GROUP_NAME, DAY_GROUP_NAME, SN_GROUP_NAME, SEX_GROUP_NAME, CRC_GROUP_NAME));

    public Optional<Pesel> parsePeselNumber(String peselString) {
        Optional<Pesel> result = Optional.empty();
        Matcher groupMatcher = patternElements.matcher(peselString);
        if (groupMatcher.matches() && groupMatcher.groupCount() == 6) {
            Pesel pesel = Pesel.builder()
                    .yearOfBirth(groupMatcher.group(YEAR_GROUP_NAME))
                    .monthOfBirth(groupMatcher.group(MONTH_GROUP_NAME))
                    .dayOfBirth(groupMatcher.group(DAY_GROUP_NAME))
                    .serialNumber(groupMatcher.group(SN_GROUP_NAME))
                    .sex(new NumberValidator().isEven(groupMatcher.group(SEX_GROUP_NAME)) ? Pesel.sex.Woman : Pesel.sex.Man)
                    .controlNumber(Byte.parseByte(groupMatcher.group(CRC_GROUP_NAME))).build();
            result = Optional.of(pesel);

        }
        return result;
    }
}
