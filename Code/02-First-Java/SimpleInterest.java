//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Value of Principal :");
        int Principal = input.nextInt();
        System.out.print("Enter The Value of Rate :");
        int Rate = input.nextInt();
        System.out.print("Enter The Value of Time :");
        int Time = input.nextInt();
        int SI = (Principal * Rate * Time) / 100;
        System.out.println("Simple Interest :" + SI);
        input.close();
    }
}
