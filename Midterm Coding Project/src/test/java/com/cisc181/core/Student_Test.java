package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() {
	}
	
	public static void test() {
		ArrayList<Course> aCourse=new ArrayList<Course>();
		UUID dCourseID = UUID.randomUUID();
		
			aCourse.add(new Course(dCourseID, "CISC181", 85, eMajor.COMPSI));
			aCourse.add(new Course(dCourseID, "MATH302", 80, eMajor.CHEM));
			aCourse.add(new Course(dCourseID, "MATH349", 90, eMajor.PHYSICS));


		ArrayList<Semester> aSemester=new ArrayList<Semester>();
		UUID dSemesterID = UUID.randomUUID();
		Date dStartDate = new Date();
		Date dEndDate = new Date();
			aSemester.add(new Semester(dSemesterID, dStartDate, dEndDate));
			aSemester.add(new Semester(dSemesterID, dStartDate, dEndDate));
	
	
	
		ArrayList<Section> aSection=new ArrayList<Section>();
		UUID dSectionID = UUID.randomUUID();
			aSection.add(new Section(dCourseID, dSemesterID, dSectionID, 1));
			aSection.add(new Section(dCourseID, dSemesterID, dSectionID, 2));
			aSection.add(new Section(dCourseID, dSemesterID, dSectionID, 3));
			aSection.add(new Section(dCourseID, dSemesterID, dSectionID, 4));
			aSection.add(new Section(dCourseID, dSemesterID, dSectionID, 5));
			aSection.add(new Section(dCourseID, dSemesterID, dSectionID, 6));

		ArrayList<Student> aStudent=new ArrayList<Student>();
		UUID dStudentID = UUID.randomUUID();
			aStudent.add(new Student(eMajor.COMPSI, dStudentID));
			aStudent.add(new Student(eMajor.PHYSICS, dStudentID));
			aStudent.add(new Student(eMajor.NURSING, dStudentID));
			aStudent.add(new Student(eMajor.BUSINESS, dStudentID));
			aStudent.add(new Student(eMajor.CHEM, dStudentID));
			aStudent.add(new Student(eMajor.COMPSI, dStudentID));
			aStudent.add(new Student(eMajor.PHYSICS, dStudentID));
			aStudent.add(new Student(eMajor.NURSING, dStudentID));
			aStudent.add(new Student(eMajor.BUSINESS, dStudentID));
			aStudent.add(new Student(eMajor.CHEM, dStudentID));
			
		ArrayList<Enrollment> enrollment= new ArrayList<Enrollment>();
		
		for (Section s : aSection){
			for (Student t : aStudent){
				enrollment.add(new Enrollment(t.getStudentID(), s.getSectionID()));
			}
		}
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}