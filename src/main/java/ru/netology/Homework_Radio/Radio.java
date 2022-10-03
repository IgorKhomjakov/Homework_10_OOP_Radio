package ru.netology.Homework_Radio;

public class Radio {

    private int quantityRadioStation = 10;
    public int getQuantityRadioStation() {
        return quantityRadioStation;
    }

    private int minRadioStation = 0;
    private int maxRadioStation = quantityRadioStation - 1;
    private int currentRadioStation;

    public int getMinRadioStation;
    public int getMaxRadioStation;
    public int getCurrentRadioStation;


    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public int getMinVolume;
    public int getMaxVolume;
    public int getCurrentVolume;


    public int nextRadioStation() {
        if (getCurrentRadioStation < 9) {
            getCurrentRadioStation = getCurrentRadioStation + 1;
        } else {
            getCurrentRadioStation = minRadioStation;
        }
        return getCurrentRadioStation;
    }

    public int prevRadioStation() {
        if (getCurrentRadioStation > 0) {
            getCurrentRadioStation = getCurrentRadioStation - 1;
        } else {
            getCurrentRadioStation = maxRadioStation;
        }
        return getCurrentRadioStation;
    }

    public int increaseVolume() {
        if (getCurrentVolume < 10) {
            getCurrentVolume = getCurrentVolume + 1;
        } else {
            getCurrentVolume = maxVolume;
        }
        return getCurrentVolume;
    }

    public int decreaseVolume() {
        if (getCurrentVolume > 0) {
            getCurrentVolume = getCurrentVolume - 1;
        } else {
            getCurrentVolume = minVolume;
        }
        return getCurrentVolume;
    }

    public int getCurrentRadioStation() { return currentRadioStation; }

    public void setManualInputRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation  = newCurrentRadioStation;
    }

    public Radio(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
    }

    public Radio() {
        this.quantityRadioStation = 10;
    }


}