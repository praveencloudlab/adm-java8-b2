package com;

public class Registrar {
	
	private static Registrar registrar;
	
	private Registrar() {}
	
	public static Registrar getRegistrar() {
		if(registrar==null) {
			registrar=new Registrar();
			return registrar;
		}
		return registrar;
	}
	
	public String registerStudent(Student student) {
		String admissionId=null;
		Validator validator = Validator.getValidator();
		if(validator.validateStudentDetails(student)) {
			//generate admission id and return it to the student
			admissionId= "ABCUNI20221010001";
		}
		return admissionId;
	}
}
