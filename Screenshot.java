/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nocr;


 
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
 
import javax.imageio.ImageIO;
 
public class Screenshot {
 
    public static void main(String[] args) throws InterruptedException {
        int loop = -1;
        while (loop < 0) {
                TimeUnit.SECONDS.sleep(1);
                try {
            Robot robot = new Robot();
            String format = "jpg";
            String fileName = "Unprocessed." + format;
             
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            Rectangle captureRect = new Rectangle(725, 1040, 350, 10);
            //Rectangle captureRect = new Rectangle(940, 100, 980, 150 );
            //Rectangle captureRect = new Rectangle(0, 0, 1000, 1000);
            BufferedImage screenFullImage = robot.createScreenCapture(captureRect);
            ImageIO.write(screenFullImage, format, new File(fileName));
           ImageIO.write(screenFullImage, format, new File("C:\\Users\\jgkye\\Documents\\NetBeansProjects\\NoCR\\Pics\\Unprocessed.jpg"));
            System.out.println("A partial screenshot saved!");
        } catch (AWTException | IOException ex) {
            System.err.println(ex);
        }
        }
           
    }
}

