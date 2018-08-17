import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter the elements : ");
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		
		a = bubbleSort(a, n);
		
		System.out.println("Sorted Array : ");
		for(int i=0; i<n; i++){
			System.out.print(a[i]+ " ");
		}
		
		sc.close();

	}
	
	public static int[] bubbleSort(int a[], int n){
		
		for(int i=0; i<n-1; i++){
			int flag = 0;
			for(int j=0; j<n-1-i; j++){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
					flag = 1;
				}
			}
			if(flag==0){
				break;
			}
		}
		return a;
	}

}
