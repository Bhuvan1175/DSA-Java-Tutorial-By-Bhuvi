import java.util.*;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double radius = sc.nextDouble();
        double pi=3.14;
        double area = pi * radius * radius;
        System.out.println("The area of the circle is : "+area);
        sc.close();
    }
}
