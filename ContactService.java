package main;

import java.util.ArrayList;

public class ContactService {
	
	ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	public void displayContactList() {
		for(int counter = 0; counter < contactList.size(); counter++) {
			System.out.println("\t Contact ID: " + contactList.get(counter).getContactId());
			System.out.println("\t First Name: " + contactList.get(counter).getFirstName());
			System.out.println("\t Last Name: " + contactList.get(counter).getLastName());
			System.out.println("\t Phone Number: " + contactList.get(counter).getPhoneNumber());
			System.out.println("\t Address: " + contactList.get(counter).getAddress());
		}
		
	}
	
	public void addContact(String firstName, String lastName, String phoneNumber, String Address) {
		Contact contact = new Contact(firstName, lastName, phoneNumber, Address);
		contactList.add(contact);
	}
	
	public void deleteContact(String contactId) {
		for(int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactId() == contactId) {
				contactList.remove(i);
			}
		}
	}
	
	
	public void setFirstName(String firstName, String contactId) {
		if (firstName == null || firstName.isBlank()) {
			firstName = "NULL";
		} else if(firstName.length() > 10) {
			firstName = firstName.substring(0, 10);
		} else {
			int val0 = Integer.parseInt(contactList.get(0).getContactId());
			for(int i = val0; i < contactList.size() + val0; i++) {
				//System.out.println(i);
				int val1 = Integer.parseInt(contactList.get(i).getContactId());
				int val2 = Integer.parseInt(contactId);
				if (val1 == val2) {
					contactList.get(i - val0).firstName = firstName;	
				}
			}
		}
		
	}
	
	public void setLastName(String lastName, String contactId) {
		if (lastName == null || lastName.isBlank()) {
			lastName = "NULL";
		} else if(lastName.length() > 10) {
			lastName = lastName.substring(0, 10);
		} else {
			//System.out.println(contactList.get(0).getContactId());
			int val0 = Integer.parseInt(contactList.get(0).getContactId());
			System.out.println(val0);
			for(int i = val0; i < contactList.size() + val0; i++) {
				//System.out.println(i);
				int val1 = Integer.parseInt(contactList.get(i - val0).getContactId());
				int val2 = Integer.parseInt(contactId);
				System.out.println(val1);
				System.out.println(val2);
				if (val1 == val2) {
					contactList.get(i - val0).lastName = lastName;	
				}
			}
		}
		
	}
	
	public void setPhoneNumber(String phoneNumber, String contactId) {
		if(phoneNumber == null || phoneNumber.isBlank() || phoneNumber.length() != 10) {
			phoneNumber = "5555555555";
		} else {
			int val0 = Integer.parseInt(contactList.get(0).getContactId());
			for(int i = val0; i < contactList.size() + val0; i++) {
				int val1 = Integer.parseInt(contactList.get(i - val0).getContactId());
				int val2 = Integer.parseInt(contactId);
				if (val1 == val2) {
					contactList.get(i - val0).phoneNumber = phoneNumber;	
				}
			}
				}
	}
	
	public void setAddress(String address, String contactId) {
		if (address == null || address.isBlank()) {
			address = "NULL";
		} else if(address.length() > 30) {
			address = address.substring(0, 30);
		} else {
			int val0 = Integer.parseInt(contactList.get(0).getContactId());
			for(int i = val0; i < contactList.size() + val0; i++) {
				int val1 = Integer.parseInt(contactList.get(i - val0).getContactId());
				int val2 = Integer.parseInt(contactId);
				if (val1 == val2) {
					contactList.get(i - val0).address = address;	
				}
			}
		}
		
	}
	
	public Contact getContact(String contactId) {
		return contactList.get(Integer.parseInt(contactId));
	}
}

