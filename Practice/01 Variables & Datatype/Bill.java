// Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.
import java.util.Scanner;
public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencilCost, penCost, eraserCost;
        System.out.println("Enter the cost of a pencil: ");
        pencilCost=sc.nextFloat();
        System.out.println("Enter the cost of a pen: ");
        penCost=sc.nextFloat();
        System.out.println("Enter the cost of an eraser: ");
        eraserCost=sc.nextFloat();
        double total = pencilCost + penCost + eraserCost;
        double withGST=total*0.18;
        double totalCost = total + withGST;
        System.out.println("The total cost of the items is: "+totalCost);
        sc.close();
    }
}
