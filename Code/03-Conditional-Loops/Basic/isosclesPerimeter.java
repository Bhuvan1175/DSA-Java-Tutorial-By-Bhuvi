import java.util.Scanner;

public class isosclesPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Value Of Side-1 :");
        double side_1 = input.nextDouble();
        System.out.println("Enter The Value Of Side-2 :");
        double side_2 = input.nextDouble();
        double POIT = 2 * side_1 + side_2;
        System.out.println("Perimeter of Isoscles Triangle :" + POIT);
        input.close();
    }
}
