package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void turnNextRadioStation() {
        Radio radio = new Radio();
        radio.setLastRadioStation(9);
        radio.setFirstRadioStation(0);
        // проверка валидных значений
        radio.setCurrentRadioStation(5);
        radio.turnNextRadioStation();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
        //проверка граничных значений
        radio.setCurrentRadioStation(8);
        radio.turnNextRadioStation();
        expected = 9;
        actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
        // проверка выхода за границу валидных значений
        radio.setCurrentRadioStation(9);
        radio.turnNextRadioStation();
        expected = 0;
        actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void turnPreviousRadioStation() {
        Radio radio = new Radio();
        radio.setLastRadioStation(9);
        radio.setFirstRadioStation(0);
        // проверка валидных значений
        radio.setCurrentRadioStation(7);
        radio.turnPreviousRadioStation();
        int expected = (6);
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
        // проверка граничных значений
        radio.setCurrentRadioStation(1);
        radio.turnPreviousRadioStation();
        expected = 0;
        actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
        // проверка выхода за границу валидных значений
        radio.setCurrentRadioStation(0);
        radio.turnPreviousRadioStation();
        expected = 9;
        actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void turnUp() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        // проверка валидных значений
        radio.setCurrentVolume(5);
        radio.turnUp();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        // проверка выхода за границу валидных значений
        radio.setCurrentVolume(10);
        radio.turnUp();
        expected = 10;
        actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void turnOff() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        // проверка валидных значений
        radio.setCurrentVolume(4);
        radio.turnOff();
        int expected = 3;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual);
        // проверка выхода за границу валидных значений
        radio.setCurrentVolume(0);
        radio.turnOff();
        expected = 0;
        actual = radio. getCurrentVolume();
        assertEquals(expected, actual);

    }
}