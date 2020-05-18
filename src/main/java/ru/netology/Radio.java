package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int firstRadioStation;
    private int lastRadioStation;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public int getFirstRadioStation() {
        return firstRadioStation;
    }

    public void setFirstRadioStation(int firstRadioStation) {
        this.firstRadioStation = firstRadioStation;
    }

    public int getLastRadioStation() {
        return lastRadioStation;
    }

    public void setLastRadioStation(int lastRadioStation) {
        this.lastRadioStation = lastRadioStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void turnNextRadioStation() {
        if (currentRadioStation == lastRadioStation) {
            currentRadioStation = firstRadioStation;
        } else {
            currentRadioStation++;
        }
    }

    public void turnPreviousRadioStation() {
        if (currentRadioStation == firstRadioStation) {
            currentRadioStation = lastRadioStation;
        } else {
            currentRadioStation--;
        }
    }

    public void turnUpVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void turnDownVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }
}









