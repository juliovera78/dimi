package com.bhaiti.kela.controllers;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bhaiti.kela.beans.DeudaCuit;
import com.bhaiti.kela.beans.Embarcacion;
import com.bhaiti.kela.beans.Student;
import com.bhaiti.kela.beans.StudentRegistration;

@Controller
public class StudentRetrieveController {
	
	
	

	
	
	@RequestMapping(method = RequestMethod.GET, value="/embarcaciones/cuit/{mCuit}")
	
	@ResponseBody
	public DeudaCuit getDeuda(@PathVariable("mCuit") String mCuit) {
	
		double random01 = ThreadLocalRandom.current().nextDouble(1000, 100000);
		double random02 = ThreadLocalRandom.current().nextDouble(100, 50000);
		
		Embarcacion embo1= new Embarcacion();
		embo1.setDeuda(random01);
		embo1.setDominio("KO456");
		embo1.setEslora("7");
		embo1.setManga("2");
		
		Embarcacion embo2 = new Embarcacion();
		embo2.setDeuda(random02);
		embo2.setDominio("KO879");
		embo2.setEslora("10");
		embo2.setManga("4");
		
		DeudaCuit deuda = new DeudaCuit();
		deuda.getEmbarcaciones().add(embo1);
		deuda.getEmbarcaciones().add(embo2);
		deuda.setCuit(mCuit);
		
		return deuda;
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value="/embarcaciones/cuit")
	@ResponseBody
	
	public DeudaCuit getEmbarcaciones() {
		
		Embarcacion embo1= new Embarcacion();
		embo1.setDeuda(new Double(5214.12));
		embo1.setDominio("KO123");
		embo1.setEslora("7");
		embo1.setManga("2");
		
		Embarcacion embo2 = new Embarcacion();
		embo2.setDeuda(new Double(21000.12));
		embo2.setDominio("NE895");
		embo2.setEslora("10");
		embo2.setManga("4");
		
		DeudaCuit deuda = new DeudaCuit();
		deuda.getEmbarcaciones().add(embo1);
		deuda.getEmbarcaciones().add(embo2);
		deuda.setCuit("2326996063");
		
		return deuda;
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value="/student/allstudent")

	@ResponseBody
	public List<Student> getStudent() {
		return StudentRegistration.getInstance().getStudentRecords();
	}

}
