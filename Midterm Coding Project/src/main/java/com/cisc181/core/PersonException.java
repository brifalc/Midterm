package com.cisc181.core;

import java.util.Date;

public class PersonException extends Exception{
	
	Person p;
	
	public PersonException(Person person )
	{
		super();
		this.p = person;
		
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	public String getMiddleName() {
		return MiddleName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public String getaddress() {
		return address;
	}
	
	public String getemail_address() {
		return email_address;
	}
	
	public Date getDOB() {
		return DOB;
	}
	public String getphone_number() {
		return phone_number;
	}

}

