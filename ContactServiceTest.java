package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.TestMethodOrder;

import main.ContactService;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
public class ContactServiceTest {
	
	@Test
	@DisplayName("Test to update first name")
	@Order(1)
	void testUpdateFirstName() {
		ContactService service = new ContactService();
		service.addContact("Rich", "Knoll", "1234567890", "1234 W East Road");
		service.setFirstName("Sven", "0");
		//service.displayContactList();
		assertEquals("Sven", service.getContact("0").getFirstName(), "First name was not updated.");
	}
	
	@Test
	@DisplayName("Test to update last name")
	@Order(2)
	void testUpdateLasttName() {
		ContactService service = new ContactService();
		service.addContact("Rich", "Knoll", "1234567890", "1234 W East Road");
		service.setLastName("Sven", "1");
		//service.displayContactList();
		assertEquals("Sven", service.getContact("0").getLastName(), "Last name was not updated.");
		
	}
	
	@Test
	@DisplayName("Test to update phone number")
	@Order(3)
	void testUpdatePhoneNumber() {
		ContactService service = new ContactService();
		service.addContact("Rich", "Knoll", "1234567890", "1234 W East Road");
		service.setPhoneNumber("3333333333", "2");
		//service.displayContactList();
		assertEquals("3333333333", service.getContact("0").getPhoneNumber(), "Phone number was not updated.");
	}
	
	@Test
	@DisplayName("Test to update address")
	@Order(4)
	void testUpdateAddress() {
		ContactService service = new ContactService();
		service.addContact("Rich", "Knoll", "1234567890", "1234 W East Road");
		service.setAddress("Sven", "3");
		//service.displayContactList();
		assertEquals("Sven", service.getContact("0").getAddress(), "Phone address was not updated.");
	}

}
