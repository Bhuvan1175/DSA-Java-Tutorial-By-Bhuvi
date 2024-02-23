//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Value Of A :");
        int A=input.nextInt();
        System.out.println("Enter The Value Of B : ");
        int B=input.nextInt();
        System.out.println("Choose  An Operator (+, - ,*,/) : ");
        String op=input.next();
        if(op.equals("+")){
            int Add=A+B;
            System.out.println("Addition : "+Add);
        }
        else if(op.equals("-")){
            int Sub=A-B;
            System.out.println("Substraction : "+Sub);
        }
        else if(op.equals("*")){
            int Mul=A*B;
            System.out.println("Multiplication : "+Mul);
        }
        else if(op.equals("/")){
            int Div=A*B;
            System.out.println("Division : "+Div);
        }
        else{
            System.out.println("Invalid Operator");
        }
        input.close();
    }
}
