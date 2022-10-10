package com;

import java.time.LocalDate;

public class Student {
	
	private String name ;
	private String maritalStatus;
	private int age;
	private String gender;
	private LocalDate dateofBirth; 
	private String address;
	private String primaryEmailId;
	private String secondaryEmailId;
	private long phoneNumber;
	private String interestedSubject;
	private String highestEducationQualification;
	private String nationality;
	private String admissionID;
	private Exam exam;
	private String result;
	
	
	
	
	public Student(String name, String maritalStatus, int age, String gender, LocalDate dateofBirth, String address,
			String primaryEmailId, String secondaryEmailId, long phoneNumber, String interestedSubject,
			String highestEducationQualification, String nationality) {
		this.name = name;
		this.maritalStatus = maritalStatus;
		this.age = age;
		this.gender = gender;
		this.dateofBirth = dateofBirth;
		this.address = address;
		this.primaryEmailId = primaryEmailId;
		this.secondaryEmailId = secondaryEmailId;
		this.phoneNumber = phoneNumber;
		this.interestedSubject = interestedSubject;
		this.highestEducationQualification = highestEducationQualification;
		this.nationality = nationality;
	}
	
	public void registerStudent() {
		
		Registrar registrar = Registrar.getRegistrar();
		admissionID = registrar.registerStudent(this); // this s1 object from UseClass
		if(admissionID!=null) {
			System.out.println("Student is admitted for "+interestedSubject);
		}else {
			System.out.println("Student is not qualified in the entrance exam");
		}
	}
	
	public void registerForExam() {
		ExamRegistrar examRegistar = ExamRegistrar.getExamRegistar();
		exam = examRegistar.registeringStudentForExamination(this);
		
	}
	
	public void apperForExam() {
		Paper paper = exam.getPaper();
		 result = paper.submit();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPrimaryEmailId() {
		return primaryEmailId;
	}
	public void setPrimaryEmailId(String primaryEmailId) {
		this.primaryEmailId = primaryEmailId;
	}
	public String getSecondaryEmailId() {
		return secondaryEmailId;
	}
	public void setSecondaryEmailId(String secondaryEmailId) {
		this.secondaryEmailId = secondaryEmailId;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getInterestedSubject() {
		return interestedSubject;
	}
	public void setInterestedSubject(String interestedSubject) {
		this.interestedSubject = interestedSubject;
	}
	public String getHighestEducationQualification() {
		return highestEducationQualification;
	}
	public void setHighestEducationQualification(String highestEducationQualification) {
		this.highestEducationQualification = highestEducationQualification;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
	
	
	

	

}
