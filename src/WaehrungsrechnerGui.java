import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WaehrungsrechnerGui extends JFrame {
    private JLabel lb;
    private JButton btnUmrechnen;
    private JButton btnLöschen;
    private JTextField tfUSDollar;
    private JTextField tfEuro;
    private JTextField tfRupiah;
    private JPanel panel;

    public WaehrungsrechnerGui() {
        setContentPane(panel);

        setTitle("Währungsrechner");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        btnUmrechnen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                umrechnen();
            }
        });
        btnLöschen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loeschen();
            }
        });
    }

    private void umrechnen() {
        try {
            double eur = Double.parseDouble(tfEuro.getText());

            double usd = eur / 0.9;
            tfUSDollar.setText(String.format("%.2f", usd));

            double rupiah = eur / 0.00066;
            tfRupiah.setText(String.format("%.2f", rupiah));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Bitte gültige Zahlen eingeben!");
        }

    }

    private void loeschen() {
        tfEuro.setText("");
        tfRupiah.setText("");
        tfUSDollar.setText("");
    }

    public static void main(String[] args) {
        WaehrungsrechnerGui waehrungsrechnerGui = new WaehrungsrechnerGui();
    }
}
