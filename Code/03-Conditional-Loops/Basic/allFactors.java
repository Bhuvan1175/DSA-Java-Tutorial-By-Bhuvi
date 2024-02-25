import java.util.Scanner;

public class allFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number:");
        int num = sc.nextInt();
        System.out.println("Factors of " + num + " is :");
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}