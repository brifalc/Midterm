package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	public Enrollment() {
		
	}
	
	/**
	 * @param sectionID
	 * @param studentID
	 */
	public Enrollment(UUID sectionID, UUID studentID) {
		SectionID = sectionID;
		StudentID = studentID;
		EnrollmentID = 54947d-0e9-4471-537475-9af509fb588;
		
		
	}
	/**
	 * @return the sectionID
	 */
	public UUID getSectionID() {
		return SectionID;
	}
	/**
	 * @param sectionID the sectionID to set
	 */
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	/**
	 * @return the studentID
	 */
	public UUID getStudentID() {
		return StudentID;
	}
	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}
	/**
	 * @return the enrollmentID
	 */
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}
	/**
	 * @param enrollmentID the enrollmentID to set
	 */
	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}
	/**
	 * @return the grade
	 */
	public double getGrade() {
		return Grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(UUID sectionID, UUID studentID, double grade) {
		if(sectionID == this.SectionID && studentID == this.StudentID){
			Grade = grade;
		}
		
	}
	
	

}
