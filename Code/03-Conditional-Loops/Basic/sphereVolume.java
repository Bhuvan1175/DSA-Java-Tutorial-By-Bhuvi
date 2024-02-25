import java.util.Scanner;

public class sphereVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Emter The value of Radius :");
        double r = input.nextDouble();
        double VOS = (4.0 / 3) * Math.PI * r * r * r;
        System.out.println("The Volume of cone :" + VOS);
        input.close();
    }
}
