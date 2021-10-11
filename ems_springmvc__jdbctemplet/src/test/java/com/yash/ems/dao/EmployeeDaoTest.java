package com.yash.ems.dao;

import static org.junit.Assert.*;

import java.util.List;
import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.yash.ems.daoimpl.EmployeeDaoImpl;
import com.yash.ems.model.Employee;

public class EmployeeDaoTest {
	Logger logger = Logger.getAnonymousLogger();
	private DriverManagerDataSource dataSource;
	private EmployeeDao dao;

	/**
	 * No Need to write drivermanagerdatasources
	 */
	/*
	 @Before 
	 * void setupBeforeEach() 
	 * { dataSource = new DriverManagerDataSource();
	 * dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	 * dataSource.setUrl("jdbc:mysql://localhost:3306/project");
	 * dataSource.setUsername("root"); dataSource.setPassword("root");
	 * 
	 * dao = new EmployeeDaoImpl(dataSource); }
	 */

	@Test
	public void testSave() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/project");
		dataSource.setUsername("root");
		dataSource.setPassword("root");

		dao = new EmployeeDaoImpl(dataSource);
		Employee Employee = new Employee("pooja", "design", 35000, "civil", "Solapur");
		int result = dao.save(Employee);
		assertTrue(result > 0);

	}

	@Test
	public void testFindAll() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/project");
		dataSource.setUsername("root");
		dataSource.setPassword("root");

		dao = new EmployeeDaoImpl(dataSource);

		List<Employee> listEmployee = dao.findAll();
		for (Employee aEmployee : listEmployee) {
			System.out.println(aEmployee);
		}

		assertTrue(!listEmployee.isEmpty());
	}

	@Test
	public void testUpdate() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/project");
		dataSource.setUsername("root");
		dataSource.setPassword("root");

		dao = new EmployeeDaoImpl(dataSource);
		Employee employee = new Employee(5, "rani", "tester", 23000.00, "civil", "delhi");
		int result = dao.update(employee);
		assertTrue(result > 0);

	}

	@Test
	public void testDelete() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/project");
		dataSource.setUsername("root");
		dataSource.setPassword("root");

		dao = new EmployeeDaoImpl(dataSource);

		Integer id = 12;
		int result = dao.delete(id);
		assertTrue(result > 0);

	}

}
