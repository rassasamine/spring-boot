package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Employee;
import com.example.demo.entities.Entreprise;

public interface EmployeRepository extends JpaRepository<Employee,Long> {

}
