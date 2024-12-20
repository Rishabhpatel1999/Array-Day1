package logical.question;

import java.util.Scanner;

/*Create a program that accepts the size of an array from the user,
initializes the array with random numbers between 1 and 100, and 
prints the array.*/

public class RandomArray {

	public static void main(String[] args) {
		
		int []nums=createArray();
		printArray(nums);
		
	}
	
	public static int[] createArray() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		//System.out.println("Enter the elements of "+ size+" size array:");
		int []arr= new int [size];
		System.out.println("Enter min value");
		int min =sc.nextInt();
		System.out.println("Enter max value");
		int max =sc.nextInt();
		 
		for(int i=0;i<size;i++) {
			arr[i]=min+(int) (Math.random() * (max-min)+1);
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
