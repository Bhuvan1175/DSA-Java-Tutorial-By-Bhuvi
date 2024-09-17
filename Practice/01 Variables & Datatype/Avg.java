
// Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
import java.util.*;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int A = sc.nextInt();
        System.out.println("Enter the Second number :");
        int B = sc.nextInt();
        System.out.println("Enter the Third number :");
        int C = sc.nextInt();
        double Avg = (A + B + C) / 3;
        System.out.println("Average of " + A + " , " + B + " , " + C + " , : " + Avg);
        sc.close();
    }
}
