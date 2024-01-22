package Level_1;

public class MutableString {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Rama");
		System.out.println(sb);
		sb.append("Sita");
		System.out.println(sb);
		System.out.println("=========================");
		StringBuilder sb1 = new StringBuilder("Kodnest");
		System.out.println(sb1);
		sb1.append("Technology");
		System.out.println(sb1);

	}

}
