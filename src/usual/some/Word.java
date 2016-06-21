import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Word {
    public static void main(String[] args) {
        String line="My name is Anuj ,Anuj is a good person Anuj",check="anuj",temp=line;
          int count=0;
//        while(temp.toLowerCase().contains(check.toLowerCase()))
//        {
//            count++;
//            temp=temp.replaceFirst("Anuj", "Bnuj");                   
//        }        
//        System.out.println("The no of Anuj or anuj present: \t"+count);
        
        Pattern p = Pattern.compile(check);
        // get a matcher object
        Matcher m = p.matcher(line);
        while(m.matches()){m.replaceFirst("Anuj");count++;}
        System.out.println(count);
        
    }      
}
    

