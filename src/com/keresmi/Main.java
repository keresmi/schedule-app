package com.keresmi;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Address address = new Address("Mogilska", "Cracow", "164-70", 111);
        Meeting meeting1 = new Meeting("Java Workshops", 23, Month.JUNE, Day.MONDAY, address);
        Meeting meeting2 = new Meeting("Kotlin Workshops", 25, Month.JUNE, Day.WEDNESDAY);

        Schedule schedule = new Schedule();

        schedule.addMeeting(meeting1);
        schedule.addMeeting(meeting2);
        schedule.addMeeting("Python workshops", 12, Month.SEPTEMBER, Day.MONDAY, address);

        schedule.showAll();

        System.out.println("Meetings count: " + schedule.meetingsCount());
    }
}
