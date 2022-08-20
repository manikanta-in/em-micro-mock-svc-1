package eyemed.group;

import java.awt.Robot;
import java.awt.event.InputEvent;

import java.util.Random;

public class MouseClick {

  public static final int MAX_Y = 400;
  public static final int MAX_X = 400;
  public static final int FIVE_SECONDS = 5000;

  public static void main(String args[]) throws InterruptedException {
    Robot bot = null;
    try {
      bot = new Robot();
    } catch (Exception failed) {
      System.err.println("Failed instantiating Robot: " + failed);
    }
    int mask = InputEvent.BUTTON1_DOWN_MASK;
    Random random = new Random();
    while (true) {
      bot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
      bot.mousePress(mask);
      bot.mouseRelease(mask);
      Thread.sleep(FIVE_SECONDS);
    }
  }
}
