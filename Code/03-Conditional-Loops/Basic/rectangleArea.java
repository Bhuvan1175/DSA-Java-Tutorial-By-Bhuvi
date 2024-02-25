import java.util.Scanner;

public class rectangleArea {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print( "Enter the length of the rectangle:");
        double Length=input.nextDouble();
        System.out.print("Enter the breadth of the rectangle:");
        double  Breadth=input.nextDouble();
        double AOR=Length*Breadth;
        System.out.print("Area of Rectangle :"+AOR);
        input.close();
    }    
}
