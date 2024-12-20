package logical.question;

public class AddFirstAndLastElementOfArray {

public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5,6};
		System.out.println("elements are:");
		printArray(arr);
		
		
	}
	
    public static void printArray(int []arr)
      {
    	
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("addition of the first and last elements are:");
		System.out.println(arr[0]+arr[arr.length-1]);
		
      }

}
