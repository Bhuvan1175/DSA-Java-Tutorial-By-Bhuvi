// Write a java program to convert kilometer to miles.
import java.util.*;
public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Distance in Kilometer :");
        double km = sc.nextDouble();
        double miles=km*0.621f;
        System.out.println(+km+ " Kilometer Converts into Miles is "+miles+ " miles ");
        sc.close();
    }
}
