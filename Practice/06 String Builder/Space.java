// Write a java program to detect double and triple space in a string.
public class Space {
    public static void main(String[] args) {
        String str = "Hello   World  !";
        System.out.println(str.indexOf("   "));
        System.out.println(str.indexOf("  "));
    }
}
