package ru.netology.Homework_Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void shouldIncreaseNumberRadioStationAfterMax() {
        Radio radio = new Radio();

        radio.currentRadioStation = 9;

        int expected = 0;
        int actual = radio.nextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseNumberRadioStationWithMin() {
        Radio radio = new Radio();

        radio.currentRadioStation = 0;

        int expected = 1;
        int actual = radio.nextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseNumberRadioStationAfterMin() {
        Radio radio = new Radio();

        radio.currentRadioStation = 0;

        int expected = 9;
        int actual = radio.prevRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseNumberRadioStationWithMax() {
        Radio radio = new Radio();

        radio.currentRadioStation = 9;

        int expected = 8;
        int actual = radio.prevRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeWithMin() {
        Radio radio = new Radio();

        radio.currentVolume = 0;

        int expected = 1;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAfterMax() {
        Radio radio = new Radio();

        radio.currentVolume = 11;

        int expected = 10;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeWithMax() {
        Radio radio = new Radio();

        radio.currentVolume = 10;

        int expected = 9;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeAfterMim() {
        Radio radio = new Radio();

        radio.currentVolume = 0;

        int expected = 0;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }
}
