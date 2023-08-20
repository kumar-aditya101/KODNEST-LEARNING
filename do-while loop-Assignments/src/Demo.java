
public class Demo {

	public static void main(String[] args) {
		
	int i = 1;
	golu: do {
	        int j = 1;
	bholu: do {
	            System.out.print("*");
	            j++;
	           break bholu;
	       } while (j <= 5);
	   		System.out.println();
	        i++;
	       break golu;
	    } while (i <= 5); 
	    
	}

}
