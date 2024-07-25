package Util;

public class Time_util {
    private long startTime;
    private long endTime;
    private boolean measuring;

    public Time_util() {
        this.startTime = 0;
        this.endTime = 0;
        this.measuring = false;
    }

    public void startMeasuring() {
        this.startTime = System.currentTimeMillis();
        this.measuring = true;
    }

    public long stopMeasuring() {
        if (!measuring) {
            throw new IllegalStateException("Measuring is not in progress.");
        }
        this.endTime = System.currentTimeMillis();
        this.measuring = false;
        return this.endTime - this.startTime;
    }
}

