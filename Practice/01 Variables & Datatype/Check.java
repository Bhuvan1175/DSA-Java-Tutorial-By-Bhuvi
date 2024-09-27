// Write a java program to detect whether a number entered by user is integer or not.
import java.util.*;
public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Integer Number :");
        System.out.println(sc.hasNextInt());
        sc.close();
    }
}
