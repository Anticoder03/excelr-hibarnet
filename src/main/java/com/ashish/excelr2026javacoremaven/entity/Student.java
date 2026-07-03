package com.ashish.excelr2026javacoremaven.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
//	@column change the name of column and @table change the table name
//	@Column(name="rollNumber")
	private int rno;
//	@Column(name="studentName")
	private String sname;
//	@Column(name="Percentage")
	private double per;
	
	@Transient // it wont add temp to table this will prevent it
	private double temp;
	static private String collegeNamme="dpu"; //static or class scope do not added in table.
	
	
	public Student() {}
	public Student(int rno, String sname, double per) {
		this.rno = rno;
		this.sname = sname;
		this.per = per;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", sname=" + sname + ", per=" + per + "]";
	}
	
	
	
}