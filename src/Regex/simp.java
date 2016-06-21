package Regex;
import java.util.regex.*;

public class simp {

    public static void main(String args[]) {
        System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
        System.out.println(Pattern.matches("[a m n]", "la"));//true (among a or m or n)  
        System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  
        System.out.println(Pattern.matches(".*am.*", "ammmna"));
    }
}
