package com.learn.spring.SpringAutoWiringProject_7;

public class College {
	
	Professor pr;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(Professor pr) {
		super();
		this.pr = pr;
	}

	public Professor getPr() {
		return pr;
	}

	public void setPr(Professor pr) {
		this.pr = pr;
	}

	@Override
	public String toString() {
		return "College [pr=" + pr + "]";
	}
	
	

}
