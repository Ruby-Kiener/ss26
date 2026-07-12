import javax.swing.*;

import java.awt.*;

public class ReiserechnerGui extends JFrame {

    private JComboBox<Integer> cbAnzahlPersonen;

    private JTextField tfTicketPreis;

    private JTextField tfEntfernungKilometer;

    private JButton btnBerechne;

    private JTextField tfGesamtpreis;

    public ReiserechnerGui() {

        setTitle("Reiserechner");

        setSize(600, 300);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // ✅ Richtiges Layout

        setLayout(new GridLayout(5, 2, 10, 10));

        // ✅ 1–10 Personen

        cbAnzahlPersonen = new JComboBox<>(new Integer[]{1,2,3,4,5,6,7,8,9,10});

        tfTicketPreis = new JTextField();

        tfEntfernungKilometer = new JTextField();

        btnBerechne = new JButton("Berechnen");

        tfGesamtpreis = new JTextField();

        tfGesamtpreis.setEditable(false);

        // Komponenten hinzufügen

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

        // Button

        btnBerechne.addActionListener(e -> berechnePreis());

        setLocationRelativeTo(null);

        setVisible(true);

    }

    private void berechnePreis() {

        try {

            int personen = (Integer) cbAnzahlPersonen.getSelectedItem();

            double preis = Double.parseDouble(tfTicketPreis.getText());

            double entfernung = Double.parseDouble(tfEntfernungKilometer.getText());

            // ✅ KORREKTE FORMEL AUS DER AUFGABE

            double gesamt = personen * (4 * preis) + (entfernung * 0.1 * personen);

            tfGesamtpreis.setText(String.valueOf(gesamt));

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(this, "Bitte gültige Zahlen eingeben!");

        }

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(ReiserechnerGui::new);

    }

}