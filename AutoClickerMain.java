import java.awt.*;
import java.awt.event.*;
import java.io.*;


import java.util.Random; 



/**
 * Simple auto-clicker.
 * 
 * @author Bradley Carels
 */
public class AutoClickerMain {

   public static int rate = 2000;

   public static void main(String[] args) {
         try {
         Robot robot = new Robot();
         Random random = new Random();
            try {
                for(int i = 0; i < 15000; i++) {
                   // agility
                int test = random.nextInt(1500) + 1000;
                // nmz
                // int test = random.nextInt(15000) + 30000;

                System.out.println(test);
                            


                Thread.sleep(test);

                robot.mousePress(1024);
                robot.mouseRelease(1024);
                Thread.sleep(1000);
                  robot.mousePress(1024);
                robot.mouseRelease(1024);
                }
               
            } catch (InterruptedException ex) {}
         
      } catch (AWTException e) {}
    

       }
   }
