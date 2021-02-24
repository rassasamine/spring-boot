package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

import com.example.demo.entities.Entreprise;

@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise,Long> {
	
	

}
