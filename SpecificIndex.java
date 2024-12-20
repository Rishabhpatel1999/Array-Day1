package logical.question;

public class SpecificIndex {

public static void main(String[] args) {
		
		int [] arr= {100, 200, 300, 400, 500};
		printArray(arr);
		System.out.println("element at 3 index is:");
		System.out.println(arr[3]);
	}
	
    public static void printArray(int []arr)
      {
    	System.out.println("elements are:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
      }


}
