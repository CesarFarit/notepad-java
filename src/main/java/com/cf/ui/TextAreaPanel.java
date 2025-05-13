package com.cf.ui;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class TextAreaPanel extends JPanel {
    private JTextArea textArea;

    public TextAreaPanel() {
        this.setLayout(new BorderLayout());
        this.textArea = new JTextArea();
        this.textArea.setMargin(new Insets(5, 5, 5, 5));
        this.textArea.setLineWrap(true); // linea automatica
        this.textArea.setWrapStyleWord(true); // word automacti line

        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT,
                    getClass().getClassLoader().getResourceAsStream("font/Minecraft.ttf"));
            this.textArea.setFont(customFont.deriveFont(Font.PLAIN, 18));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
            this.textArea.setFont(new Font("Lucia Console", Font.PLAIN, 12));
        }

        JScrollPane scrollPane = new JScrollPane(textArea);
        this.add(scrollPane, BorderLayout.CENTER);
    }

    public String textContent() {
        return textArea.getText();
    }

}