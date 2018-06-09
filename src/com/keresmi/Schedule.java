package com.keresmi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by keresmi on 09.06.18.
 */
public class Schedule {

    private List<Meeting> meetings;

    public Schedule() {
        meetings = new ArrayList<>();
    }

    public void addMeeting(Meeting meeting) {
        meetings.add(meeting);
    }

    //Overloading
    public void addMeeting(String name, int dayOfMonth, Month month, Day day) {
        Meeting meeting = new Meeting(name, dayOfMonth, month, day);
        meetings.add(meeting);
    }

    public void showAll() {
        for (Meeting meeting : meetings) {
            System.out.println(meeting.toString());
        }
    }
}
