import java.util.Scanner;

public class pyramidVolume {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // volume of spehere for square
        System.out.println("Enter the Value of Side :");
        double side = input.nextDouble();
        System.out.println("Enter the Value of Height :");
        double Height = input.nextDouble();
        double VOPY=(1.0/3)*side*side*Height;
        System.out.println("Volume of Square Pyramid  is "+VOPY);
        input.close();
    }    
}
