public class Buchung {
    private int anzTage;
    private int anzPersonen;
    private boolean mitTechnikPaket;
    private boolean mitCatering;


    //Konstruktor (Abkürzung ctor)
    public Buchung(int anzTage, int anzPersonen, boolean mitTechnikPaket, boolean mitCatering) {
        this.anzTage = anzTage;
        this.anzPersonen = anzPersonen;
        this.mitTechnikPaket = mitTechnikPaket;
        this.mitCatering = mitCatering;
    }

    public double berechnePreis() {
        double Gesamtpreis = 200 * anzTage;

        if (mitTechnikPaket)
            Gesamtpreis = Gesamtpreis + 50 * anzTage;
        if (mitCatering)
            Gesamtpreis = Gesamtpreis + 20 * anzPersonen * anzTage;


        return Gesamtpreis;
    }

    public static void main(String[] args) {
        Buchung buchung1 = new Buchung(5, 20, true, false);
        Buchung buchung2 = new Buchung(5, 30, false, true);
        System.out.println("Gesamtpreis Buchung 1: " + buchung1.berechnePreis());
        double preis2 = buchung2.berechnePreis();
        System.out.println("Gesamtpreis Buchung 2: " + preis2);
    }

}
