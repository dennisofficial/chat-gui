package me.dennis.chatgui.enums;

import me.dennis.chatgui.rooms.RoomChat;
import me.dennis.chatgui.rooms.RoomMain;
import me.dennis.chatgui.types.Room;

public enum RoomEnum {

	MAIN(new RoomMain()),
	CHAT(new RoomChat());
	
	public Room room;
	
	private RoomEnum(Room room) {
		this.room = room;
	}
	
}
