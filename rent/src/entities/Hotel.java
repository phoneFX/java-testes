package entities;

public class Hotel {

	private String name;
	private String email;
	private int roomNumber;
	
	
	public Hotel(String name, String email, int roomNumber) {
		this.name = name;
		this.email = email;
		this.roomNumber = roomNumber;
	}
	
	
	public String toString() {
		return  roomNumber + ": " + name + ", " + email;
	}
	
	
	
}
