package com.akash.conferenceRoom.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class FinRequestModel implements Serializable {
    public Object finData;

    @Override
    public String toString() {
        return "FinRequestModel{" +
                "finData=" + finData +
                '}';
    }
}
