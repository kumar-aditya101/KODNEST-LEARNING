
public class Example_6 {

	public static void main(String[] args) {
		
		String s1 = "SIREESHA";
		String s2 = "Sireesha";
		
		if(s1.equals(s2)){
			System.out.println("Strings Are Equal");
		}
		else {
			System.out.println("Strings Are Unequal");
		}
		
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("Strings Are Equal");
		}
		else {
			System.out.println("Strings Are Unequal");
		}
		
		String cricketer1="Sourav";
		String cricketer2="Sachin";
		if(cricketer1.compareTo(cricketer2)>0) {
			System.out.println("String 1 that is "+cricketer1+" is greater");
		}
		else if(cricketer1.compareTo(cricketer2)<0){
			System.out.println("String 2 that is "+cricketer1+" is greater");
		}
		else {
			System.out.println("Strings Are Equal");
		}
	}

}
