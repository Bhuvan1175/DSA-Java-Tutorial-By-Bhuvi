import java.util.Scanner;
public class equilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Value Of Side :");
        int side = input.nextInt();
        double AOET = (Math.sqrt(3) / 4) * side * side;
        System.out.println("Area of Equilteral Triangle :" + AOET);
        input.close();
    }
}
