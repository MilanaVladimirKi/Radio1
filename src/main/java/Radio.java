public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void prevStation() {
        int targetStation;
        if (currentStation > 0) {
            targetStation = currentStation - 1;
        } else {
            targetStation = 9;
        }
        setCurrentStation(targetStation);
    }

    public void nextStation() {
        int targetStation;
        if (currentStation < 9) {
            targetStation = currentStation + 1;
        } else {
            targetStation = 0;
        }
        setCurrentStation(targetStation);
    }

    public void prevVolume() {
        int targetVolume;
        if (currentVolume > 0) {
            targetVolume = currentVolume - 1;
            setCurrentVolume(targetVolume);
        } else {
            return;
        }
    }

    public void nextVolume() {
        int targetVolume;
        if (currentVolume < 10) {
            targetVolume = currentVolume + 1;
            setCurrentVolume(targetVolume);
        } else {
            return;
        }
    }
}
