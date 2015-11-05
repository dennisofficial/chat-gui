package me.dennis.chatgui.managers;

import java.awt.Graphics;

import me.dennis.chatgui.enums.RoomEnum;
import me.dennis.chatgui.types.Room;

public class RoomManager {

	public static Room room = RoomEnum.MAIN.room;
	
	public static void setRoom(RoomEnum room) {
		RoomManager.room = room.room;
	}

	public static void init() {
		room.init();
	}
	
	public static void update() {
		room.update();
	}
	
	public static void draw(Graphics g) {
		room.draw(g);
	}
	
}
