// Write a program to find out whether a student is pass or fail , if it requires total 40% and at least 33% in each subject to pass . Assume 3 subject and take marks as an input from user.
import java.util.*;
public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total;
        int Chemistry;
        int Physics;
        int Biology;
        System.out.println("Enter Your Physics Marks :");
        Physics=sc.nextInt();
        System.out.println("Enter Your Chemistry Marks :");
        Chemistry=sc.nextInt();
        System.out.println("Enter Your Biology Marks :");
        Biology=sc.nextInt();
        total=Physics+Chemistry+Biology;
        double per=(total/300.0f)*100;
        if(per>=40 && (Physics>=33 && Chemistry>=33 && Biology>=33)){
            System.out.println("You are Pass");
        }else{
            System.out.println("You are Fail");
        }
        sc.close();
    }
}
