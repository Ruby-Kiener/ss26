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
            double LängeProBrett = 0;
            if(brettlänge.equals("kurz (Länge=0.2m)"))
                LängeProBrett = 0.2;
            if(brettlänge.equals("mittel(Länge=0.4m)"))
                LängeProBrett = 0.4;
            if(brettlänge.equals("lang(Länge=0.8m)"))
                LängeProBrett = 0.8;
            double lfdMeter = anzahlRegale * LängeProBrett;
            tfAnzahlMeter.setText("" + lfdMeter);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog( this, "Bitte gültige Zahlen eingeben!");
        }
    }

    public static void main() {
        BaumarktHelferGui baumarktHelferGui = new BaumarktHelferGui();
    }
}
