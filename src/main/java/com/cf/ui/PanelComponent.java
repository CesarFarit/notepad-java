package com.cf.ui;

import javax.swing.*;
import java.awt.*;

public class PanelComponent extends JPanel {

    private TextAreaPanel textAreaPanel;
    private ButtonPanel buttonPanel;

    public PanelComponent() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.WHITE);
        this.textAreaPanel = new TextAreaPanel();
        this.buttonPanel = new ButtonPanel();

        this.add(textAreaPanel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.NORTH);
    }

}
