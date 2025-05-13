package com.cf.ui;

import javax.swing.*;
import java.awt.*;

public class PanelComponent extends JPanel {

    private TextAreaPanel textAreaPanel;
    private ButtonPanel buttonPanel;

    public PanelComponent() {
        this.setLayout(new BorderLayout());
        this.textAreaPanel = new TextAreaPanel();
        this.buttonPanel = new ButtonPanel(textAreaPanel);
        this.setBackground(Color.RED);
        this.add(textAreaPanel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.NORTH);
    }

}
