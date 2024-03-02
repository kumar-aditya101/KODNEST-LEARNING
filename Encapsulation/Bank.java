package Encapsulation;

public class Bank {
	private int money; //providing the Security to the data member.
	//public Setter method
	public void setMoney(int amount) //Cashier who can take money from customer and deposit in bank.
	{
		if(amount>0){
			money = amount;
		}
		else {
			System.out.println("Kindly enter positive amount");
			System.exit(0);
		}
	}
//	public Getter method
	public int getMoney() //Cashier who can take money from bank and give to customer.
	{ 
		return money;
	}
}
