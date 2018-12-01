import java.awt.event.InputEvent;
import java.lang.Thread;
import java.util.Scanner;

public class AutoClickerMain {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is autoclicker");

        System.out.print("Enter the number of clicks: ");
        int clicks = scanner.nextInt();
        System.out.println();
        
        System.out.print("Delay of clicks: ");
        int delay = scanner.nextInt();
        System.out.println();

        System.out.println("Program starts in couple seconds");

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        AutoClicker clicker = new AutoClicker();
        clicker.setDelay(delay);

        for (int i = 0; i < clicks; i++) {
            clicker.mousePress(InputEvent.BUTTON1_MASK);
        }

        System.out.println("Autoclicker is done.");
    }
}