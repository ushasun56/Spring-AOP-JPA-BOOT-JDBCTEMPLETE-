package com.yash.springdatajpsboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository<Employee> extends JpaRepository<Employee ,Long>{
 List <Employee> findbyName(String name);//customized method	
}
//save(),upadte(),delete(),list()
