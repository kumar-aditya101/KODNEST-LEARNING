
public class Example_2 {

	public static void main(String[] args) {
		
		String s1 = "Rama";
		String s2 = new String("Rama");
		
		if(s1==s2){
			System.out.println("References are equall");
		}
		else{
			System.out.println("References are unequall");
		}
		
		if(s1.equals(s2)){
			System.out.println("Strings are equall");
		}
		else{
			System.out.println("Strings are unequall");
		}

	}

}
