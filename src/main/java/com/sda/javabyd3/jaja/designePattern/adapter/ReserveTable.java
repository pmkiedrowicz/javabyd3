package com.sda.javabyd3.jaja.designePattern.adapter;

import java.time.LocalDateTime;
import java.util.Date;

public interface ReserveTable {

    boolean reserveTable(String person, LocalDateTime date, int numberOfPersons);
}
