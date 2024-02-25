
//Subtract the Product and Sum of Digits of an Integer.
import java.util.Scanner;

public class leetCodeque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0, Product = 1;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            Product *= rem;
            n /= 10;
        }
        System.out.println("Sum of the digit of Number " + temp + " is : " + sum);
        System.out.println("Product of the digit of Number " + temp + " is : " + Product);
        sc.close();
    }
}
