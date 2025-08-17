package com.erick.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;

import java.awt.GridLayout;

import com.erick.model.Library;
import com.erick.model.Author;

public class RegisterAuthorGUI {

    public static void openRegisterAuthor(Library library) {
        JFrame frame = new JFrame("Cadastro de Autor");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        JLabel labelId = new JLabel("ID: ");
        JTextField fieldId = new JTextField();

        JLabel labelName = new JLabel("Nome:");
        JTextField fieldName = new JTextField();

        JLabel labelBirthDate = new JLabel("Data de nascimento (DD/MM/AAAA):");
        JTextField fieldBirthDate = new JTextField();

        JButton saveButton = new JButton("Salvar");

        panel.add(labelId);
        panel.add(fieldId);
        panel.add(labelName);
        panel.add(fieldName);
        panel.add(labelBirthDate);
        panel.add(fieldBirthDate);
        panel.add(new JLabel());
        panel.add(saveButton);

        frame.add(panel);
        frame.setVisible(true);

        saveButton.addActionListener(e -> {
            int id = Integer.parseInt(fieldId.getText());
            String name = fieldName.getText();
            String date = fieldBirthDate.getText();

            library.addAuthor(new Author(id, name, library.formatDate(date)));

            JOptionPane.showMessageDialog(frame, "Autor cadastrado \nID: " + id + "\nNome: " + name + "\nData de Nascimento: " + date);
        });
    }
}
