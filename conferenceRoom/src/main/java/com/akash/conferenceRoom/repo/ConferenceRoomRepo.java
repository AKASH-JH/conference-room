package com.akash.conferenceRoom.repo;

import com.akash.conferenceRoom.model.ConferenceRoom;
import com.akash.conferenceRoom.model.FinRequestModel;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConferenceRoomRepo {

    private final ObjectMapper objectMapper;

    List<ConferenceRoom> conferenceRoomsList = new ArrayList<>();

    public ConferenceRoomRepo(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public String addConferenceRoom(FinRequestModel finRequestModel) throws Exception {
        System.out.println("logging finRequestModel.getFinData()");
        System.out.println(this.objectMapper.convertValue(finRequestModel.getFinData(), new TypeReference<ConferenceRoom>() {}));
        ConferenceRoom conferenceRoom = this.objectMapper.convertValue(finRequestModel.getFinData(), new TypeReference<ConferenceRoom>() {});
        if (conferenceRoom.getConferenceRoomID() == null ||
        conferenceRoom.getBuilding() == null || conferenceRoom.getFloor() == 0){
            throw new Exception("Mandatory are missing");
        }
        conferenceRoom.setBooked(false);


        this.conferenceRoomsList.add(conferenceRoom);
        return " Successfully added conference room";
    }

    public String getConferenceRoomBySlotBuildingFloor(FinRequestModel finRequestModel) throws Exception {

//        JsonNode data= this.objectMapper.readTree((JsonParser) finRequestModel.finData);
//        conferenceRoomsList.stream()
//                .filter(i -> i.getBuilding().equals(data.get("building").asText()))
//                .filter(i-> i.getFloor() == (data.get("floor").asInt()));

        return "success";
    }
}
