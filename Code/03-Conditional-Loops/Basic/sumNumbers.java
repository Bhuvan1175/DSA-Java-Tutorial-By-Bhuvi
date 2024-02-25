//•	Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.Scanner;
public class sumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers (enter 0 to finish): ");
        int num = sc.nextInt();
        int sum=0;
        while(num>0){
            sum+=num;
            num = sc.nextInt();
        }
        System.out.println("Sum of the numbers entered: " + sum);
        sc.close();
    }
}
