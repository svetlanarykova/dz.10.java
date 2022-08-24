package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void switchingToTheNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void switchingToTheNextStation1() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void switchingToThePreviousStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void SetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);

        int actual = radio.getCurrentStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void SetCurrentStationMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void CurrentStationMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void switchingToThePreviousStation2() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(2);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 3;

        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume4() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume5() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume6() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 6;

        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }


    @Test
    public void increaseVolumeMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(15);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void DecreaseVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        radio.DecreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 4;

        assertEquals(expected, actual);

    }

    @Test
    public void DecreaseVolumeMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        radio.DecreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void SetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(3);

        int actual = radio.getCurrentVolume();
        int expected = 3;

        assertEquals(expected, actual);

    }
}
