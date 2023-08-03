package com.akash.conferenceRoom.controller;

import com.akash.conferenceRoom.model.ConferenceRoom;
import com.akash.conferenceRoom.model.FinRequestModel;
import com.akash.conferenceRoom.model.FinResponseModel;
import com.akash.conferenceRoom.repo.ConferenceRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConferenceRoomController {


    private final ConferenceRoomRepo conferenceRoomRepo;

    @Autowired
    public ConferenceRoomController(ConferenceRoomRepo conferenceRoomRepo) {
        this.conferenceRoomRepo = conferenceRoomRepo;
    }


//    @RequestMapping(value = "/addBuilding", method = RequestMethod.POST)
//    public FinResponseModel addBuilding(FinRequestModel finRequestModel){
//
//    }
//
//    @RequestMapping(value = "/addFloor", method = RequestMethod.POST)
//    public FinResponseModel addFloor(FinRequestModel finRequestModel){
//
//    }

    @RequestMapping(value = "/addConferenceRoom", method = RequestMethod.POST)
    public String addConferenceRoom(@RequestBody FinRequestModel finRequestModel) throws Exception {
        System.out.println("In addConferenceRoom controler");
        System.out.println(finRequestModel);
        return this.conferenceRoomRepo.addConferenceRoom(finRequestModel);
    }

//    @RequestMapping(value = "/addBooking", method = RequestMethod.POST)
//    public FinResponseModel addBooking(@RequestBody FinRequestModel finRequestModel){
//
//    }
//
//    @RequestMapping(value = "/cancelBooking", method = RequestMethod.POST)
//    public FinResponseModel cancelBooking(@RequestBody FinRequestModel finRequestModel){
//
//    }
//
//    @RequestMapping(value = "/getBookingByUserId", method = RequestMethod.POST)
//    public FinResponseModel getBookingByUserId(@RequestBody FinRequestModel finRequestModel){
//
//    }

//    @RequestMapping(value = "/getConferenceRoomBySlotBuildingFloor", method = RequestMethod.POST)
//    public List<ConferenceRoom> getConferenceRoomBySlotBuildingFloor(@RequestBody FinRequestModel finRequestModel){
//
//    }

//    @RequestMapping(value = "/getConferenceRoomBySlotBuildingFloor", method = RequestMethod.POST)
//    public FinResponseModel getConferenceRoomBySlotBuildingFloorCapacity(@RequestBody FinRequestModel finRequestModel){
//
//    }



}
