import java.util.Scanner;

public class largestNumFromAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = Integer.MIN_VALUE; // Initialize largest to the smallest possible value
        
        System.out.println("Enter integers (enter 0 to finish): ");
        int num = sc.nextInt();
        
        while(num != 0){
            if(num > largest){
                largest = num;
            }
            num = sc.nextInt();
        }
        
        if(largest != Integer.MIN_VALUE){
            System.out.println("The Largest Number Entered is: " + largest);
        } else {
            System.out.println("No number entered");
        }
        
        sc.close();
    }
}
