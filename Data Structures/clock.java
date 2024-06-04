
class clock {
    private int hours, minute, seconds;
    private boolean isvalid;
    private String ampm_mode;

    public clock(int h, int m, int s) {
        hours = h;
        minute = m;
        seconds = s;
        this.isvalid = checkValidity();
        this.ampm_mode = setampm_mode();
    }

    private boolean checkValidity() {
        return (hours >= 0 && hours < 24) && (minute >= 0 && minute < 60) && (seconds >= 0 && seconds < 60);
    }

    private String setampm_mode() {
        return hours < 12 ? "AM" : "PM";
    }

    public boolean isvalid() {
        return isvalid;
    }

    public String getampm_mode() {
        return ampm_mode;
    }

    public static void main(String[] args) {
        clock ob = new clock(10, 59, 45);
        System.out.println("Is valid time : " + ob.isvalid());
        System.out.println("AM/PM mode : " + ob.getampm_mode());
    }

}
