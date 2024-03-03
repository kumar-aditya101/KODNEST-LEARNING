
package com.learn.hibernate.HibernateProjectEx_3;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike {
		@Id
		int B_engNo;
		String B_brand;
		int B_cost;
		public Bike() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Bike(int b_engNo, String b_brand, int b_cost) {
			super();
			B_engNo = b_engNo;
			B_brand = b_brand;
			B_cost = b_cost;
		}
		public int getB_engNo() {
			return B_engNo;
		}
		public void setB_engNo(int b_engNo) {
			B_engNo = b_engNo;
		}
		public String getB_brand() {
			return B_brand;
		}
		public void setB_brand(String b_brand) {
			B_brand = b_brand;
		}
		public int getB_cost() {
			return B_cost;
		}
		public void setB_cost(int b_cost) {
			B_cost = b_cost;
		}
		@Override
		public String toString() {
			return "Bike [B_engNo=" + B_engNo + ", B_brand=" + B_brand + ", B_cost=" + B_cost + "]";
		}
		
		
		

}
