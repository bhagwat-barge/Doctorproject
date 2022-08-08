package com.UsingGit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UsingGit.model.Docter;

public interface DoctorRepo extends JpaRepository<Docter,Integer> {

	
	
}
