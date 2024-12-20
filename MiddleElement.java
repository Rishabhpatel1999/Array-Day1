package logical.question;

import java.util.Scanner;

public class MiddleElement {

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
		System.out.println("middle elements of the array is:");
		if(arr.length%2==0) {
			System.out.println(arr[(arr.length/2)-1]+","+arr[arr.length/2]);
			//System.out.print(arr[arr.length/2]);
			
		}
		else {
			System.out.println(arr[arr.length/2]);
		}
		
	}
		

}
