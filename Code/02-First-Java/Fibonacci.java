// To calculate Fibonacci Series up to n numbers.

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int i = 0;
        System.out.println(a + " , " + b + " ,");
        while (i < 10) {
            int c = a + b;
            System.out.println(c + " ,");
            a=b;
            b=c;
            i++;
        }

    }
}
