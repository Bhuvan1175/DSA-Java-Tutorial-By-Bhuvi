import java.util.Scanner;
public class circleArea{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Value of Radius : ");
        int radius=input.nextInt();
        double AOC=Math.PI*radius*radius;
        System.out.print("Area Of Circle : "+AOC);
        input.close();

    }
}