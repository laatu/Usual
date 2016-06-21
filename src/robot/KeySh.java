package robot;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KeySh {
    public static void main(String[] args) throws AWTException, InterruptedException {      
        runjar();
        //typeshell();
   //     runEdit();
   Thread.sleep(1000);
   if(Key.press("my name is anuj"))
   System.out.println("done");
    }

    public static void runEdit() throws IOException {
//Runtime.getRuntime().exec("notepad"); 
        Runtime.getRuntime().exec("gedit");
    }

    public static void runNote() throws IOException {
        Runtime.getRuntime().exec("notepad");
//            Runtime.getRuntime().exec("gedit");
    }

    public static void pressEnter(Robot bot) {
        bot.keyPress(KeyEvent.VK_ENTER);
        bot.delay(40);
        bot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static void typeshell() {
        Robot bot;
        try {
            bot = new Robot();
            bot.delay(1000);
            bot.keyPress(KeyEvent.VK_J);
            bot.keyRelease(KeyEvent.VK_J);
            bot.keyPress(KeyEvent.VK_A);
            bot.keyRelease(KeyEvent.VK_A);
            bot.keyPress(KeyEvent.VK_V);
            bot.keyRelease(KeyEvent.VK_V);
            bot.keyPress(KeyEvent.VK_A);
            bot.keyRelease(KeyEvent.VK_A);
            bot.keyPress(KeyEvent.VK_SPACE);
            bot.keyRelease(KeyEvent.VK_SPACE);
            bot.keyPress(KeyEvent.VK_SUBTRACT);
            bot.keyRelease(KeyEvent.VK_SUBTRACT);
            bot.keyPress(KeyEvent.VK_J);
            bot.keyRelease(KeyEvent.VK_J);
            bot.keyPress(KeyEvent.VK_A);
            bot.keyRelease(KeyEvent.VK_A);
            bot.keyPress(KeyEvent.VK_R);
            bot.keyRelease(KeyEvent.VK_R);
            bot.keyPress(KeyEvent.VK_SPACE);
            bot.keyRelease(KeyEvent.VK_SPACE);
            bot.keyPress(KeyEvent.VK_PERIOD);
            bot.keyPress(KeyEvent.VK_J);
            bot.keyRelease(KeyEvent.VK_J);
            bot.keyPress(KeyEvent.VK_A);
            bot.keyRelease(KeyEvent.VK_A);
            bot.keyPress(KeyEvent.VK_R);
            bot.keyRelease(KeyEvent.VK_R);
            bot.keyPress(KeyEvent.VK_A);
            bot.keyRelease(KeyEvent.VK_A);
           
            
            bot.delay(500);
//            bot.keyPress('l');
//            bot.delay(100);
//            bot.keyRelease('l');
//            bot.keyPress('s');
//            bot.keyRelease('s');

        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }

    public static void runjar() {
        Robot bot;

        try {
            bot = new Robot();
            bot.delay(4000);
            bot.keyPress(KeyEvent.VK_CONTROL);
//        bot.delay(100);
            bot.keyPress(KeyEvent.VK_ALT);
            //      bot.delay(100);
            bot.keyPress(KeyEvent.VK_T);
            //    bot.delay(500);
            bot.keyRelease(KeyEvent.VK_CONTROL);
            bot.keyRelease(KeyEvent.VK_ALT);
            bot.keyRelease(KeyEvent.VK_T);
            bot.delay(600);

        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
