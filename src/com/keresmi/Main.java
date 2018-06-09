package com.keresmi;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Meeting meeting1 = new Meeting("Java Workshops", 23, Month.JUNE, Day.MONDAY);
        Meeting meeting2 = new Meeting("Kotlin Workshops", 25, Month.JUNE, Day.WEDNESDAY);

        Schedule schedule = new Schedule();

        schedule.addMeeting(meeting1);
        schedule.addMeeting(meeting2);

        schedule.showAll();
    }
}
