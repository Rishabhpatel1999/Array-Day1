package logical.question;

import java.util.Scanner;

// creating , printing , method return type as an array //

public class PrintingCreatingAndMethodReturnTypeAsArray {

	public static void main(String[] args) {
		
		int []nums=createArray();
		printArray(nums);
		
	}
	
	public static int[] createArray() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		System.out.println("Enter the elements of "+ size+" size array:");
		int []arr= new int [size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		return arr ;
	}
	
	public static void printArray(int []arr) {
		System.out.println("array is:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
