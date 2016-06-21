package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Opt {

    public static void w(char b) throws AWTException {
        System.out.print(b);
        Robot bot = new Robot();
        //bot.keyPress(KeyEvent.vk);
        switch (b) {
            case ' ':
                bot.keyPress(KeyEvent.VK_SPACE);
                bot.keyRelease(KeyEvent.VK_SPACE);
                break;
            case 'a':
                bot.keyPress(KeyEvent.VK_A);
                bot.keyRelease(KeyEvent.VK_A);
                break;
            case 'A':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_A);
                bot.keyRelease(KeyEvent.VK_A);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'b':
                bot.keyPress(KeyEvent.VK_B);
                bot.keyRelease(KeyEvent.VK_B);
                break;
            case 'B':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_B);
                bot.keyRelease(KeyEvent.VK_B);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'c':
                bot.keyPress(KeyEvent.VK_C);
                bot.keyRelease(KeyEvent.VK_C);
                break;
            case 'C':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_C);
                bot.keyRelease(KeyEvent.VK_C);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'd':
                bot.keyPress(KeyEvent.VK_D);
                bot.keyRelease(KeyEvent.VK_D);
                break;
            case 'D':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_D);
                bot.keyRelease(KeyEvent.VK_D);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'e':
                bot.keyPress(KeyEvent.VK_E);
                bot.keyRelease(KeyEvent.VK_E);
                break;
            case 'E':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_E);
                bot.keyRelease(KeyEvent.VK_E);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'f':
                bot.keyPress(KeyEvent.VK_F);
                bot.keyRelease(KeyEvent.VK_F);
                break;
            case 'F':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_F);
                bot.keyRelease(KeyEvent.VK_F);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'g':
                bot.keyPress(KeyEvent.VK_G);
                bot.keyRelease(KeyEvent.VK_G);
                break;
            case 'G':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_G);
                bot.keyRelease(KeyEvent.VK_G);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'h':
                bot.keyPress(KeyEvent.VK_H);
                bot.keyRelease(KeyEvent.VK_H);
                break;
            case 'H':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_H);
                bot.keyRelease(KeyEvent.VK_H);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'i':
                bot.keyPress(KeyEvent.VK_I);
                bot.keyRelease(KeyEvent.VK_I);
                break;
            case 'I':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_I);
                bot.keyRelease(KeyEvent.VK_I);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'j':
                bot.keyPress(KeyEvent.VK_J);
                bot.keyRelease(KeyEvent.VK_J);
                break;
            case 'J':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_J);
                bot.keyRelease(KeyEvent.VK_J);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'k':
                bot.keyPress(KeyEvent.VK_K);
                bot.keyRelease(KeyEvent.VK_K);
                break;
            case 'K':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_K);
                bot.keyRelease(KeyEvent.VK_K);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'l':
                bot.keyPress(KeyEvent.VK_L);
                bot.keyRelease(KeyEvent.VK_L);
                break;
            case 'L':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_L);
                bot.keyRelease(KeyEvent.VK_L);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'm':
                bot.keyPress(KeyEvent.VK_M);
                bot.keyRelease(KeyEvent.VK_M);
                break;
            case 'M':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_M);
                bot.keyRelease(KeyEvent.VK_M);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'n':
                bot.keyPress(KeyEvent.VK_N);
                bot.keyRelease(KeyEvent.VK_N);
                break;
            case 'N':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_N);
                bot.keyRelease(KeyEvent.VK_N);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'o':
                bot.keyPress(KeyEvent.VK_O);
                bot.keyRelease(KeyEvent.VK_O);
                break;
            case 'O':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_O);
                bot.keyRelease(KeyEvent.VK_O);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'p':
                bot.keyPress(KeyEvent.VK_P);
                bot.keyRelease(KeyEvent.VK_P);
                break;
            case 'P':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_P);
                bot.keyRelease(KeyEvent.VK_P);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'q':
                bot.keyPress(KeyEvent.VK_Q);
                bot.keyRelease(KeyEvent.VK_Q);
                break;
            case 'Q':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_Q);
                bot.keyRelease(KeyEvent.VK_Q);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'r':
                bot.keyPress(KeyEvent.VK_R);
                bot.keyRelease(KeyEvent.VK_R);
                break;
            case 'R':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_R);
                bot.keyRelease(KeyEvent.VK_R);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 's':
                bot.keyPress(KeyEvent.VK_S);
                bot.keyRelease(KeyEvent.VK_S);
                break;
            case 'S':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_S);
                bot.keyRelease(KeyEvent.VK_S);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 't':
                bot.keyPress(KeyEvent.VK_T);
                bot.keyRelease(KeyEvent.VK_T);
                break;
            case 'T':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_T);
                bot.keyRelease(KeyEvent.VK_T);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'u':
                bot.keyPress(KeyEvent.VK_U);
                bot.keyRelease(KeyEvent.VK_U);
                break;
            case 'U':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_U);
                bot.keyRelease(KeyEvent.VK_U);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'v':
                bot.keyPress(KeyEvent.VK_V);
                bot.keyRelease(KeyEvent.VK_V);
                break;
            case 'V':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_V);
                bot.keyRelease(KeyEvent.VK_V);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'w':
                bot.keyPress(KeyEvent.VK_W);
                bot.keyRelease(KeyEvent.VK_W);
                break;
            case 'W':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_W);
                bot.keyRelease(KeyEvent.VK_W);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'x':
                bot.keyPress(KeyEvent.VK_X);
                bot.keyRelease(KeyEvent.VK_X);
                break;
            case 'X':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_X);
                bot.keyRelease(KeyEvent.VK_X);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'y':
                bot.keyPress(KeyEvent.VK_Y);
                bot.keyRelease(KeyEvent.VK_Y);
                break;
            case 'Y':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_Y);
                bot.keyRelease(KeyEvent.VK_Y);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 'z':
                bot.keyPress(KeyEvent.VK_Z);
                bot.keyRelease(KeyEvent.VK_Z);
                break;
            case 'Z':
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_Z);
                bot.keyRelease(KeyEvent.VK_Z);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case '0':
                bot.keyPress(KeyEvent.VK_0);
                bot.keyRelease(KeyEvent.VK_0);
                break;
            case '1':
                bot.keyPress(KeyEvent.VK_1);
                bot.keyRelease(KeyEvent.VK_1);
                break;
            case '2':
                bot.keyPress(KeyEvent.VK_2);
                bot.keyRelease(KeyEvent.VK_2);
                break;
            case '3':
                bot.keyPress(KeyEvent.VK_3);
                bot.keyRelease(KeyEvent.VK_3);
                break;
            case '4':
                bot.keyPress(KeyEvent.VK_4);
                bot.keyRelease(KeyEvent.VK_4);
                break;
            case '5':
                bot.keyPress(KeyEvent.VK_5);
                bot.keyRelease(KeyEvent.VK_5);
                break;
            case '6':
                bot.keyPress(KeyEvent.VK_6);
                bot.keyRelease(KeyEvent.VK_6);
                break;
            case '7':
                bot.keyPress(KeyEvent.VK_7);
                bot.keyRelease(KeyEvent.VK_7);
                break;
            case '8':
                bot.keyPress(KeyEvent.VK_8);
                bot.keyRelease(KeyEvent.VK_8);
                break;
            case '9':
                bot.keyPress(KeyEvent.VK_9);
                bot.keyRelease(KeyEvent.VK_9);
                break;

            default:
                throw new AssertionError();
        }

    }

    public static void main(String[] args) throws AWTException {
        char[] d = {'a', 'b', 'c', 'd', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Character h;
        for (int i = 0; i < 25; i++) {
            h = d[i];
            System.out.println("case '" + h + "': bot.keyPress(KeyEvent.VK_" + h.toString().toUpperCase() + ");" + "bot.keyRelease(KeyEvent.VK_" + h.toString().toUpperCase() + ");break;");
            System.out.println("case '" + h.toString().toUpperCase() + "': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_" + h.toString().toUpperCase() + ");" + "bot.keyRelease(KeyEvent.VK_" + h.toString().toUpperCase() + "); bot.keyRelease(KeyEvent.VK_SHIFT);break;");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("case '" + i + "': bot.keyPress(KeyEvent.VK_" + i + ");bot.keyRelease(KeyEvent.VK_" + i + ");break;");
        }
    }

}
