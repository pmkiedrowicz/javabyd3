package com.sda.javabyd3.mizi.designPatternExcercise.ex05;

import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public interface Printer {
    void printToFile();
    String getPath();
    List<Message> getList();
}
