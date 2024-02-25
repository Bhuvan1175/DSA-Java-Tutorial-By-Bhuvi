import java.util.Scanner;

public class isoscelesTriangle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter The Base of Isosceles Triangle :");
        double Base=input.nextDouble();
        System.out.print("Enter The Height of Isosceles Triangle :");
        double Height=input.nextDouble();
        double AOST=(Base*Height)/2;
        System.out.print("Are Of Isoscles Triangle :"+AOST);
        input.close();
    }    
}
