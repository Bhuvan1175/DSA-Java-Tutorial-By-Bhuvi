import java.util.Scanner;

public class electricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Units :");
        int units = input.nextInt();
        double billAmount;
        if (units <= 100) {
            billAmount = units * 0.2;
        } else if (units <= 300) {
            billAmount = 100 * 20 + (units - 100) * 0.5;
        } else if (units <= 500) {
            billAmount = 100 * 20 + 200 * 0.5 + (units - 300) * 0.8;
        } else {
            billAmount = 100 * 0.2 + 200 * 0.5 + 200 * 0.8 + (units - 500) * 1;
        }
        System.out.println("Total Bill Amount is : "+billAmount+"Rs.");
        input.close();
    }
}
