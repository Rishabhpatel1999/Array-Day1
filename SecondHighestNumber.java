package logical.question;

import java.util.Scanner;

/*print second highest number without array or collection */


public class SecondHighestNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements you want to input:");
        int n = sc.nextInt();

        // Handle edge case where fewer than 2 numbers are entered
        if (n < 2) {
            System.out.println("You need to enter at least 2 numbers to find the second largest.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) { // Iterate 'n' times
            int num = sc.nextInt(); // Read the next number
            
            if (num > largest) { 
                // Update largest and secondLargest
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                // Update secondLargest if num is smaller than largest but greater than current secondLargest
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number (all numbers are the same).");
        } 
        else {
            System.out.println("The second largest number is: " + secondLargest);
        }

        sc.close();
    }
}


