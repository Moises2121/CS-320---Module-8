package contact;

import java.util.HashMap;

import java.util.Map;

class ContactService {
    private Map<String, ContactClass> contacts;

    ContactService() {
        this.contacts = new HashMap<>();
    }
//add a contact if the Id is unique
    boolean addContact(ContactClass contact) {
        if (contacts.containsKey(contact.getContactID())) {
            return false;
        }
        contacts.put(contact.getContactID(), contact);
        return true;
    }
//delete a contact by unique Id
    boolean deleteContact(String contactID) {
        return contacts.remove(contactID) != null;
    }
//update a contact if the unique Id exist
    boolean updateContact(String contactID, String firstName, String lastName, String phone, String address) {
        ContactClass contact = contacts.get(contactID);
        if (contact == null) {
            return false;
        }
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setPhone(phone);
        contact.setAddress(address);
        return true;
    }
}