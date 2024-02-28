import java.util.Scanner;

public class commisionPercentage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Total Commision :");
        double totalCommision = input.nextDouble();
        System.out.println("Enter the Total Sales :");
        double totalSales = input.nextDouble();
        double commisionPercentage=(totalCommision/totalSales)*100;
        System.out.println("Commision Percentage  is "+commisionPercentage+"%");
        input.close();
    }
}
