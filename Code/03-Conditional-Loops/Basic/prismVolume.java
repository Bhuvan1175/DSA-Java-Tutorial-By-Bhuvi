import java.util.Scanner;

public class prismVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Length of  the Prism:");
        double length = input.nextDouble();
        System.out.println("Enter The Width of the Base of the Prism:");
        double Width = input.nextDouble();
        System.out.println("Enter The Height of the Prism:");
        double Height = input.nextDouble();
        double VOP = length * Width * Height;
        System.out.println("Volume of Rectangular Prism :" + VOP);
        input.close();
    }
}
