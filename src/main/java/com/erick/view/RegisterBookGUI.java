package com.erick.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

import com.erick.model.Author;
import com.erick.model.Library;
import com.erick.model.Book;

import java.util.List;
import java.time.LocalDate;
import java.awt.GridLayout;

public class RegisterBookGUI {

    public static void openRegisterBook(Library library) {
        JFrame frame = new JFrame("Cadastro de Livros");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        JLabel labelId = new JLabel("ID: ");
        JTextField fieldId = new JTextField();

        JLabel labelName = new JLabel("Nome: ");
        JTextField fieldName = new JTextField();

        JLabel labelAuthors = new JLabel("Autores: ");
        JComboBox<Author> authors = new JComboBox<>();

        List<Author> authorsList = library.listAuthors();

        for(Author author : authorsList) {
            authors.addItem(author);
        }

        JButton saveBtn = new JButton("Salvar");

        panel.add(labelId);
        panel.add(fieldId);
        panel.add(labelName);
        panel.add(fieldName);
        panel.add(labelAuthors);
        panel.add(authors);
        panel.add(new JLabel());
        panel.add(saveBtn);

        frame.add(panel);
        frame.setVisible(true);

        saveBtn.addActionListener(e -> {
            int id = Integer.parseInt(fieldId.getText());
            String name = fieldName.getText();
            Author author = (Author) authors.getSelectedItem();
            LocalDate registerDate = LocalDate.now();

            library.addBook(new Book(id, name, author, true, registerDate, registerDate));

            JOptionPane.showMessageDialog(frame, "Livro cadastrado: \n ID: " + id + "\nNome: " + name + "\nAutor: " + author.getName() + "\nData de Registro: " + registerDate + "\nData de atualização: " + registerDate);
        });

    }
}
