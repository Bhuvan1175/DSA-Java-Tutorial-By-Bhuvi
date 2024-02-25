import java.util.Scanner;

public class parallelogramArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of parallelogram:");
        double Base = input.nextDouble();
        System.out.print("Enter height of parallelogram:");
        double Height = input.nextDouble();
        double AOP = Base * Height;
        System.out.print("Area Of Parallelogram :" + AOP);
        input.close();
    }
}
