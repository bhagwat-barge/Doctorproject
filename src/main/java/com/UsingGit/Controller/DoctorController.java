package com.UsingGit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UsingGit.Service.DoctorServiceI;
import com.UsingGit.model.Docter;

@RestController
public class DoctorController
{   
	@Autowired
	private DoctorServiceI doctorServiceI;
	
	@PostMapping(value="/addDoctor",produces = "application/json",consumes = "application/json")
    public ResponseEntity<Docter> addDoctor(@RequestBody Docter doctor)
    {    
    	
		return new ResponseEntity<Docter>( doctorServiceI.addDoctor(doctor),HttpStatus.CREATED);
    	
    }
}
