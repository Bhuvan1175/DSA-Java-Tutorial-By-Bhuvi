import java.util.Scanner;

public class productDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter tHe Total Bill Of The Product :");
        double OriginalPrice = input.nextDouble();
        if (OriginalPrice <= 100) {
            double discountRate = 0.05;// 5% Discount
            double discountAmount = OriginalPrice * discountRate;
            double FinalPrice = OriginalPrice - discountAmount;
            System.out.println("The Discount on Rs " + OriginalPrice + " is : " + FinalPrice);
        } else if (OriginalPrice <= 300) {
            double discountRate = 0.10;
            double discountAmount = OriginalPrice * discountRate;
            double FinalPrice = OriginalPrice - discountAmount;
            System.out.println("The Discount on Rs " + OriginalPrice + " is : " + FinalPrice);
        } else if (OriginalPrice <= 500) {
            double discountRate = 0.13;
            double discountAmount = OriginalPrice * discountRate;
            double FinalPrice = OriginalPrice - discountAmount;
            System.out.println("The Discount on Rs " + OriginalPrice + " is : " + FinalPrice);
        } else if (OriginalPrice <= 1000) {
            double discountRate = 0.25;
            double discountAmount = OriginalPrice * discountRate;
            double FinalPrice = OriginalPrice - discountAmount;
            System.out.println("The Discount on Rs " + OriginalPrice + " is : " + FinalPrice);
        } else {
            System.out.println("Thank You for Comming !!");
        }
        input.close();
    }
}
