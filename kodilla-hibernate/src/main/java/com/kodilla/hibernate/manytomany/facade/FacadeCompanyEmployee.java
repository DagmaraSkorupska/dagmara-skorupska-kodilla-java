package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacadeCompanyEmployee {
    @Autowired
    private CompanyDao company;

    @Autowired
    private EmployeeDao employee;

    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeCompanyEmployee.class);


    public List<String> findByPartOfName() throws FacadeProcessingException {
        List<String> foundResults = new ArrayList<>();
        LOGGER.info("Starting method: search by Part of Name");
        try {
            List<Company> companyFoundByPartName = company.searchByPartOfName("%Da%");
            if (companyFoundByPartName.size() > 0) {
                LOGGER.info("Found companies: ");
                for (Company tempCompany : companyFoundByPartName) {
                    LOGGER.info(tempCompany.getName());
                    foundResults.add(tempCompany.getName());
                }

            } else {
                LOGGER.info("Found none companies");
            }

            List<Employee> employeeFoundByPartName = employee.searchByPartOfName("%Cl%");
            if (employeeFoundByPartName.size() > 0) {
                LOGGER.info("Found employees: ");
                for (Employee tempEmployee : employeeFoundByPartName) {
                    LOGGER.info(tempEmployee.getLastname());
                    foundResults.add(tempEmployee.getLastname());
                }
            } else {
                LOGGER.info("Found none employees");
            }

        } finally {
            LOGGER.info("Method finished");
        }
        return foundResults;
    }
}



