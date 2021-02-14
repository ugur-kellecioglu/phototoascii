/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurkellecioglu.asciicode;

import com.ugurkellecioglu.controller.FrameController;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author ugur
 */
public class MyFrame extends JFrame implements ActionListener{
    
    FrameController frameController;
    public MyFrame() {
        frameController = new FrameController();
        
        
        setTitle("Convert an Image"); 
        
        setBounds(300, 90, 900, 600); 
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        
  
        frameController.setContainer(getContentPane()); 
        
        frameController.getContainer().setLayout(null); 
        this.setVisible(true);
        
        //Choose image file button
       
       
        frameController.getChooseFileButton().setBounds(50, 50, 200, 100);
        
        frameController.getChooseFileButton().setText("Choose an Image");
        
        frameController.getChooseFileButton().addActionListener((ActionEvent evt) -> {
            
            int returnVal = frameController.getFileChooser().showOpenDialog(MyFrame.this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                //assign selected image to image variable which is an File object
                frameController.setImageFile(frameController.getFileChooser().getSelectedFile()); 
                try {
                    frameController.setImage(ImageIO.read(frameController.getImageFile()));
                    frameController.setGrayScaleImage(ImageIO.read(frameController.getImageFile()));
                } catch (IOException ex) {
                    Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                String result = "";
                
                for ( int i = 0 ; i < frameController.getImage().getHeight(this); i++){
                   for(int j = 0 ; j < frameController.getImage().getWidth(this); j++){
                       /*
                        Color c = new Color(buffered.getRGB(j, i));
                        System.out.println(c);
                       */
                       Color color = new Color(frameController.getImage().getRGB(j,i));
                       int colorR = color.getRed();
                       int colorG = color.getGreen();
                       int colorB = color.getBlue();
                       int sum = (colorR + colorG + colorB)/3;
                       color = new Color(sum, sum, sum);
                       int myColor = color.getRGB();
                       frameController.getGrayScaleImage().setRGB(j, i, myColor);
                       result += returnStrPos(sum);
                       System.out.println(i+ "\t" + j);
                       
                   }
                   result += "\n";
                }
                System.out.println(result);
                this.paint(this.getGraphics());
                   
                try {
                    // retrieve image
                    BufferedImage bi = frameController.getGrayScaleImage();
                    File outputfile = new File("saved.jpg");
                    ImageIO.write(bi, "jpg", outputfile);
                    System.out.println(outputfile.getAbsolutePath());
                } catch (IOException e) {
                    System.out.println(e.toString());
                }
            } 
            else {
                
                System.out.println("cancelled");
                
            }
        });
        
        frameController.getContainer().add(frameController.getChooseFileButton());
        
    }

    @Override
    public void paint(Graphics g) {
        if(frameController.getImage() != null){
            g.drawImage(frameController.getImage(),
                frameController.getChooseFileButton().getX() + frameController.getChooseFileButton().getWidth() + 50,
                frameController.getChooseFileButton().getY(),
                (frameController.getImage().getHeight(this)/4),
                (frameController.getImage().getWidth(this)/4), this);
        }
        
        if(frameController.getGrayScaleImage() != null && frameController.getImage() != null){
            g.drawImage(frameController.getGrayScaleImage(),
                frameController.getChooseFileButton().getX() + frameController.getChooseFileButton().getWidth() + (frameController.getImage().getWidth()/4),
                frameController.getChooseFileButton().getY(),
                (frameController.getGrayScaleImage().getHeight(this)/4),
                (frameController.getGrayScaleImage().getWidth(this)/4), this);
        }
    }

    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }
    
    private char returnStrPos(double g)//takes the grayscale value as parameter
	{
		final char str;

		if (g >= 230.0) {
			str = ' ';
		} else if (g >= 200.0) {
			str = '.';
		} else if (g >= 180.0) {
			str = '*';
		} else if (g >= 160.0) {
			str = ':';
		} else if (g >= 130.0) {
			str = 'o';
		} else if (g >= 100.0) {
			str = '&';
		} else if (g >= 70.0) {
			str = '8';
		} else if (g >= 50.0) {
			str = '#';
		} else {
			str = '@';
		}
		return str; // return the character

	}
}
