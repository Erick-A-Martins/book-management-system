package view;

import model.Library;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BorderFactory;

import java.awt.GridLayout;

public class OpenProgramGUI {

    public static void openMenu(Library library) {
        JFrame frame = new JFrame("Biblioteca - Menu Principal");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        JButton authorBtn = new JButton("Cadastrar Autor");
        JButton bookBtn = new JButton("Cadastrar Livro");
        JButton closeBtn = new JButton("Sair");

        panel.add(authorBtn);
        panel.add(bookBtn);
        panel.add(closeBtn);

        frame.add(panel);
        frame.setVisible(true);

        authorBtn.addActionListener(e -> RegisterAuthorGUI.openRegisterAuthor());
        bookBtn.addActionListener(e -> RegisterBookGUI.openRegisterBook(library));
        closeBtn.addActionListener(e -> System.exit(0));
    }
}
