import java.util.Scanner;

public class averagenNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Any Number :");
        int n=input.nextInt();
        if(n<=0){
            System.out.println("Invalid Input, please Try Again!");
        }
        double sum=0;
        System.out.println("Enter the " + n + " numbers:");
        for(int i=1;i<=n;i++){
            double num=input.nextDouble();
            sum+=num;
        }
        double average=sum/n;
        System.out.printf("The Average of %d numbers is: %.2f",n,average);
        input.close();
    }    
}
