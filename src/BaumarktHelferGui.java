import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaumarktHelferGui extends JFrame {
    private JComboBox comboBox1;
    private JTextField tfAnzahlRegale;
    private JButton btnBerechne;
    private JTextField tfAnzahlMeter;
    private JLabel lbAnzahlMeter;
    private JPanel panel;

    public BaumarktHelferGui() {
        setContentPane(panel);

        setTitle("Baumarkt-Helfer");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        btnBerechne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                berechne();
            }
        });
    }

    public void berechne() {
        try {
            String brettlänge = comboBox1.getSelectedItem().toString();
            int anzahlRegale = Integer.parseInt(tfAnzahlRegale.getText());

        } catch (Exception ex) {
            //JOptionPane.showMessageDialog( this, "Bitte gültige Zahlen eingeben!");
        }
    }

    public static void main() {
        BaumarktHelferGui baumarktHelferGui = new BaumarktHelferGui();
    }
}
