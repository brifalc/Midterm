package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}	
	
	@SuppressWarnings("deprecation")
	@Test
	public void staff_test() {
		ArrayList<Staff> aStaff = new ArrayList<Staff>();
		Date dBirth = new Date();
		Date dHire = new Date();
		
		aStaff.add(new Staff("Brianna","Rose","Falcone",dBirth,"123 Easy Way","302-555-1212","test@test.com","12 noon",0,125000,dHire,eTitle.MS));
		aStaff.add(new Staff("Nicole","Maria","Falcone",dBirth,"456 Easy Way","302-555-1213","test2@test.com","1 pm",0,135000,dHire,eTitle.MS));
		aStaff.add(new Staff("Gladys","Rosary","Falcone",dBirth,"789 Easy Way","302-555-1214","test3@test.com","2 pm",0,145000,dHire,eTitle.MR));
		aStaff.add(new Staff("Raymond","Anthony","Falcone",dBirth,"1 Easy Way","302-555-1215","test4@test.com","3 pm",0,155000,dHire,eTitle.MRS));
		aStaff.add(new Staff("Carolyn","Ann","King",dBirth,"2 Easy Way","302-555-1216","test5@test.com","4 pm",0,165000,dHire,eTitle.MS));
		
		double salaryAverage = (aStaff.get(0).getSalary() + aStaff.get(1).getSalary() + aStaff.get(2).getSalary() + aStaff.get(3).getSalary() + aStaff.get(4).getSalary())/5;
		
		assertEquals(salaryAverage, 145000);
	
	}

}

