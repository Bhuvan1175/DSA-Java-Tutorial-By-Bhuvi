//To find out whether the given String is Palindrome or not.

public class Palindrome {
    public static void main(String[] args) {
        String str = "NAYAN";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Its  a palindrome");
        }else{
            System.out.println("Not Palindrom");
        }
    }
}
