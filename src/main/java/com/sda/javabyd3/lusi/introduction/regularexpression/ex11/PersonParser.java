package com.sda.javabyd3.lusi.introduction.regularexpression.ex11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonParser {
    private static final String NAME = "name";
    private static final String SURNAME = "surname";
    private static final String DATE_OF_BIRTH = "dateofbirth";
    private static final String SEX = "sex";
    private static final String NIN = "nin";

    private Pattern patternElements = Pattern.compile(String.format("^(?<%s>[a-zA-Zżółćęśąźń]+)\\s(?<%s>[a-zA-Zżółćęśąźń]+)\\s(?<%s>[MF])\\s(?<%s>\\d{2}\\.\\d{2}\\.\\d{4})\\s(?<%s>\\d{11})$",
            NAME, SURNAME, SEX, DATE_OF_BIRTH, NIN));

    public Optional<Person> parse(String line) {
        Optional<Person> result = Optional.empty();
        Matcher groupMatcher = patternElements.matcher(line);
        if (groupMatcher.matches() && groupMatcher.groupCount() == 5) {
            Person pesel = Person.builder()
                    .name(groupMatcher.group(NAME))
                    .surname(groupMatcher.group(SURNAME))
                    .dateOfBirth(LocalDate.parse(groupMatcher.group(DATE_OF_BIRTH), DateTimeFormatter.ofPattern("d.M.y")))
                    .sex(groupMatcher.group(SEX).charAt(0))
                    .NIN(groupMatcher.group(NIN)).build();
            result = Optional.of(pesel);

        }
        return result;
    }
}
