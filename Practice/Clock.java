package Practice;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor
    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Method to display time
    public void displayTime() {
        System.out.printf("Time: %02d:%02d:%02d\n", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        // Create a Clock object and set time
        Clock clock = new Clock(10, 30, 45);

        // Display the time
        clock.displayTime();
    }
}
