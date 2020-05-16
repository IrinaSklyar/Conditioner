package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);

        conditioner.setCurrentTemperature(25);
        conditioner.increaseCurrentTemperature();
        int expected = 26;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);

        conditioner.setCurrentTemperature(35);
        conditioner.increaseCurrentTemperature();
        expected = 35;
        actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);

        conditioner.setCurrentTemperature(34);
        conditioner.increaseCurrentTemperature();
        expected = 35;
        actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);

        conditioner.setCurrentTemperature(25);
        conditioner.decreaseCurrentTemperature();
        int expected = 24;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);

        conditioner.setCurrentTemperature(11);
        conditioner.decreaseCurrentTemperature();
        expected = 10;
        actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);

        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature();
        expected = 10;
        actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }
}