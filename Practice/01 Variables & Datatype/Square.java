// Question 2: In a program, input the side of a square. You have to output the area of the square.
import java.util.*;
public class Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        int side=sc.nextInt();
        System.out.println("Area of Square :"+ side*side);
        sc.close();
    }
}
