package com.UsingGit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UsingGit.model.Docter;

@Repository
public interface DoctorRepo extends JpaRepository<Docter,Integer> {

	
	
}
