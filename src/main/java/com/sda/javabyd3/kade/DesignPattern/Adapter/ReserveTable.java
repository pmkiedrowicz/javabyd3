package com.sda.javabyd3.kade.DesignPattern.Adapter;

import java.time.LocalDateTime;
import java.util.Date;

public interface ReserveTable {

    boolean reserveTable(String person, LocalDateTime dateTime, int numberOfPersons);

}
