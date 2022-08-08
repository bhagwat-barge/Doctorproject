package com.UsingGit.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UsingGit.model.Docter;
import com.UsingGit.repository.DoctorRepo;

@Service
public class DoctorServiceImpl implements DoctorServiceI{
     
	@Autowired
	private  DoctorRepo doctorRepo;
	@Override
	public Docter addDoctor(Docter docter) {
		Docter save = doctorRepo.save(docter);
		return save;
	}

}
