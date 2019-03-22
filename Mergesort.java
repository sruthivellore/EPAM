import java.util.*;

class Mergesort{
	static void merge(int[] temp, int x, int mid, int h){
		int i = mid+1;
		int k = x;
		int l = x;
		int[] input = new int[temp.length];
		for(int p = 0; p < temp.length; p++){
			input[p] = temp[p];
		}
		while(l <= mid && i <= h){
			if(input[l] <= input[i]){
				temp[k] = input[l];
				l++;
				k++;
			}else{
				temp[k] = input[i];
				i++;
				k++;
			}
		}
		while(l <= mid){
			temp[k] = input[l];
			l++;
			k++;
		}
		while(i <= h){
			temp[k] = input[i];
			i++;
			k++;
		}

	}
	static void mergeSort(int input[], int l , int h)
	       {
		     int  mid ;
		if(l < h){
		mid = (l + h) / 2;
		mergeSort(input, l, mid);
		mergeSort(input, mid+1, h);
		merge(input, l, mid, h);
		System.out.println("Processing:");
		printArr(input);
		}
	}

	static void printArr(int[] a){
		int n = a.length;
		for(int i =0; i < n;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		System.out.println("Enter the elements into the array:");
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = sc.nextInt();
		}
		mergeSort(input, 0, size-1);
		System.out.println("After Sorting:");
                printArr(input);
	}
}
