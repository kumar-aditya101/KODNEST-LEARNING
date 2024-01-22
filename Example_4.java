
public class Example_4 {

	public static void main(String[] args) {
		String s1 = "Rama";
		String s2 = s1;
		
		if(s1==s2) {
			System.out.println("References Are Equal");
		}
		else {
			System.out.println("References Are Unequal");
		}
		
		if(s1.equals(s2)){
			System.out.println("Strings Are equal");
		}
		else {
			System.out.println("Strings Are Unequal");
		}

	}

}
