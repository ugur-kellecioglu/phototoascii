/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurkellecioglu.controller;

import java.awt.Container;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;

/**
 *
 * @author ugur
 */
public class FrameController {
    private Container container; 
    private JButton chooseFileButton;
    private JFileChooser fileChooser;
    private File imageFile;
    private BufferedImage image;
    private BufferedImage grayScaleImage;
    public FrameController() {
        
        fileChooser = new JFileChooser();
        chooseFileButton = new JButton();

    }

    public JFileChooser getFileChooser() {
        return fileChooser;
    }

    public void setFileChooser(JFileChooser fileChooser) {
        this.fileChooser = fileChooser;
    }

    
    
    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public JButton getChooseFileButton() {
        return chooseFileButton;
    }

    public void setChooseFileButton(JButton chooseFileButton) {
        this.chooseFileButton = chooseFileButton;
    }

    public File getImageFile() {
        return imageFile;
    }

    public void setImageFile(File imageFile) {
        this.imageFile = imageFile;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public BufferedImage getGrayScaleImage() {
        return grayScaleImage;
    }

    public void setGrayScaleImage(BufferedImage grayScaleImage) {
        this.grayScaleImage = grayScaleImage;
    }
    
    
}
