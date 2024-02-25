import java.util.Scanner;

public class circlePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of Radius :");
        double Radius = input.nextDouble();
        double POC = 2 * Math.PI * Radius;
        System.out.println("Perimeter of Circle :" + POC);
        input.close();

    }
}
