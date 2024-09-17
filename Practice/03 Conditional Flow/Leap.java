// Question 5 : Write a Java program that takes a year from the user and print whether that
// year is a leap year or not.
import java.util.Scanner;
public class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        if(year %4==0 || year%100==0|| (year%400==0)){
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+" is not a leap year");
        }
        sc.close();
    }
}
