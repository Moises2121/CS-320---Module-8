package contact;

public class ContactClass {
	//declared contact id "final" so its not updateable per rubric's instruction
	private final String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//following the JUnit tutorial, added the required conditions and arguments for each 
	public ContactClass (String contactID, String firstName, String lastName, String phone, String address) {
	if (contactID == null || contactID.length()>10) {
		throw new IllegalArgumentException("Invalid Contact ID");
	}
	if (firstName == null || firstName.length()>10) {
		throw new IllegalArgumentException("Invalid First Name");
	}
	if (lastName == null || lastName.length()>10) {
		throw new IllegalArgumentException("Invalid Last Name");
	}
	//will verify that phone is 10 characters, but those should also be digits
	if (phone == null || phone.length() !=10 || !phone.matches("\\d+")) {
		throw new IllegalArgumentException("Invalid Phone Number");
	}
	if (address == null || address.length()>30) {
		throw new IllegalArgumentException("Invalid Address");
	}
	
	this.contactID = contactID;
	this.firstName = firstName;
	this.lastName = lastName;
	this.phone = phone;
	this.address = address;
	
	}
	//get methods 
	public String getContactID() {
		return contactID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	//set methods. Also, there's no set method for contactID since its final
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
	
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setAddress(String address) {
        this.address = address;
    }
		
}

