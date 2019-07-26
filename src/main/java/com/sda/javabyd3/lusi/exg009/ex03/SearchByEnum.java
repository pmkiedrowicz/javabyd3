package com.sda.javabyd3.lusi.exg009.ex03;

public enum SearchByEnum {
    NAME(1),
    LAST_NAME(2),
    EMAIL(3),
    TELEPHONE(4),
    ALL(5);

    private Integer searchValue;

    SearchByEnum(Integer value) {
        searchValue = value;
    }

    public static SearchByEnum forInt(int id) {
        for (SearchByEnum search : values()) {
            if (search.searchValue == id) {
                return search;
            }
        }
        throw new IllegalArgumentException("Invalid Day id: " + id);
    }
}
