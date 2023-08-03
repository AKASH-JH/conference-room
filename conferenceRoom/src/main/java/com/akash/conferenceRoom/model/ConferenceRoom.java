package com.akash.conferenceRoom.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConferenceRoom {

    String building;
    int floor;
    String conferenceRoomID;
    boolean booked;
    String bookedByUser;
    int startTime;
    int endTime;
    int capacity;



}
