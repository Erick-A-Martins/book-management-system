package com.erick.view;

import com.erick.model.Library;
import com.erick.model.Book;
import com.erick.model.Loan;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import java.awt.Window;

import java.awt.GridLayout;
import java.util.List;
import java.time.LocalDate;

public class AvailableBooksGUI {
    public static void openAvailableBooks(Library library) {
        JFrame frame = new JFrame("Livros Disponíveis");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        JComboBox<Book> books = new JComboBox<>();
        List<Book> booksList = library.listBooks();

        for(Book book : booksList) {
            if(book.getAvailable()) {
                books.addItem(book);
            }
        }

        JButton loanButton = new JButton("Solicitar");

        panel.add(books);
        panel.add(loanButton);

        frame.add(panel);
        frame.setVisible(true);

        loanButton.addActionListener(e -> {
            Book book = (Book) books.getSelectedItem();
            book.setAvailable(false);
            LocalDate borrowedDate = LocalDate.now();
            library.addLoan(new Loan(book.getId(), book, borrowedDate, borrowedDate));

            JOptionPane.showMessageDialog(frame, "Você pegou o livro: \n ID: " + book.getId() + "\nNome: " + book.getBookTitle() + "\nAutor: " + book.getAuthor().getName());
            Window window = SwingUtilities.getWindowAncestor(loanButton);
            if(window != null) {
                window.dispose();
            }
        });
    }
}
