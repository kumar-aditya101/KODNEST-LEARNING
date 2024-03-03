
public class KodNestSearchSort {
	int i;
	int linearSearch(int arr[],int key)
	{ 
		for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]==key) {
			return i;
		}
		}
			
		return -1;
	}
	
	int binarySearch(int arr[],int key){
		int low=0;
		int high = arr.length-1;
		while(low<=high) {
			int mid= (low+high)/2;
			if(key==arr[mid]) {
				return mid;
			}
			else if(key<arr[mid]) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}

	return -1;
	}
	
	void bubbleSortAscending(int arr[]) {
		for(int i=0; i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-2-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Array Element After Sorting..");
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
		
	}


	void bubbleSortDescending(int arr[]){
		for(int i=0; i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-2-i;j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Array Element After Sorting..");
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	void selectionSortAscending(int arr[]){
		int min;
		int pos;
		for(int i=0;i<=arr.length-2;i++) {
			min= arr[i];
			pos=i;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[j]<min) {
					min=arr[j];
					pos=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		System.out.println("Array Element After Sorting..");
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
	}

	void selectionSortDescending(int arr[]){
		int min;
		int pos;
		for(int i=0;i<=arr.length-2;i++) {
			min= arr[i];
			pos=i;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[j]>min) {
					min=arr[j];
					pos=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		System.out.println("Array Element After Sorting..");
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
	}

	void insertionSortAscending(int arr[]){
		for(int i=1;i<=arr.length-1;i++){
			int item = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>item){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
		System.out.println();
		System.out.println("Array Element After Insertion Sort in Ascending..");
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
	}

	void insertionSortDescending(int arr[]){
		for(int i=1;i<=arr.length-1;i++){
			int item = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]<item){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
		System.out.println();
		System.out.println("Array Element After Insertion Sort in descending..");
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
	}

	int findMin(int arr[]){
		int i;
        
        // Initialize maximum element
        int min = arr[0];
         
        // Traverse array elements from second and
        // compare every element with current min
        for (i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];
         
        return min;
	}

	int findMax(int arr[]){
		int i;
        
        // Initialize maximum element
        int max = arr[0];
         
        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
         
        return max;
	}
}
