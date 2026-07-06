package com.ashish.excelr2026javacoremaven.entity;



import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    private int eno;

    private String ename;
    private double salary;
    private String dept;
    private String gender;
    private LocalDate dob;

    public Employee() {
    }

    public Employee(int eno, String ename, double salary, String dept, String gender, LocalDate dob) {
        this.eno = eno;
        this.ename = ename;
        this.salary = salary;
        this.dept = dept;
        this.gender = gender;
        this.dob = dob;
    }

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + ", dept=" + dept + ", gender="
				+ gender + ", dob=" + dob + "]";
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

}