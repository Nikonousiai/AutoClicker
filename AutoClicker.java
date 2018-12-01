import java.awt.Robot;

public class AutoClicker {

    private Robot robot;

    private int delay;

    public AutoClicker() {
        try {
        robot = new Robot();
        } catch (Exception e) {
            e.printStackTrace();
        }
        delay = 25;
    }
    public void mousePress(int button) {
        try {
            robot.mousePress(button);
            robot.delay(1);
            robot.mouseRelease(button);
            robot.delay(delay);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setDelay(int ms) {
        this.delay = ms;
    }
}