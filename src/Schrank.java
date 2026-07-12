public class Schrank {
    private String modell;
    private int höhe;
    private boolean hatLackierung;

    public Schrank(String modell, int höhe, boolean hatLackierung) {
        this.modell = modell;
        this.höhe = höhe;
        this.hatLackierung = hatLackierung;
    }

    public double berechnePreis() {
        double preis = 0;
        if (modell.equals("Smolle")) {
            preis = 49.90;

        }

        if (modell.equals("Smutje")) {
            preis = 64.80;
        }


        if (modell.equals("Smöre")) {
            preis = 69.90;
        }

        if (höhe > 180) {
            preis = preis + 10;
        }


        if (hatLackierung == true) {
            preis = preis * 1.08;
        }
        return preis;

    }

    static void main(String[] args) {
        Schrank s1= new Schrank("Smöre", 190, true);
        Schrank s2= new Schrank("Smutje",300,false);
        System.out.println("Der Preis beträgt " + s1.berechnePreis() + "€");
        System.out.println("Der Preis beträgt " + s2.berechnePreis() + "€");

    }
}