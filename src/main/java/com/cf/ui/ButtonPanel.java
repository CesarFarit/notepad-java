package com.cf.ui;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {

    private JButton archiveButton;
    private JButton editButton;
    private JButton configButton;

    public ButtonPanel() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        archiveButton = new JButton("Archivo");
        editButton = new JButton("Edicion");
        configButton = new JButton("Configuracion");

        this.add(archiveButton);
        this.add(editButton);
        this.add(configButton);
    }

}
