public class Radio {
    private int currentVolume;
    private int currentStation;

    public void increaseVolume() {
        if (currentVolume >= 100) {
            return;
        }
        int target = currentVolume + 1;
        currentVolume = target;
    }

    public void increaseStation() {
        if (currentStation >= 9) {
            int beginning = 0;
            currentStation = beginning;
            return;
        }
        int target = currentStation + 1;
        currentStation = target;
    }

    public void decreaseVolume() {
        if (currentVolume <= 0) {
            return;
        }
        int target = currentVolume - 1;
        currentVolume = target;
    }

    public void decreaseStation() {
        if (currentStation <= 0) {
            int maxstation = 9;
            currentStation = maxstation;
            return;
        }
        int target = currentStation - 1;
        currentStation = target;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }
}