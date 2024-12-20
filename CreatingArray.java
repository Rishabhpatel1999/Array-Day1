package logical.question;

/* When array size and elements are known to us */

public class CreatingArray {
	
	public static void main(String[] args) {
		
		int [] arr= {1,3,5,2,4};
		printArray(arr);
		
	}
	
    public static void printArray(int []arr)
      {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
      }


}

