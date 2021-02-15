/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurkellecioglu.controller;

import com.ugurkellecioglu.asciicode.MyFrame;
import java.awt.Container;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ugur
 */
public class FrameController {
    private Container container; 
    private JButton chooseFileButton;
    private JButton startProcessButton;
    private JFileChooser fileChooser;
    private JTextField textFieldSize;
    private JLabel label;
    private File imageFile;
    private BufferedImage image;
    private BufferedImage grayScaleImage;
    private BufferedImage  sizedImage;
    private File sizedImageFile;

    private FileWriter fileWriter;
    
    public FrameController() {
        
        fileChooser = new JFileChooser();
        
        label = new JLabel("Shrink Scale:(1 for original size)");
        label.setBounds(50, 30, 300, 20);
        
        textFieldSize = new JTextField();
        textFieldSize.setBounds(50, 50, 200, 30);
        textFieldSize.setText("1");
        chooseFileButton = new JButton();
        chooseFileButton.setBounds(50, 90, 200, 100);
        chooseFileButton.setText("Choose an Image");
        
        startProcessButton = new JButton();
        startProcessButton.setBounds(50, 200, 200, 100);
        startProcessButton.setText("Start Process");
        
       
 

    }
    
    public int openFileDialog(MyFrame mf){
        
        return fileChooser.showOpenDialog(mf);
    
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

    public JTextField getTextFieldSize() {
        return textFieldSize;
    }

    public void setTextFieldSize(JTextField textFieldSize) {
        this.textFieldSize = textFieldSize;
    }

    public BufferedImage getSizedImage() {
        return sizedImage;
    }

    public void setSizedImage(BufferedImage sizedImage) {
        this.sizedImage = sizedImage;
    }

    public FileWriter getFileWriter() {
        return fileWriter;
    }

    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public JButton getStartProcessButton() {
        return startProcessButton;
    }

    public void setStartProcessButton(JButton startProcessButton) {
        this.startProcessButton = startProcessButton;
    }

    public File getSizedImageFile() {
        return sizedImageFile;
    }

    public void setSizedImageFile(File sizedImageFile) {
        this.sizedImageFile = sizedImageFile;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }
    
    
    
}
