package logical.question;

import java.util.Scanner;

/*when size of the array and elements are unknown to the user
or have to take during run time*/

public class CreateArray2 {
	
	static Scanner sc =new Scanner(System.in);

	public static void main(String[] args) {
		
	
		System.out.println("Enter the size of the array");
		int size =sc.nextInt();
		
		System.out.println("Enter the elements of "+ size + " array:");
		
		
		createArray(size);
	}
	
	public static void createArray(int size) {
		int []arr=new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
	}

}
