package entities;

import java.util.Date;

public class Cliente {

	
	
	private String name;
	private String email;
	private Date birthDate;
	
	public Cliente() {
	}

	public Cliente(String name, String email, Date bithDate) {
		this.name = name;
		this.email = email;
		this.birthDate = bithDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBithDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
	
	
	
}
