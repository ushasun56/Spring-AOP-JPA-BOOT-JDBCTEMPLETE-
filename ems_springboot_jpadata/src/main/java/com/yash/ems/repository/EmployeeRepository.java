package com.yash.ems.repository;
/**
 * Interface for the EmployeeRepository to impliments all CRUD Operation 
 * Like Save,Update,Delete,getAll
 * @author usha.more
 */
import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.ems.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> 
{
   // No Need To declare method here jpaRepository have future to all crud method
}

	

