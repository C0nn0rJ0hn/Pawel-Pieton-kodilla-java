package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeFacade {

    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> findEmployeeByKeyword(String keyword) {
        return employeeDao.retrieveEmployeeByAnyFragmentOfLastname(keyword);
    }
}
