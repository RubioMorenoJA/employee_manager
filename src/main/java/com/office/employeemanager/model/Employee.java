package com.office.employeemanager.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity()
public class Employee implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String name;

    private String email;

    private String jobTitle;

    private String phone;

    private String imageUrl;
    
    @Column(nullable = false, updatable = false)
    private String employeeCode;

    public Employee() {}

    public Employee(final String name, final String email, final String jobTitle, final String phone, final String imageUrl, final String employeeCode) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.employeeCode = employeeCode;
    }

    public Long getId() {
        return this.id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setJobTitle(final String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setImageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setEmployeeCode(final String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeCode() {
        return this.employeeCode;
    }

    @Override
    public String toString() {
        return "Employee{"
                + "id=" + this.id + ", "
                + "name='" + this.name + "', "
                + "email='" + this.email + "', "
                + "jobTitle='" + this.jobTitle + "', "
                + "phone='" + this.phone + "', "
                + "imageUrl='" + this.imageUrl + "', "
                + "employeeCode='" + this.employeeCode + "'}";
    }
}