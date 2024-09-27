// Write a program to calculate CGPA using marks of three  subject out off 100.
import java.util.Scanner;
public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Physics :");
        int physics = sc.nextInt();
        System.out.println("Enter your marks in Chemistry :");
        int chemistry = sc.nextInt();
        System.out.println("Enter your marks in Mathematics :");
        int mathematics=sc.nextInt();
        int totalMarks=physics+chemistry+mathematics;
        double percentage=(totalMarks/300.0)*100;
        double cgpa=percentage/9.5;
        System.out.println("Your Obtained CGPA : "+cgpa);
        sc.close();
    }
}
