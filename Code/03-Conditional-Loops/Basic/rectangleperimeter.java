import java.util.Scanner;

public class rectangleperimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of Length :");
        double Length = input.nextDouble();
        System.out.println("Enter the value of Width :");
        double Width = input.nextDouble();
        double POR = 2 * Length + 2 * Width;
        System.out.println("Perimeter of Rectangle :" + POR);
        input.close();

    }
}
