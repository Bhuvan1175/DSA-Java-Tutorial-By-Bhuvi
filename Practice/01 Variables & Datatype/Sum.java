// Write a program to sum three numbers in java.
import java.util.*;
public class Sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Enter third number");
        int c=sc.nextInt();
        int sum=a+b+c;
        System.out.println("Sum of three numbers is "+sum);
        sc.close();
    }
}