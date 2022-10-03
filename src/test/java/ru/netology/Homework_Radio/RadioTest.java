package ru.netology.Homework_Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void shouldIncreaseNumberRadioStationAfterMax() {
        Radio radio = new Radio();

        radio.getCurrentRadioStation = 9;

        int expected = 0;
        int actual = radio.nextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseNumberRadioStationWithMin() {
        Radio radio = new Radio();

        radio.getCurrentRadioStation = 0;

        int expected = 1;
        int actual = radio.nextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseNumberRadioStationAfterMin() {
        Radio radio = new Radio();

        radio.getCurrentRadioStation = 0;

        int expected = 9;
        int actual = radio.prevRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseNumberRadioStationWithMax() {
        Radio radio = new Radio();

        radio.getCurrentRadioStation = 9;

        int expected = 8;
        int actual = radio.prevRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeWithMin() {
        Radio radio = new Radio();

        radio.getCurrentVolume = 0;

        int expected = 1;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAfterMax() {
        Radio radio = new Radio();

        radio.getCurrentVolume = 101;

        int expected = 100;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeWithMax() {
        Radio radio = new Radio();

        radio.getCurrentVolume = 100;

        int expected = 99;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeAfterMim() {
        Radio radio = new Radio();

        radio.getCurrentVolume = 0;

        int expected = 0;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldManualInputRadioStationBelowSetLimits() {
        Radio radio = new Radio();

        radio.setManualInputRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldManualInputRadioStationWithinSetLimits() {
        Radio radio = new Radio();

        radio.setManualInputRadioStation(4);

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldManualInputRadioStationAboveSetLimits() {
        Radio radio = new Radio();

        radio.setManualInputRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDesiredNumberRadioStations() {
        Radio radio = new Radio(14);

        Assertions.assertEquals(14, radio.getQuantityRadioStation());
    }

    @Test
    public void shouldDoNotSetDesiredNumberRadioStations() {
        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getQuantityRadioStation());
    }

}
