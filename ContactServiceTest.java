package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {
//used assertions to check different conditions, following the rubric's requirements for each case
    @Test
    void testAddContact() {
        ContactService service = new ContactService();
        ContactClass contact = new ContactClass("1112223334", "Moises", "Sanchez", "1512939000", "001 SNHU St");
        assertTrue(service.addContact(contact));
    }

    @Test
    void testDeleteContact() {
        ContactService service = new ContactService();
        ContactClass contact = new ContactClass("1112223334", "Moises", "Sanchez", "1512939000", "001 SNHU St");
        service.addContact(contact);
        assertTrue(service.deleteContact("1112223334"));
    }

    @Test
    void testUpdateContact() {
        ContactService service = new ContactService();
        ContactClass contact = new ContactClass("1112223334", "Moises", "Sanchez", "1512939000", "001 SNHU St");
        service.addContact(contact);
        assertTrue(service.updateContact("1112223334", "Moises", "Williams", "1512939000", "001 SNHU St"));
    }

}