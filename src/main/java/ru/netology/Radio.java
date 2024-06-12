package ru.netology;

public class Radio {

    private int currentChannel;
    private int currentVolume;

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentChannel(int CurrentChannel) {

        if (CurrentChannel < 0) {
            return;
        }
        if (CurrentChannel > 9) {
            return;
        }
        this.currentChannel = CurrentChannel;
    }

    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume > 100) {
            return;
        }
        if (CurrentVolume < 0) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }

    public int nextChannel() {
        if (currentChannel < 9) {
            currentChannel = currentChannel + 1;
        } else {
            currentChannel = 0;
        }
        return currentChannel;
    }

    public int prevChannel() {
        if (currentChannel > 0) {
            currentChannel = currentChannel - 1;
        } else {
            currentChannel = 9;
        }
        return currentChannel;
    }

    public void volumeUp() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 0;
        }
    }

    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 10;
        }
    }

}


