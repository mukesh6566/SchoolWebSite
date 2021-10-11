package com.mentor.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mentor.it.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
