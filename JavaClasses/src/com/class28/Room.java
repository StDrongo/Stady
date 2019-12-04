package com.class28;

public class Room extends Building{

	int roomNumber;
	
	Room(String address, int floor, int roomNumber){
		super(address, floor);
		this.roomNumber=roomNumber;
	}
	
	public void print() {
		System.out.println(address+" "+floor+" "+roomNumber);
	}
	public static void main(String[] args) {
		Room room=
		new Room("121 Test Driver", 10, 101);
		room.print();
	}
}
