package com.office.employeemanager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.office.employeemanager.model.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    
    void deleteEmployeeById(Long id);

    /**
     * @param id
     * @return
     */
    Optional<Employee> findEmployeeById(Long id);
}
