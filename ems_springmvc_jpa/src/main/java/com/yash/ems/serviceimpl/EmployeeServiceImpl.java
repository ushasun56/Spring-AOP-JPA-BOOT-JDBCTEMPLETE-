package com.yash.ems.serviceimpl;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.yash.ems.model.Employee;
import com.yash.ems.repositery.EmployeeRepository;

@Service
@Transactional
@Repository
public class EmployeeServiceImpl 
{
	 @Autowired EmployeeRepository emprepo;
	
     public void save(Employee employee) {
    	emprepo.save(employee); 
     }
     
     public List<Employee> listAll(){
    	 return (List<Employee>) emprepo.findAll();
     }
     
     public Employee get(Long id) {
         return emprepo.findById(id).get();
     }
     
     public void delete(Long id) {
         emprepo.deleteById(id);
     }
    
}
