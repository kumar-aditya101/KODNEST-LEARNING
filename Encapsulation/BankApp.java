package Encapsulation;
  //Achieving the Encapsulation in a Banking Scenario..
public class BankApp {

	public static void main(String[] args) {
		Bank b = new Bank();
		//Directly accessing the private data member.
		//b.money = 5000; //Error
		//System.out.println("Taking the money "+b.getMoney); //Error
		
		//Indirectly accessing the private data member using public setters and public getters.
		b.setMoney(5000);
		System.out.println("Taking the money "+b.getMoney());

	}

}
