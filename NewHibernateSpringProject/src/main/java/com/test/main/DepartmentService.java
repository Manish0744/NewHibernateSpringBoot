package com.test.main;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("departmentService")
public class DepartmentService {
	 	@Autowired
	    DepartmentDAO departmentDAO;
	 
	    @Transactional
	    public void addDepartment(Department department) {
	    	departmentDAO.addDepartment(department);
	    }
	    
	    @Transactional
	    public List<Department> getAllDepartments() {
	        return departmentDAO.getAllDepartment();
	    }
	 
	    @Transactional
	    public Department getDepartmentByID(long id) {
	        return departmentDAO.getDepartmentByID(id);
	    }
	    
	    @Transactional
	    public List<Employee> getEmployeeByDeptID(long id) {
	        return departmentDAO.getEmployeeByDeptID(id);
	    }
	    
	    @Transactional
	    public Employee getEmployeeEmpID(long id) {
	        return departmentDAO.getEmployeeEmpID(id);
	    }
	    
	    @Transactional
	    public Address getAddressAddID(long id) {
	        return departmentDAO.getAddressAddID(id);
	    }
	    
	    @Transactional
	    public String updateDepartment(long id, String deptName) {
	        return departmentDAO.updateDepartment(id, deptName);
	    } 
	    
	    @Transactional
	    public String updateEmployeeByID(long id, String empName) {
	        return departmentDAO.updateEmployeeByID(id, empName);
	    }
	    
	    @Transactional
	    public String deleteAddressById(long id) {
	        return departmentDAO.deleteAddressById(id);
	    } 
	    
	    @Transactional
	    public String deleteEmployeeById(long id) {
	        return departmentDAO.deleteEmployeeById(id);
	    }
	    
	    @Transactional
	    public String deleteDepartmentById(long id) {
	        return departmentDAO.deleteDepartmentById(id);
	    }
	    
	    @Transactional
	    public Address getAddressByNamedQuery() {
	        return departmentDAO.getAddressByNamedQuery();
	    }	
}
