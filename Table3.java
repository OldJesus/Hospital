package hospital;

public class Table3 {
    private int day;
    private int month;
    private int year;
    private int time;

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getTime() {
        return time;
    }

    public Table3(int day, int month, int year, int time) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.time = time;
    }
}
