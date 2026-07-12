import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kinorechner extends JFrame{
    private JButton berechnenButton;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel anzahlpersonen;
    private JLabel ticketpreis;
    private JLabel anzahlsnacks;
    private JLabel gesamtpreis;
    private JPanel myPanel;

    public Kinorechner(){
        setTitle("Kinorechner");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,300);
        setContentPane(myPanel);
        setVisible(true);
        setResizable(false);


        berechnenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                berechne();

            }
        });
    }
    public double berechne(){
        try {
            String anzahlpersonenStr = comboBox1.getSelectedItem().toString();
            int anzahlpersonen = Integer.parseInt(anzahlpersonenStr);
            double ticketpreis = Double.parseDouble(textField1.getText());
            int anzahlsnacks = Integer.parseInt(textField2.getText());

            double gesamtpreis = (anzahlpersonen * ticketpreis) + (anzahlsnacks * 3);
            textField3.setText(gesamtpreis + "€");
            return gesamtpreis;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Ungültige Angabe");
        }
        return 0;
    }

    static void main(String[] args) {
        new Kinorechner();
    }
}
