import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Exercise2 {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot(); // creating Robot instance

        robot.keyPress(KeyEvent.VK_WINDOWS); // open Start menu
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.delay(5000);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyPress(KeyEvent.VK_T);
        robot.delay(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(3000);
         //Move mouse to X Y coordinates
        robot.mouseMove(630, 420);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        //Draw line
        robot.mouseMove(730, 420);
        //Release mouse click
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}
