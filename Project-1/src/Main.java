import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Array..");
		int arr[]= new int [scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements:");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array Elements before sorting");
		for(int i=0; i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		KodNestSearchSort kss= new KodNestSearchSort();
		while(true) {
			System.out.println("Enter Your Choice:");
			System.out.println("Press 1------>searching");
			System.out.println("Press 2------>sorting");
			System.out.println("Press 3------>Finding Minimum or Maximum");
			System.out.println("Press any other for TATA BYE BYE!");
			int choice=scan.nextInt();
			switch(choice) {
			case 1: System.out.println("LINEAR SEARCH -->1 or BINARY SEARCH--->2");
			int choice1=scan.nextInt();
			if(choice1==1) {
				System.out.println("Enter Key to Search");
				int key=scan.nextInt();
				int res=kss.linearSearch(arr,key);
				if(key>=0) 
				System.out.println("Key Found @ "+res);
				else
					System.out.println("Key Not Found");
			}
			else if(choice1==2) {
				System.out.println("Enter Key to Search");
				int key=scan.nextInt();
				int res=kss.binarySearch(arr,key);
				if(key>=0) 
				System.out.println("Key Found @ "+res);
				else
					System.out.println("Key Not Found");
			}
			else {
				System.out.println("Go to Vasan Eye Care..");
				return;
			}
				break;
			case 2:
				System.out.println("Press1 ---->Bubble");
				System.out.println("Press2 ---->Selection");
				System.out.println("Press3 ---->Insertion");
				int choice2=scan.nextInt();
				if(choice2==1) {
					System.out.println("Enter 1 for Ascending sort and 2 for Descending sort..");
					int choice3=scan.nextInt();
					if(choice3==1)
					kss.bubbleSortAscending(arr);
					else if(choice3==2) {
						kss.bubbleSortDescending(arr);
					}
					else {
						System.out.println("Go to Vasan Eye Care..");
					}
				}
				else if(choice2==2) {
					System.out.println("Enter 1 for Ascending sort and 2 for Descending sort..");
					int choice3=scan.nextInt();
					if(choice3==1)
					kss.selectionSortAscending(arr);
					else if(choice3==2) {
						kss.selectionSortDescending(arr);
					}
					else {
						System.out.println("Go to Vasan Eye Care..");
					}
				}
				else if(choice2==3){
					System.out.println("Enter 1 for Ascending sort and 2 for Descending sort..");
					int choice3=scan.nextInt();
					if(choice3==1)
					kss.insertionSortAscending(arr);
					else if(choice3==2) {
						kss.insertionSortDescending(arr);
					}
					else {
						System.out.println("Go to Vasan Eye Care..");
					}
				}
				else {
					System.out.println("Go to Vasan Eye Care..");
					return;
				}
				break;
			case 3:
				System.out.println("Press1---->min");
				System.out.println("Press2---->max");
				int choice4=scan.nextInt();
				if(choice4==1) {
					int res=kss.findMin(arr);
					System.out.println("Minimum element is: "+res);
				}
				else if(choice4==2) {
					int res=kss.findMax(arr);
					System.out.println("Maximum element is: "+res);
				}
				else {
					System.out.println("Go to Vasan Eye Care..");
					return;
				}
				break;
			default: System.out.println("TATA BYE BYE..");
				return;
				
			}
		}
		
	}

}
