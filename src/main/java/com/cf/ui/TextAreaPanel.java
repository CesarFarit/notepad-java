package com.cf.ui;

import javax.swing.*;
import java.awt.*;

public class TextAreaPanel extends JPanel {
    private JTextArea textArea;

    public TextAreaPanel() {
        this.setLayout(new BorderLayout());

        this.textArea = new JTextArea();
        this.textArea.setLineWrap(true); // linea automatica
        this.textArea.setWrapStyleWord(true); // word automacti line
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        this.add(scrollPane, BorderLayout.CENTER);
    }

}