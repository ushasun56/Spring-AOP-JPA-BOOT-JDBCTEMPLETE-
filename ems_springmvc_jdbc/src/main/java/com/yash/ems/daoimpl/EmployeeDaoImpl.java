package com.yash.ems.daoimpl;

/**
 * all dao method impliments into employeedaoimpl class
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.yash.ems.dao.EmployeeDao;
import com.yash.ems.model.Employee;

import com.yash.ems.util.JDBCUtil;

public class EmployeeDaoImpl extends JDBCUtil implements EmployeeDao {
	Logger logger = Logger.getLogger(EmployeeDaoImpl.class);

	/*
	 * this save method is used for inserting records into table employee
	 */

	public void save(Employee employee) {

		try (Connection con = JDBCUtil.getConn();
				PreparedStatement pst = (PreparedStatement) con.prepareStatement(
						"Insert into employee(id,name,designation,salary,department,address) values(?,?,?,?,?,?)");) {
			pst.setInt(1, employee.getId());
			pst.setString(2, employee.getName());
			pst.setString(3, employee.getDesignation());
			pst.setDouble(4, employee.getSalary());
			pst.setString(5, employee.getDepartment());
			pst.setString(6, employee.getAddress());
			pst.executeUpdate();

			logger.info("\nEmployee Record Inserted successfully..");

		} catch (Exception e) {
			logger.warn("Employee Record Not Inserted...");
			e.printStackTrace();
		}
	}

	/*
	 * this findAll method is used for fetching records from Employee table
	 */
	@Override
	public List<Employee> findAll() {

		try (Connection con = JDBCUtil.getConn(); Statement st = con.createStatement();) {
			List<Employee> list = new ArrayList<Employee>();
			String q1 = "Select * from employee";

			ResultSet rs = st.executeQuery(q1);
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String designation = rs.getString(3);
				Double salary = rs.getDouble(4);
				String department = rs.getString(5);
				String address = rs.getString(6);

				Employee e = new Employee(id, name, designation, salary, department, address);

				list.add(e);

			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	/*
	 * this update method is used for updating records into table employee
	 */
	@Override
	public void update(Employee employee) {
		try (Connection con = JDBCUtil.getConn();
				PreparedStatement pst = (PreparedStatement) con.prepareStatement
						("Update employee set name=?,salary=?,department=?,designation=?,address=? where id=?");) 
					{
						
						pst.setString(1, employee.getName());
						pst.setDouble(2, employee.getSalary());
						pst.setString(3, employee.getDepartment());
						pst.setString(4, employee.getDesignation());
						pst.setString(5, employee.getAddress());
						pst.setLong(6, employee.getId());
						pst.executeUpdate();
						
						logger.info("\nRecord updated successfully..");
						
						
					}catch(Exception e)
					{
						logger.warn("Something went wrong...");
						e.printStackTrace();
					}
				
	
	}

	/*
	 * this delete method is used for deleting records from employee table
	 */
	@Override
	public void delete(int id) {
		try (Connection con = JDBCUtil.getConn();
				PreparedStatement pst = (PreparedStatement) con.prepareStatement("Delete from employee where id=?");) {
			pst.setInt(1, id);
			int i = pst.executeUpdate();
			logger.info("\n" + i + " Record deleted\n");

		} catch (Exception e) {
			logger.warn("Something went wrong...");
			e.printStackTrace();
		}

	}
}
