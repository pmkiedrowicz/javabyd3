package com.sda.javabyd3.toki.tdd2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Tank {
    private int currentLevel;
    private int capacity;

    public Tank(int initialLevel, int capacity) {
        this.currentLevel = initialLevel;
        this.capacity = capacity;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull(){
        return capacity == currentLevel;
    }
}