import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;

public class OpenProgramGUI {

    public static void openMenu() {
        JFrame frame = new JFrame("Biblioteca - Menu Principal");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 1));

        JButton authorBtn = new JButton("Cadastrar Autor");
        JButton bookBtn = new JButton("Cadastrar Livro");
        JButton closeBtn = new JButton("Sair");

        panel.add(authorBtn);
        panel.add(bookBtn);
        panel.add(closeBtn);

        frame.add(panel);
        frame.setVisible(true);

        authorBtn.addActionListener(e -> RegisterAuthorGUI.openRegisterAuthor());
        closeBtn.addActionListener(e -> System.exit(0));
    }
}
