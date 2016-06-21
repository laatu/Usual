package usual.some;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Worde2 {

    public static void main(String[] args) {
        String a = "a12 44 ax42 magga mag4ji jaggu6 422";
        System.err.println("Enter here");
//        Scanner sc=new Scanner(System.in);
//                String a=sc.nextLine();
        String[] ar = a.split(" ");
        Pattern p = Pattern.compile(a);
        Matcher m;

        for (String j : ar) {

            if (j.matches(".*\\d+.*")) {
//           if (j.matches("(.*)(\\d+)(.*)")) {
//                //      if (j.matches("\\D+")) {
                System.out.print(j + " ");
            }
        }
        m = p.matcher(".*\\d+");
        System.out.println("\n"+m.toString());
    }

}
