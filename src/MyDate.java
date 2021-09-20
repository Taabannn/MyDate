public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isValidDate(int day, int month, int year) {
        if (month > 0 && month <= 12 && year > 0 && year < 9999) {
            if (month > 0 && month < 7 && day > 0 && day <= 31)
                return true;
            else if (month > 7 && month < 12 && day > 0 && day <= 30)
                return true;
            else if (month == 12 && day > 0 && day <= 29)
                return true;
            else
                return false;
        }
            return false;
    }
}
