package com.sda.javabyd3.lusi.introduction.unittests.ex24;

public class BmiCalculator {
    /**
     * Calculate BMI value
     *
     * @param weight Weight represented in kg
     * @param height Height represented in meters.
     * @return Calculated BMI value.
     */
    public float calculate(float weight, float height) {
        return Math.round((weight / (height * height)) * 100) / 100f;
    }
}
