/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurkellecioglu.asciicode;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author ugur
 */
public class Photo {
    File file ;
    BufferedImage bufferedImage;
    


    public Photo() {
        file = new File("/home/ugur/NetBeansProjects/AsciiCode/src/main/java/com/ugurkellecioglu/asciicode/image.jpg");
        
        try {
            bufferedImage = ImageIO.read(file);
            /*
            try {
            url = new URL(this.getClass().getResource("image.jpg").toString());
            } catch (MalformedURLException ex) {
            Logger.getLogger(Photo.class.getName()).log(Level.SEVERE, null, ex);
            }
            file = new File(url.getFile());
            System.out.println(file);
            */
        } catch (IOException ex) {
            Logger.getLogger(Photo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

    public void setBufferedImage(BufferedImage bufferedImage) {
        this.bufferedImage = bufferedImage;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
    
}

