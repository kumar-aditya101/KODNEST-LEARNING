import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//Asking the total number of students
		System.out.println("Enter the number of student objects");
		int studentCount = scan.nextInt();
		//Creating the array for storing the student objects
		Student [] arr = new Student[studentCount];
		//Creating and storing the students objects in the array
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the rollNo of student "+(i+1));
			int rollNo = scan.nextInt();
			System.out.println("Enter the name of student "+(i+1));
			String name = scan.next();
			System.out.println("Enter the age of student "+(i+1));
			int age = scan.nextInt();
			arr[i] = new Student(rollNo,name,age);
		}
		
		System.out.println("The students details are: ");
		for(int i=0; i<=arr.length-1;i++) {
			System.out.println(arr[i].rollNo+" "+arr[i].name+" "+arr[i].age);
		}
		
		/*
		or,
		
		Student s1 = new Student (1,"Ajay",21);
		Student s2 = new Student (2,"Anshu",22);
		Student s3 = new Student (3,"Komal",23);
		
		Student arr[] = new Student [3];
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		
		System.out.println("The students details are: ");
		for(int i=0; i<=arr.length-1;i++) {
			System.out.println(arr[i].rollNo+" "+arr[i].name+" "+arr[i].age);
		}
		
		*/
		
		
		
		
		
	}

}
