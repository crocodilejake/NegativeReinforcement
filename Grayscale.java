/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nocr;

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import java.io.*;

public class Grayscale{
  public static void main(String args[])throws IOException{
      
      int loop = -1;
      int green = 0;
        while (loop < 0) {
           int hurt = 0;
           
           int green1 = green;
            green = 0;
          try {
              
              TimeUnit.SECONDS.sleep(1);
               
          } catch (InterruptedException ex) {
              Logger.getLogger(Grayscale.class.getName()).log(Level.SEVERE, null, ex);
          }
    BufferedImage img = null;
    File f = null;

    //read image
    try{
      f = new File("C:\\Users\\jgkye\\Documents\\NetBeansProjects\\NoCR\\Pics\\Unprocessed.jpg");
      img = ImageIO.read(f);
    }catch(IOException e){
      System.out.println(e);
    }

    //get image width and height
    int width = 350;
    int height = 10;
   //Yes, hardcoding is bad
    //convert to grayscale
    for(int y = 0; y < height; y++){
      for(int x = 0; x < width; x++){
        int p = img.getRGB(x,y);

        int a = (p>>24)&0xff;
        int r = (p>>16)&0xff;
        int g = (p>>8)&0xff;
        int b = p&0xff;
      //  System.out.println(r);



if ( g < 15) {
    green = green + 1;
}
      }
        //calculate average
      //int avg = (r+g+b)/3;

        //replace RGB value with avg
    //  p = (a<<24) | (avg<<16) | (avg<<8) | avg;

   //     img.setRGB(x, y, p);
      }
    if (green1 < green && green1 + 10 < green ) {
        hurt = 1;
    System.out.println("Ow");
    }
    else {System.out.println("No Ow");
    hurt = 0;}
   // System.out.println(hurt);
  //  if (green == 0) {System.out.println("dead");}
    //else {System.out.println("alive");}
      
    File file = new File( "hurt.txt" );
        PrintWriter  output = new PrintWriter( file );
    output.println( hurt );  
    output.close();
    System.out.println(hurt);
             System.out.println(green);
             hurt = 0;
    }

    //write image
 //   try{
 //     f = new File("C:\\Users\\jgkye\\Documents\\NetBeansProjects\\NoCR\\Pics\\Processed.jpg");
  //    ImageIO.write(img, "jpg", f);
 //   }catch(IOException e){
    //  System.out.println(e);

 //   }
       
  
  
  
  }
  }

  