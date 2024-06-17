public class Radio {
    private int amountStation = 10;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio(int amountStation) {
        this.maxStation = amountStation - 1;
        this.amountStation = amountStation;
    }

    public Radio() {
    }

    public int getAmountStation() {
        return amountStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > getMaxStation()) {
            return;
        }
        if (newCurrentStation < getMinStation()) {
            return;
        }
        currentStation = newCurrentStation;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > getMaxVolume()) {
            return;
        }
        if (newCurrentVolume < getMinVolume()) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void prevStation() {
        int targetStation;
        if (currentStation > getMinStation()) {
            targetStation = currentStation - 1;
        } else {
            targetStation = getMaxStation();
        }
        setCurrentStation(targetStation);
    }

    public void nextStation() {
        int targetStation;
        if (currentStation < getMaxStation()) {
            targetStation = currentStation + 1;
        } else {
            targetStation = getMinStation();
        }
        setCurrentStation(targetStation);
    }

    public void prevVolume() {
        int targetVolume;
        if (currentVolume > getMinVolume()) {
            targetVolume = currentVolume - 1;
            setCurrentVolume(targetVolume);
        } else {
            return;
        }
    }

    public void nextVolume() {
        int targetVolume;
        if (currentVolume < getMaxVolume()) {
            targetVolume = currentVolume + 1;
            setCurrentVolume(targetVolume);
        } else {
            return;
        }
    }
}
