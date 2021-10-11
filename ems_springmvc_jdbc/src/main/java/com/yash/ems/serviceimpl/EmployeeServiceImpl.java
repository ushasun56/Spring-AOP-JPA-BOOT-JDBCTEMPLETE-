package com.yash.ems.serviceimpl;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import java.util.List;
import org.apache.log4j.Logger;
import com.yash.ems.exception.EmployeeIdNotFoundException;
import com.yash.ems.exception.InvalidNameException;
import com.yash.ems.model.Employee;
import com.yash.ems.service.EmployeeService;

import com.yash.ems.util.JDBCUtil;

public class EmployeeServiceImpl implements EmployeeService {
	Logger logger = Logger.getLogger(EmployeeServiceImpl.class);

	@Override
	public Employee getEmployeeById(int empid) throws EmployeeIdNotFoundException {
		Employee e = null;

		try (Connection con = JDBCUtil.getConn();
				PreparedStatement pst = (PreparedStatement) con
						.prepareStatement("Select * from employee where id=?");) {
			pst.setInt(1, empid);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String designation = rs.getString(3);
				Double salary = rs.getDouble(4);
				String department = rs.getString(5);
				String address = rs.getString(6);

				e = new Employee(id, name, designation, salary, department, address);

			}

			return e;
		} catch (Exception e1) {
			logger.warn("Something went wrong...");
			e1.printStackTrace();
		}

		return null;

	}

	@Override
	public Employee getEmployeeByName(String empname) throws InvalidNameException {
		Employee e = null;

		try (Connection con = JDBCUtil.getConn();
				PreparedStatement pst = (PreparedStatement) con
						.prepareStatement("Select * from employee where name=?");) {
			pst.setString(1, empname);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String designation = rs.getString(3);
				Double salary = rs.getDouble(4);
				String department = rs.getString(5);
				String address = rs.getString(6);

				e = new Employee(id, name, designation, salary, department, address);

			}

			return e;
		} catch (Exception e1) {
			logger.warn("Something went wrong...");
			e1.printStackTrace();
		}

		return null;

	}

}
