package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    Conditioner conditioner = new Conditioner();

    @Test
    void increaseCurrentTemperature() {
        conditioner.setMaxTemperature(35);
        conditioner.setCurrentTemperature(25);
        conditioner.increaseCurrentTemperature();
        int expected = 26;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    void IncreaseIfCurrentTemperatureIsMax() {
        conditioner.setMaxTemperature(35);
        conditioner.setCurrentTemperature(35);
        conditioner.increaseCurrentTemperature();
        int expected = 35;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    void IncreaseIfCurrentTemperatureIsCloseToMax() {
        conditioner.setMaxTemperature(35);
        conditioner.setCurrentTemperature(34);
        conditioner.increaseCurrentTemperature();
        int expected = 35;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    void IncreaseIfCurrentTemperatureIsAboveMax() {
        conditioner.setMaxTemperature(35);
        conditioner.setCurrentTemperature(38);
        conditioner.increaseCurrentTemperature();
        int expected = 38;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseCurrentTemperature() {
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(25);
        conditioner.decreaseCurrentTemperature();
        int expected = 24;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    void DecreaseIfCurrentTemperatureIsCloseToMin() {
        conditioner.setCurrentTemperature(11);
        conditioner.decreaseCurrentTemperature();
        int expected = 10;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    void DecreaseIfCurrentTemperatureIsMin() {
        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature();
        int expected = 10;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }
}