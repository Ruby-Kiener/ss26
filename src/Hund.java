public class Hund extends Tier {
    private boolean istBlindenHund;

    public Hund(String name, boolean istBlindenHund) {
        super("Hund");
        this.istBlindenHund = istBlindenHund;
    }

    public void ausgeben(){
        System.out.println("Hund ist blind: " + istBlindenHund);}

    static void main(String[] args) {
        Hund h1= new Hund ("Bruno", true);
        h1.ausgeben();
    }
}
