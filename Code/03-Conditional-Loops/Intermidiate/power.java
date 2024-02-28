import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter The Value Of Base :");
        int base=sc.nextInt();
        System.out.println("Enter The Value Of Exponent :");
        int Exponent=sc.nextInt();
        int power=(int)Math.pow(base,Exponent);
        System.out.println("Power of "+base+" & "+Exponent+" is :"+power);
        sc.close();
    }
}
