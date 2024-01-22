
public class Example_3 {

	public static void main(String[] args) {
		
		String s1 = "Rama";
		String s2 = "Sita";
		String s3 = "Rama" + "Sita";
		String s4 = "Rama" + "Sita";
		
		if(s3==s4){
			System.out.println("References are equall");
		}
		else{
			System.out.println("References are unequall");
		}
		
		if(s3.equals(s4)){
			System.out.println("Strings are equall");
		}
		else{
			System.out.println("Strings are unequall");
		}
		
		String s5 = s1+s2;
		String s6 = s1+s2;
		
		if(s5==s6){
			System.out.println("References are equall");
		}
		else{
			System.out.println("References are unequall");
		}
		
		if(s5.equals(s6)){
			System.out.println("Strings are equall");
		}
		else {
			System.out.println("Strings are unequall");
		}
		

	}

}
