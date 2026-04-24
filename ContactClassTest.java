package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactClassTest {
//used assertions to check different conditions, following the rubric's requirements for each case
	@Test
    void testContact() {
        ContactClass contact = new ContactClass("1112223334", "Moises", "Sanchez", "1512939000", "001 SNHU St");
        assertTrue(contact.getContactID().equals("1112223334"));
        assertTrue(contact.getFirstName().equals("Moises"));
        assertTrue(contact.getLastName().equals("Sanchez"));
        assertTrue(contact.getPhone().equals("1512939000"));
        assertTrue(contact.getAddress().equals("001 SNHU St"));
        
    }
	//test if the input is too longer than the requirements
	@Test
	void testContactIDTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("11122233345", "Moises", "Sanchez", "1512939000", "001 SNHU St");
		});		}

	@Test
	void testContactfirstNameTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("1112223334", "MoisesSanchez", "Sanchez", "1512939000", "001 SNHU St");
		});		}

	@Test
	void testContactlastNameTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("1112223334", "Moises", "Sanchez Sanchez", "1512939000", "001 SNHU St");
		});		}
	
	@Test
	void testContactphoneTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("1112223334", "Moises", "Sanchez", "151293900011", "001 SNHU St");
		});		}

	@Test
	void testContactaddressTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("1112223334", "Moises", "Sanchez", "1512939000", "001 SNHU St Avenue 15, District 99");
		});		}
	
	
	//test if the input is null
	@Test
	void testContactIDTooNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass(null, "Moises", "Sanchez", "1512939000", "001 SNHU St");
		});		}

	@Test
	void testContactfirstNameNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("1112223334", null, "Sanchez", "1512939000", "001 SNHU St");
		});		}

	@Test
	void testContactlastNameNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("1112223334", "Moises", null, "1512939000", "001 SNHU St");
		});		}
	
	@Test
	void testContactphoneNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("1112223334", "Moises", "Sanchez", null, "001 SNHU St");
		});		}

	@Test
	void testContactaddressNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("1112223334", "Moises", "Sanchez", "1512939000", null);
		});		}
	
	
}


















