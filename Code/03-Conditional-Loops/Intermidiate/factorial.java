import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number that you want  to find its factorial : ");
        int num = input.nextInt();
        int fact = 1;
        for (int i = num; i > 0; i--) {
            fact *= i;
        }
        System.out.println("Factorial of  " + num + " is : " + fact);
        input.close();
    }
}
