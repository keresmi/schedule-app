package com.keresmi;

/**
 * Created by keresmi on 09.06.18.
 */
public class Meeting {

    private String name;
    private int dayOfMonth;
    private Month month;
    private Day day;

    public Meeting(String name, int dayOfMonth, Month month, Day day) {
        this.name = name;
        this.dayOfMonth = dayOfMonth;
        this.month = month;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public Month getMonth() {
        return month;
    }

    public Day getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "name='" + name + '\'' +
                ", dayOfMonth=" + dayOfMonth +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
