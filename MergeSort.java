import java.util.*;

public class MergeSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of an array : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter the elements : ");
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		
		a = mergeSort(a);
		
		System.out.println("Sorted elements : ");
		for(int i=0; i<n; i++){
			System.out.print(a[i]+ " ");
		}
		
		sc.close();
	}
	
	public static int[] mergeSort(int a[]){
		int n = a.length;
		
		if(n<2){
			return a;
		}
		
		int mid = n/2;
		
		int left[] = new int[mid];
		int right[] = new int[n-mid];
		
		for(int i=0; i<mid; i++){
			left[i] = a[i];
;		}
		for(int i=mid; i<n; i++){
			right[i-mid] = a[i];
		}
		mergeSort(left);
		mergeSort(right);
		a = merge(left, right, a);
		return a;
	}
	
	public static int[] merge(int left[], int right[], int a[]){
		int m = left.length;
		int n = right.length;
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < m && j < n){
			if(left[i] <= right[j]){
				a[k] = left[i];
				k++;
				i++;
			}
			else{
				a[k] = right[j];
				j++;
				k++;
			}
		}
		
		while(i < m){
			a[k] = left[i];
			k++;
			i++;
		}
		while(j < n){
			a[k] = right[j];
			j++;
			k++;
		}
		
		return a;
	}
}
