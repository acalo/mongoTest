package com.openjaw.mongoTest.domain.openjaw;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rooms {
	private List<Room> 	Room;

	public List<Room> getRoom() {
		return Room;
	}

	public void setRoom(List<Room> room) {
		Room = room;
	}
	
	
}
