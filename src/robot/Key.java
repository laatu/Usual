package robot;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.Delayed;
public class Key {
    public static boolean press(String s) throws AWTException {
        for (char t : s.toCharArray()) {
            //System.out.print(t);
            Opt.w(t); //Thread.sleep(100);
        }
        return true;
    }
}
    //Opt.w('a'); //aA0 
    //Opt.w('A');   //my name is anuj
    //Opt.w('0');   //my aname ais aanuj
    //Opt.w('!');
//        Robot bot= new Robot();
//        bot.delay(700);
//        bot.keyPress('l');
//        bot.delay(100);
//        bot.keyRelease('l');
//        bot.delay(100);
//        bot.keyPress('s');
//        bot.delay(100);
//        bot.keyRelease('s');
//        bot.delay(100);

