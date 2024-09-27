// Write a java program which ask user  to enter his/her  name and greets them with "hello <Name> have a good day "text.
import java.util.Scanner;
public class Greet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Hello "+name+" have a good day.");
        sc.close();
    }
}
