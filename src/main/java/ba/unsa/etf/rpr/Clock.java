package ba.unsa.etf.rpr;

import java.lang.StringBuilder;

public class Clock {
    private int hours, minutes, seconds;

    public Clock(int hours, int minutes, int seconds) {
        this.set(hours, minutes, seconds);
    }

    public void set(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void next() {
        this.seconds++;

        if (this.seconds == 60) { this.seconds = 0; this.minutes++; }
        if (this.minutes == 60) { this.minutes = 0; this.hours++; }
        if (this.hours == 24) { this.hours = 0; }
    }

    public void previous() {
        this.seconds--;

        if (this.seconds == -1) { this.seconds = 59; this.minutes--; }
        if (this.minutes == -1) { this.minutes = 59; this.hours--; }
        if (this.hours == -1) { this.hours = 23; }
    }

    public void move(int seconds) {
        if (seconds > 0) {
            for (int i = 0; i < seconds; i++) {
                this.next();
            }
        } else {
            for (int i = 0; i < -seconds; i++) {
                this.previous();
            }
        }
    }

    public String getString() {
        return new StringBuilder().append(getHours()).append(":").append(getMinutes()).append(":").append(getSeconds()).toString();
    }

    public int getHours() { return this.hours; }
    public int getMinutes() { return this.minutes; }
    public int getSeconds() { return this.seconds; }
}
