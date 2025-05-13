package com.cf.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;

import com.cf.ui.*;
import com.cf.service.*;
import com.cf.service.filesgenerator.GenerationTXT;;

public class ButtonPanel extends JPanel {

    private TextAreaPanel textAreaPanel;
    private GenerationTXT generationTXT;

    private JButton archiveButton;
    private JButton editButton;
    private JButton configButton;
    private JButton helpButton;

    private JPopupMenu archivePopupMenu;
    private JPopupMenu editPopupMenu;
    private JPopupMenu configPopupMenu;
    private JPopupMenu helpPopupMenu;

    // private final Dimension sizeButton = new Dimension(115, 15);

    public ButtonPanel(TextAreaPanel textAreaPanel) {
        this.textAreaPanel = textAreaPanel;

        this.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 1));

        archiveButton = new JButton("Archivo");
        editButton = new JButton("Edicion");
        configButton = new JButton("Configuracion");
        helpButton = new JButton("Ayuda?");

        // JPopupMenu
        archivePopupMenu = new JPopupMenu();
        editPopupMenu = new JPopupMenu();
        configPopupMenu = new JPopupMenu();
        helpPopupMenu = new JPopupMenu();

        // archiveButton - Option
        JMenuItem ArchiveOption1 = new JMenuItem("Nuevo");
        JMenuItem ArchiveOption2 = new JMenuItem("Abrir...");
        JMenuItem ArchiveOption3 = new JMenuItem("Guardar");
        JMenuItem ArchiveOption4 = new JMenuItem("Guardar como...");
        JMenuItem ArchiveOption5 = new JMenuItem("Cerrar");

        archivePopupMenu.add(ArchiveOption1);
        archivePopupMenu.add(ArchiveOption2);
        archivePopupMenu.add(ArchiveOption3);
        archivePopupMenu.add(ArchiveOption4);
        archivePopupMenu.add(ArchiveOption5);

        // editPopupMenu - Option
        JMenuItem editOption1 = new JMenuItem("Option 1 - e");
        editPopupMenu.add(editOption1);

        // configPopupMenu - Option
        JMenuItem configOption1 = new JMenuItem("Option 1 - c");
        configPopupMenu.add(configOption1);

        // helpPopupMenu - Option
        JMenuItem helpOption1 = new JMenuItem("Option 1 - h");
        helpPopupMenu.add(helpOption1);

        // archiveButton.setPreferredSize(sizeButton);
        // editButton.setPreferredSize(sizeButton);
        // configButton.setPreferredSize(sizeButton);

        Font archiveFontActual = archiveButton.getFont();
        Font archiveFontPequena = new Font(archiveFontActual.getName(), archiveFontActual.getStyle(), 12);
        archiveButton.setFont(archiveFontPequena);

        Font editFontActual = editButton.getFont();
        Font editFontPequena = new Font(editFontActual.getName(), editFontActual.getStyle(), 12);
        editButton.setFont(editFontPequena);

        Font configFontActual = configButton.getFont();
        Font configFontPequena = new Font(configFontActual.getName(), configFontActual.getStyle(), 12);
        configButton.setFont(configFontPequena);

        Font helpFontActual = helpButton.getFont();
        Font helpFontPequena = new Font(helpFontActual.getName(), helpFontActual.getStyle(), 12);
        helpButton.setFont(helpFontPequena);

        archiveButton.setMargin(new Insets(1, 1, 1, 1));
        editButton.setMargin(new Insets(1, 1, 1, 1));
        configButton.setMargin(new Insets(1, 1, 1, 1));
        helpButton.setMargin(new Insets(1, 1, 1, 1));

        // Acciones - ButtonsPanels
        archiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                archivePopupMenu.show(archiveButton, 0, archiveButton.getHeight());
            }
        });

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editPopupMenu.show(editButton, 0, archiveButton.getHeight());
            }
        });

        configButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                configPopupMenu.show(configButton, 0, configButton.getHeight());

            }
        });

        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                helpPopupMenu.show(helpButton, 0, helpButton.getHeight());
            }
        });

        // Actions - JMenuItems

        ArchiveOption1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textAreaPanel.textContent();
                System.out.println(text);
                generationTXT.creationTXT(text);

            }
        });

        ArchiveOption5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("*Se cierra*");
                // System.exit(0);
                SwingUtilities.getWindowAncestor(ButtonPanel.this).dispose();
            }
        });

        this.add(archiveButton);
        this.add(editButton);
        this.add(configButton);
        this.add(helpButton);

    }

}
