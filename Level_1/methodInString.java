package Level_1;

public class methodInString {

	public static void main(String[] args) {
		String str = new String ("Raja Ram Mohan Roy");
		System.out.println(str);
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.indexOf("j"));
		System.out.println(str.charAt(2));
		System.out.println(str.isEmpty());
		System.out.println(str.contains("Ram"));
		System.out.println(str.contains("aam"));
		System.out.println(str.substring(9));
		System.out.println(str.substring(9,13));
		System.out.println(str.length());
		System.out.println(str.trim());
		System.out.println("replace all R With A--> "+(str.replace('R', 'A')));

	}

}
