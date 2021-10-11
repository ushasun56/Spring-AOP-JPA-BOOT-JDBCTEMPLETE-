package com.yash.ems.repositery;
/**
 * Just declare an interface that extends the CrudRepository interface, 
 * which defines CRUD methods like save(), findAll(), findById(),deleteById(),
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.ems.model.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>
{

}
