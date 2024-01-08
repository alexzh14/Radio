package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldSetCurrentStationNormalWay() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);

        int actual = radio.getCurrentStation();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);

        radio.setCurrentStation(20);
        int actual = radio.getCurrentStation();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);

        radio.setCurrentStation(-10);
        int actual = radio.getCurrentStation();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextNormalWay() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);

        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextAboveNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevNormalWay() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);

        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevBelowZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeNormalWay() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);

        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 16;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeNormalWay() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);

        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 14;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}