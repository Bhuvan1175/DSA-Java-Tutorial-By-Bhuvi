import java.util.Scanner;

public class parallelogramPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of A :");
        double a = input.nextDouble();
        System.out.println("Enter the value of B :");
        double b = input.nextDouble();
        double POPL = 2 * a + 2 * b;
        System.out.println("Perimeter of Parallelogram :" + POPL);
        input.close();

    }
}
