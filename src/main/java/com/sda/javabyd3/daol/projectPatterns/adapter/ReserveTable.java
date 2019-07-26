package com.sda.javabyd3.daol.projectPatterns.adapter;

import java.time.LocalDateTime;

public interface ReserveTable {
    boolean reserveTable(String person, LocalDateTime date, int numberOfPersons);
    }
