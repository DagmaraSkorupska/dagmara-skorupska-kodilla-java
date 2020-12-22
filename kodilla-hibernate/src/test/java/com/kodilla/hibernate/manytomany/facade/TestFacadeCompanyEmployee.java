package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestFacadeCompanyEmployee {
    @Autowired
    private FacadeCompanyEmployee facadeCompanyEmployee;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private final List<Integer> companyId = new ArrayList<>();
    private final List<Integer> employeeId = new ArrayList<>();

    @After
    public void cleanUp() {
        companyDao.deleteAll();
        employeeDao.deleteAll();
    }

    @Test
    public void shouldFindCompanyByPartOfName() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");

        List<Company> list = new ArrayList<>();

        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyId.add(dataMaestersId);

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyId.add(softwareMachineId);


        //Where
        try {
            list = facadeCompanyEmployee.findCompany("oft");
        } catch (FacadeProcessingException e) {
        }

        //Then
        Assert.assertEquals(1, list.size());

        //CleanUp
        companyDao.deleteAll();
        employeeDao.deleteAll();
    }

    @Test
    public void shouldFindEmployeeByPartOfName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");

        List<Employee> list = new ArrayList<>();

        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();
        employeeId.add(johnSmithId);

        employeeDao.save(stephanieClarckson);
        int stephanieClarcksonId = stephanieClarckson.getId();
        employeeId.add(stephanieClarcksonId);


        //Where
        try {
            list = facadeCompanyEmployee.findEmployee("lar");
        } catch (FacadeProcessingException e) {
        }

        //Then
        Assert.assertEquals(1, list.size());

        //CleanUp
        companyDao.deleteAll();
        employeeDao.deleteAll();
    }
}
