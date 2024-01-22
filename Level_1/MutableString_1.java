package Level_1;

public class MutableString_1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Omkar Is A Batsman");
		System.out.println(sb.capacity());
		sb.append("He Lives In Bangalore");
		System.out.println(sb.capacity());
		

	}

}
