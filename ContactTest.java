package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Contact;

class ContactTest {
	
	@Test
	@DisplayName("Contact ID cannot have more than 10 characters")
	void testContactIDWithMoreThanTenCharacters() {
		Contact contact = new Contact("FirstName", "LastName", "0123456789", "Address");
		if(contact.getContactId().length() > 10) {
			fail("Contact ID has more than 10 characters");
		}
	}
	
	@Test
	@DisplayName("First name cannot have more than 10 characters")
	void testFirstNameWithMoreThanTenCharacters() {
		Contact contact = new Contact("01234567890", "LastName", "0123456789", "Address");
		if(contact.getFirstName().length() > 10) {
			fail("First name has more than 10 characters");
		}
	}
	
	@Test
	@DisplayName("Last name cannot have more than 10 characters")
	void testLasttNameWithMoreThanTenCharacters() {
		Contact contact = new Contact("FirstName", "01234567890", "0123456789", "Address");
		if(contact.getLastName().length() > 10) {
			fail("Last name has more than 10 characters");
		}
	}
	
	@Test
	@DisplayName("Phone number does not have exactly 10 characters")
	void testPhoneNumberWithMoreThanTenCharacters() {
		Contact contact = new Contact("FirstName", "LastName", "01234567890", "Address");
		if(contact.getPhoneNumber().length() != 10) {
			fail("Phone number does not have 10 characters");
		}
	}
	
	@Test
	@DisplayName("Address cannot have more than 30 characters")
	void testAddressWithMoreThanTenCharacters() {
		Contact contact = new Contact("FirstName", "LastName", "0123456789", "Address123456789123456789123456789");
		if(contact.getAddress().length() > 30) {
			fail("Address has more than 30 characters");
		}
	}
	
	@Test
	@DisplayName("First name is blank or null")
	void testFirstNameBlank() {
		Contact contact = new Contact("", "LastName", "0123456789", "Address");
		if(contact.getFirstName().isBlank() || contact.getFirstName() == null) {
			fail("First name is blank or null");
		}
	}
	
	@Test
	@DisplayName("Last name is blank or null")
	void testLastNameBlank() {
		Contact contact = new Contact("FirstName", "", "0123456789", "Address");
		if(contact.getLastName().isBlank() || contact.getLastName() == null) {
			fail("Last name is blank or null");
		}
	}
	
	@Test
	@DisplayName("Phone number is blank or null")
	void testPhoneNumberBlank() {
		Contact contact = new Contact("FirstName", "LastName", "", "Address");
		if(contact.getPhoneNumber().isBlank() || contact.getPhoneNumber() == null) {
			fail("Phone number is blank or null");
		}
	}
	
	@Test
	@DisplayName("Address is blank or null")
	void testAddressBlank() {
		Contact contact = new Contact("FirstName", "LastName", "0123456789", "");
		if(contact.getAddress().isBlank() || contact.getAddress() == null) {
			fail("Address is blank or null");
		}
	}
	
	

	@Test
	void testContact() {
		Contact contact = new Contact("Rich", "Knoll", "1111111111", "1234 E Road");
		assertTrue(contact.getFirstName().equals("Rich"));
		assertTrue(contact.getLastName().equals("Knoll"));
		assertTrue(contact.getPhoneNumber().equals("1111111111"));
		assertTrue(contact.getAddress().equals("1234 E Road"));
	}
	
}	