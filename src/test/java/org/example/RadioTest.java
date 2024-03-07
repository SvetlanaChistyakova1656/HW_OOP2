package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void checkIncreaseVolume() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(50);
        int expectedVolume = 51;
        radio.increaseVolume();
        Assertions.assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    @Test
    public void checkDecreaseVolume() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(50);
        int expectedVolume = 49;
        radio.decreaseVolume();
        Assertions.assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    @Test
    public void checkIncreaseVolumeAboveMax() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(100);
        int expectedVolume = 100;
        radio.increaseVolume();
        Assertions.assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    @Test
    public void checkIncreaseVolumeAboveMin() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(0);
        int expectedVolume = 0;
        radio.decreaseVolume();
        Assertions.assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    @Test
    public void checkSetCurrentVolumeOutsideAbove() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(101);
        int expectedVolume = 0;
        Assertions.assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    @Test
    public void checkSetCurrentVolumeOutsideBelow() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(-1);
        int expectedVolume = 0;
        Assertions.assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    @Test
    public void checkSetCurrentRadioStationNumber() {
        Radio radio = new Radio(10);
        int expected = 5;
        radio.setCurrentRadioStationNumber(5);
        Assertions.assertEquals(expected, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void checkSetCurrentRadioStationNumberOutsideAbove() {
        Radio radio = new Radio(10);
        int expected = 0;
        radio.setCurrentRadioStationNumber(10);
        Assertions.assertEquals(expected, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void checkSetCurrentRadioStationNumberOutsideBelow() {
        Radio radio = new Radio(9);
        int expected = 0;
        radio.setCurrentRadioStationNumber(-1);
        Assertions.assertEquals(expected, radio.getCurrentRadioStationNumber());
    }


    @Test
    public void checkNextRadioStation() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStationNumber(8);
        radio.nextRadioStation();
        Assertions.assertEquals(9, radio.getCurrentRadioStationNumber());
        radio.nextRadioStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void testPrevRadioStationMultipleTimes() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStationNumber(3);
        radio.prevRadioStation();
        radio.prevRadioStation();
        radio.prevRadioStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void checkPrevRadioStation() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStationNumber(1);
        radio.prevRadioStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStationNumber());
        radio.prevRadioStation();
        Assertions.assertEquals(9, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void checkMaxRadioStationNumber() {
        Radio radio = new Radio();
        Assertions.assertEquals(9, radio.getMaxRadioStationNumber());
    }

}