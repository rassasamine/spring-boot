package com.example.demo.entities;

import javax.persistence.*;

import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long matricule;
	
	private String nom;
	private String prenom;
	private String qualité;
	@ManyToOne
	private Entreprise entrep;
	private static final long serialVersionUId=1L;

	
	

}
