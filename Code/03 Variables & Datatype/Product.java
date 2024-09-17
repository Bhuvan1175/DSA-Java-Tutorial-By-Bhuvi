import java.util.*;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int a = sc.nextInt();
        System.out.println("Enter The Number : ");
        int b = sc.nextInt();
        int pro = a * b;
        System.out.println("Product of " + a + " X " + b + " = " + pro);
        sc.close();
    }
}
