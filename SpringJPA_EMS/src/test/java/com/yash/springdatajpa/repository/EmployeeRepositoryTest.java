package com.yash.springdatajpa.repository;




import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.yash.springdatajpa.model.Employee;
/**
 * rollback operation performed (no update in  employee1 table)
 * @author usha.more
 *
 */

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class EmployeeRepositoryTest {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	/**
	 * JUnit test for the saveEmployee
	 */
	@Test
	//@Rollback(false)
	public void saveEmployeeTest() {
		
		Employee employee = new Employee("hr","minu");
	 	employeeRepository.save(employee);
		Assertions.assertThat(employee.getId()).isGreaterThan(0);  
	}
	/**
	 *JUnit test for the geeting employee 
	 */
	@Test
	public void getEmployeeTest() {
		Employee employee = employeeRepository.findById(1L).get();
		Assertions.assertThat(employee.getId()).isEqualTo(1L);
	}
	/**
	 * get all employee
	 */
	@Test
	public void getAllEmployeeTest() {
		List<Employee> employee= employeeRepository.findAll();
		Assertions.assertThat(employee.size()).isGreaterThan(1);
	}
	/**
	 * update the employee test case
	 */
	@Test
	@Rollback(false)
	public void updateEmployeeTest() {
		Employee employee = employeeRepository.findById(2L).get();
		employee.setName("monali");
		employee.setDesg("developer");
		Employee employeeupdate=employeeRepository.save(employee);
		
		Assertions.assertThat(employeeupdate.getName()).isEqualTo("monali");
		Assertions.assertThat(employeeupdate.getDesg()).isEqualTo("developer");
	}
	/**
	 * test case for the delete employee
	 */
	@Test
	@Rollback(false)
	 public void deleteEmployeeTest(){
	 Employee employee = employeeRepository.findById(12L).get();

    employeeRepository.delete(employee);

    //employeeRepository.deleteById(1L);

    Employee employee1 = null;

    Optional<Employee> optionalEmployee = employeeRepository.findBydesg("developer");

    if(optionalEmployee.isPresent()){
        employee1 = optionalEmployee.get();
    }

    Assertions.assertThat(employee1).isNull();
}
}
