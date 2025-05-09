package com.cf.ui;

import java.awt.Dimension;
import javax.swing.JFrame;

public class Frame extends JFrame{

    private final int width = 500;
    private final int height = 500;

    private Dimension minimDimension = new Dimension(width,height);
    private Dimension startDimension = new Dimension(width + 1, height + 1);

    public Frame(){
        this.setTitle("NotePad ☻");
        this.setMinimumSize(minimDimension);
        this.setSize(startDimension);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    
    }


}
