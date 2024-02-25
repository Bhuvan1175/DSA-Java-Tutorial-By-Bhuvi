import java.util.Scanner;

public class equilateralTrianglePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Value of Side :");
        double side = input.nextDouble();
        double POET = 3 * side;
        System.out.println("Perimeter of Equilateral Triangle :" + POET);
        input.close();
    }
}
