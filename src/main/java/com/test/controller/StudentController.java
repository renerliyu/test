package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	private StudentValidate studentValidate;
	
	@RequestMapping(method=RequestMethod.GET,value="/addStudent")
	public ModelAndView addStudent(){
		ModelAndView modelAndView =new ModelAndView();
		Student student = new Student();
		student.setCourse("MS");
		student.setFee(2000);
		modelAndView.setViewName("student");
		modelAndView.addObject("student",student);
		return modelAndView;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/saveStudent")
	public ModelAndView saveStudent(Student student,Errors errors){
		System.out.print("Student data "+student);
		ModelAndView modelAndView =new ModelAndView();
		studentValidate.validate(student, errors);
		if(errors.hasErrors()){
			//Failed
			modelAndView.setViewName("student");
			modelAndView.addObject("student",student);
		}else{
			//Success
			modelAndView.setViewName("success");
			modelAndView.addObject("message","Student Added"+student);
		
		}
		return modelAndView;
	}
}
