package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@SpringBootTest
public class CompanyDaoTestSuite
{
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany()
    {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assertions.assertNotEquals(0, softwareMachineId);
        Assertions.assertNotEquals(0, dataMaestersId);
        Assertions.assertNotEquals(0, greyMatterId);
        //Cleanup
        try
        {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        }
        catch (Exception e)
        {

        }
    }

    @Test
    void testNamedQueries()
    {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee annaConnor = new Employee("Anna", "Connor");
        Employee andersonSmith = new Employee("Anderson", "Smith");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company softSchool = new Company("Soft School");

        softwareMachine.getEmployees().add(johnSmith);
        softwareMachine.getEmployees().add(andersonSmith);
        dataMaesters.getEmployees().add(annaConnor);
        softSchool.getEmployees().add(annaConnor);
        softSchool.getEmployees().add(andersonSmith);

        johnSmith.getCompanies().add(softwareMachine);
        andersonSmith.getCompanies().add(softwareMachine);
        andersonSmith.getCompanies().add(softSchool);
        annaConnor.getCompanies().add(dataMaesters);
        annaConnor.getCompanies().add(softSchool);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(softSchool);
        int softSchoolId = softSchool.getId();

        List<Employee> searchByLastname = employeeDao.retrieveEmployeeByLastname("Smith");
        List<Company> searchByFirstThreeChar = companyDao.retrieveCompanyWithThreeFirstChar("Sof");

        //Then
        Assertions.assertEquals(2, searchByLastname.size());
        Assertions.assertEquals(2, searchByFirstThreeChar.size());
        Assertions.assertEquals("Smith",searchByLastname.get(0).getLastname());
        Assertions.assertNotEquals(0, softwareMachineId);
        Assertions.assertNotEquals(0, dataMaestersId);
        Assertions.assertNotEquals(0, softSchoolId);

        //Cleanup
        try
        {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(softSchoolId);
            companyDao.deleteById(dataMaestersId);
        }
        catch (Exception e)
        {

        }
    }
}
