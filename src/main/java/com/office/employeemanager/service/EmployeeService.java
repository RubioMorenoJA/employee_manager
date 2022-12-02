package com.office.employeemanager.service;

import java.util.UUID;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.office.employeemanager.model.Employee;
import com.office.employeemanager.repo.EmployeeRepo;
import com.office.employeemanager.exception.UserNotFoundException;


@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(final Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return this.employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return this.employeeRepo.findAll();
    }

    public Employee updatEmployee(Employee employee) {
        return this.employeeRepo.save(employee);
    }

    public Employee findEmployeeById(final Long id) {
        return this.employeeRepo.findEmployeeById(id)
            .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found."));
    }

    public void deleteEmployee(final Long id) {
        this.employeeRepo.deleteEmployeeById(id);
    }
}
