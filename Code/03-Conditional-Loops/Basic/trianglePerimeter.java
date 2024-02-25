import java.util.Scanner;

public class trianglePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Value Of Side-1 :");
        double side_1 = input.nextDouble();
        System.out.println("Enter The Value Of Side-2 :");
        double side_2 = input.nextDouble();
        System.out.println("Enter The Value Of Side-3 :");
        double side_3 = input.nextDouble();
        double POT = side_1 + side_2 + side_3;
        System.out.println("Perimeter of Triangle :" + POT);
        input.close();
    }
}
