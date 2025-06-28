package main;

import java.util.concurrent.atomic.AtomicLong;

public class Contact {
	
	String firstName;
	String lastName;
	String phoneNumber;
	String address;
	private final String contactId;
	private static AtomicLong idGenerator = new AtomicLong();
	
	public Contact(String firstName, String lastName, String phoneNumber, String address) {
		
		if (firstName == null || firstName.isBlank()) {
			this.firstName = "NULL";
		} else if(firstName.length() > 10) {
			this.firstName = firstName.substring(0, 10);
		} else {
			this.firstName = firstName;
		}
		
		if (lastName == null || lastName.isBlank()) {
			this.lastName = "NULL";
		} else if(lastName.length() > 10) {
			this.lastName = lastName.substring(0, 10);
		} else {
			this.lastName = lastName;
		}
		
		if(phoneNumber == null || phoneNumber.isBlank() || phoneNumber.length() != 10) {
			this.phoneNumber = "5555555555";
		} else {
			this.phoneNumber = phoneNumber;
		}
		
		if (address == null || address.isBlank()) {
			this.address = "NULL";
		} else if(address.length() > 30) {
			this.address = address.substring(0, 30);
		} else {
			this.address = address;
		}
		
		this.contactId = String.valueOf(idGenerator.getAndIncrement());
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getContactId() {
		return contactId;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
}
