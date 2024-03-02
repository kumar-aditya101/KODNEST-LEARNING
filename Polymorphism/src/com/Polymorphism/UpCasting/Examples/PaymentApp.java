package com.Polymorphism.UpCasting.Examples;

public class PaymentApp {

	public static void main(String[] args) {
		Payment ref;
		UPI upi = new UPI();
		ref = upi; //UpCasting
		ref.bill();
		ref.offer();
		ref.pay();
		Wallet wlt = new Wallet();
		ref = wlt; //UpCasting
		ref.bill();
		ref.offer();
		ref.pay();
		Card crd = new Card();
		ref = crd; //UpCasting
		ref.bill();
		ref.offer();
		ref.pay();

	}

}
