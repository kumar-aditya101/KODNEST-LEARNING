package Level_2;

public class RotationApp {
	public void rotationClockwise(int arr[],int k){
		for(int count=1;count<=k;count++){
			int temp=arr[arr.length-1];
			for(int i=arr.length-2;i>=0;i--){
				arr[i+1]=arr[i];
			}
			arr[0]=temp;
		}
		
		System.out.println("After "+k+"th times Rotation Array Element Are-->");
		for(int i=0; i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}

	}
	
	public void rotationReverse(int arr[],int k){
		for(int count=1;count<=k;count++){
			int temp = arr[0];
			for(int i=1;i<=arr.length-1;i++){
				arr[i-1]=arr[i];
			}
			arr[arr.length-1]=temp;
			}
			
			System.out.println();
					
			System.out.println("After "+k+"th times Reversed Rotation Array Element Are-->");
			for(int i=0; i<=arr.length-1;i++){
				System.out.print(arr[i]+" ");
			}
	}

}
