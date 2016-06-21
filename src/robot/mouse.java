
package robot;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author laatuji
 */
public class mouse {
    public static void main(String[] args)  throws Exception{
        
        Robot r=new Robot();
        r.mouseMove(800, 110);
        
        
        r.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
        r.delay(2000);
        r.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
        //r.mousePress(MouseEvent.TEXT_EVENT_MASK);
        r.mousePress(MouseEvent.BUTTON3_DOWN_MASK);
        r.mouseRelease(MouseEvent.BUTTON3_DOWN_MASK);
        
        
        
    }
    
}
