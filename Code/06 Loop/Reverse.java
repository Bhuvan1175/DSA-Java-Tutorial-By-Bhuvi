import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
            int rem=num%10;
            // System.out.print(rem);
            rev=(rev*10)+rem;
            num/=10;
        }
        System.out.println(rev);
        sc.close();
    }
}
