package com.sda.javabyd3.mizi.designPattern.adapter;

import java.time.LocalDateTime;

public interface ReserveTable {
    boolean reserveTable(String person, LocalDateTime date, int numberOfPersons);
}
