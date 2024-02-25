import java.util.Scanner;

public class rhombusArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Value of Diagonal-1 :");
        double Diagonal_1 = input.nextDouble();
        System.out.print("Enter The Value Of Diagonal-2 :");
        double Diagonal_2 = input.nextDouble();
        double AORH = 0.5 * Diagonal_1 * Diagonal_2;
        System.out.print("Area of Rhombus : " + AORH + " Square Units.");
        input.close();
    }
}
