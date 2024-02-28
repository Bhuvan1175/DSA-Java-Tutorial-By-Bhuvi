import java.util.Scanner;

public class twoPtDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first coordinate of first point (x1,y1)");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter the Second coordinate of first point (x2,y2)");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double Distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the two points is:" + Distance);
        input.close();
    }
}
