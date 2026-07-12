import javax.swing.*;
import java.awt.*;

public class ReiserechnerGui extends JFrame{
    private JComboBox cbAnzahlPersonen;
    private JTextField tfTicketPreis;
    private JTextField tfEntfernungKilometer;
    private JButton btnBerechne;
    private JTextField tfGesamtpreis;


    public ReiserechnerGui() {
        setTitle("Reiserechner");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        cbAnzahlPersonen = new JComboBox<>(new Integer[]{1,2,3,4,5,6});

        tfTicketPreis = new JTextField();

        tfEntfernungKilometer = new JTextField();

        btnBerechne = new JButton("Berechnen");

        tfGesamtpreis = new JTextField();

        tfGesamtpreis.setEditable(false);
        add(new JLabel("Anzahl Personen:"));

        add(cbAnzahlPersonen);

        add(new JLabel("Ticketpreis (€):"));

        add(tfTicketPreis);

        add(new JLabel("Entfernung (km):"));

        add(tfEntfernungKilometer);

        add(new JLabel(""));

        add(btnBerechne);

        add(new JLabel("Gesamtpreis (€):"));

        add(tfGesamtpreis);
        btnBerechne.addActionListener(e -> berechnePreis());

        setLocationRelativeTo(null);
        setVisible(true);
    }
    private void berechnePreis() {

        try {

            int personen = (Integer) cbAnzahlPersonen.getSelectedItem();

            double preis = Double.parseDouble(tfTicketPreis.getText());

            double entfernung = Double.parseDouble(tfEntfernungKilometer.getText());

            // Beispielberechnung (kannst du anpassen!)

            double gesamt = personen * preis + (entfernung * 0.1);

            tfGesamtpreis.setText(String.format("%.2f", gesamt));

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(this, "Bitte gültige Zahlen eingeben!");

        }

    }

    public static void main(String[]args){
        SwingUtilities.invokeLater(ReiserechnerGui::new);

    }


}







