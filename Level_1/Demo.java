package Level_1;

public class Demo {

	public static void main(String[] args) {
		char x='p';
		System.out.println(x);
		int m=x; //Implict Type Casting 
		 
		System.out.println(m);
		m=m-32;
		x=(char)m; //Explict Type Casting 
		System.out.println(x);

	}

}
