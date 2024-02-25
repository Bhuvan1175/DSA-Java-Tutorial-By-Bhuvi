import java.util.Scanner;

public class squarePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Value Of Side :");
        int side = input.nextInt();
        double POS = 4 * side;
        System.out.println("Perimeter of Square :" + POS);
        input.close();
    }
}
