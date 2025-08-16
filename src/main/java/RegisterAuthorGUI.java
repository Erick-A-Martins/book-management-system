import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.GridLayout;

public class RegisterAuthorGUI {

    public static void openRegisterAuthor() {
        JFrame frame = new JFrame("Cadastro de Autor");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 2));

        JLabel labelId = new JLabel("ID: ");
        JTextField fieldId = new JTextField();

        JLabel labelName = new JLabel("Nome:");
        JTextField fieldName = new JTextField();

        JLabel labelBirthDate = new JLabel("Data de nascimento: ");
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
            String id = fieldId.getText();
            String name = fieldName.getText();
            String date = fieldBirthDate.getText();

            JOptionPane.showMessageDialog(frame, "Autor cadastrado \nID: " + id + "\nNome: " + name + "\nData de Nascimento: " + date);
        });
    }
}
