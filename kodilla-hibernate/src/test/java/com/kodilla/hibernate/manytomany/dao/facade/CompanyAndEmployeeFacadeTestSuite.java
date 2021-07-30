package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.facade.CompanyFacade;
import com.kodilla.hibernate.manytomany.facade.EmployeeFacade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@SpringBootTest
public class CompanyAndEmployeeFacadeTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeFacade employeeFacade;

    @Autowired
    private CompanyFacade companyFacade;

    @Test
    public void shouldFindCompanyByKeyword() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee robertMitch = new Employee("Robert", "Mitch");
        Employee ninaDobrev = new Employee("Nina", "Dobrev");

        Company itExperts = new Company("IT Experts");
        Company globalApp = new Company("Global App");
        Company cloudApp = new Company("Cloud App");

        johnSmith.getCompanies().add(globalApp);
        johnSmith.getCompanies().add(cloudApp);
        robertMitch.getCompanies().add(itExperts);
        ninaDobrev.getCompanies().add(itExperts);
        ninaDobrev.getCompanies().add(cloudApp);

        itExperts.getEmployees().add(robertMitch);
        itExperts.getEmployees().add(ninaDobrev);
        globalApp.getEmployees().add(johnSmith);
        cloudApp.getEmployees().add(johnSmith);
        cloudApp.getEmployees().add(ninaDobrev);

        companyDao.save(itExperts);
        companyDao.save(globalApp);
        companyDao.save(cloudApp);

        //When
        List<Company> result = companyFacade.findCompanyByKeyword("lo");
        for (Company list : result) {
            System.out.println(list.getName());
        }

        //Then
        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals("Cloud App", result.get(0).getName());
    }

    @Test
    public void shouldFindEmployeeByKeyword() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee robertMitch = new Employee("Robert", "Mitch");
        Employee ninaDobrev = new Employee("Nina", "Dobrev");

        Company itExperts = new Company("IT Experts");
        Company globalApp = new Company("Global App");
        Company cloudApp = new Company("Cloud App");

        johnSmith.getCompanies().add(globalApp);
        johnSmith.getCompanies().add(cloudApp);
        robertMitch.getCompanies().add(itExperts);
        ninaDobrev.getCompanies().add(itExperts);
        ninaDobrev.getCompanies().add(cloudApp);

        itExperts.getEmployees().add(robertMitch);
        itExperts.getEmployees().add(ninaDobrev);
        globalApp.getEmployees().add(johnSmith);
        cloudApp.getEmployees().add(johnSmith);
        cloudApp.getEmployees().add(ninaDobrev);

        companyDao.save(itExperts);
        companyDao.save(globalApp);
        companyDao.save(cloudApp);

        //When
        List<Employee> result = employeeFacade.findEmployeeByKeyword("obr");
        for (Employee list : result) {
            System.out.println(list.getFirstname() + " " + list.getLastname());
        }

        //Then
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals("Nina", result.get(0).getFirstname());
    }
}
