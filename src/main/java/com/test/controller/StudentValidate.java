package com.test.controller;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.test.model.Student;

@Component
public class StudentValidate implements Validator{
	@Override
	public boolean supports(Class<?> classParam){
		return classParam.equals(Student.class);
	}
	
	public void validate(Object obj,Errors errors){
		Student student = (Student)obj;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "sno", "student.sno.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "sname", "student.sname.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fee", "student.fee.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "course", "student.course.required");
		if(student.getSno()!=null&&student.getSno()<0){
			errors.rejectValue("sno", "student.sno.minandmax");
		}
	}

}
