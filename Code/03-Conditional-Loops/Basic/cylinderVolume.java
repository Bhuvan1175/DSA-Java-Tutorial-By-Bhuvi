import java.util.Scanner;

public class cylinderVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Emter The value of Radius :");
        double r = input.nextDouble();
        System.out.println("Emter The value of Height :");
        double h = input.nextDouble();
        double VOCY = Math.PI * r * r * h;
        System.out.println("The Volume of Cylinder :" + VOCY);
        input.close();
    }
}
