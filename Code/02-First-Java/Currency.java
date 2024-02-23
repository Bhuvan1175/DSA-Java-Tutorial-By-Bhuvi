//Input currency in rupees and output in USD.

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter  the amount of money you have in INR:");
        double  rupee =input.nextDouble();
        double USD=rupee/82.89;
        System.out.println(rupee+" Convert into USD is : "+USD);
        input.close();
    }
}
