import java.util.Scanner;

public class triangleArea {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter The value of Base : ");
        double Base =input.nextDouble();
        System.out.print("Enter The value of Height :");
        double Height =input.nextDouble();
        double AOT=0.5*Base*Height;
        System.out.println("Area Of Trianle : "+AOT);
        input.close();
    }    
}
