import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter the elements : ");
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		
		a = selectionSort(a, n);
		
		System.out.println("Sorted Array : ");
		for(int i=0; i<n; i++){
			System.out.print(a[i]+ " ");
		}
		
		sc.close();
	}
	
	public static int[] selectionSort(int a[], int n){
		
		for(int i=0; i<n; i++){
			int iMin = i;
			for(int j=i+1; j<n; j++){
				if(a[j] < a[i]){
					iMin = j;
				}
			}
			int temp = a[i];
			a[i] = a[iMin];
			a[iMin] = temp;
		}
		return a;
	}

}
