// Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        if(num1>num2){
            System.out.println(num1+" is Largest than "+num2);
        }else{
            System.out.println(num1+" is Smallest than "+num2);
        }
        input.close();

        
    }
}
