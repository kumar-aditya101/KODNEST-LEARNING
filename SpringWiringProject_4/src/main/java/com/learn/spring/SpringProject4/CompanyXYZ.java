package com.learn.spring.SpringProject4;

public class CompanyXYZ {

	Employee e;

	public CompanyXYZ() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompanyXYZ(Employee e) {
		super();
		this.e = e;
	}

	public Employee getE() {
		return e;
	}

	public void setE(Employee e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "CompanyXYZ [e=" + e + "]";
	}
	
	
}
