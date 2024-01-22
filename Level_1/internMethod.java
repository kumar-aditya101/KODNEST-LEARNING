package Level_1;

public class internMethod {

	public static void main(String[] args) {
		String str = new String ("Kodnest");
		System.out.println(str);
		String str2 = str.intern();
		System.out.println(str2);
		String str3 = "Kodnest";
		if(str2==str3) {
			System.out.println("References are equall");
		}
		else {
			System.out.println("References are unequall");
		}

	}

}
