package com.example.demo.entities;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Entreprise {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String raison_sociale;
	private String address;
	private String tel;
	@OneToMany(mappedBy = "entrep",orphanRemoval = true,fetch = FetchType.EAGER)
	private List<Employee> Employees;
	private static final long serialVersionUId=1L;

	
	
	
}
