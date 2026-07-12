package AufgabenSkriptSS26; //02//

public class VerzinsungJuli {

    public static void main(String args[]) {


        //alles einzeln

        double k = 1000.0, r = 4.0;
        double q = 1.0 + r / 100.0;   //1.04

        k = k * q;
        System.out.println("1 Jahr: " + k);

        k = k * q;
        System.out.println("2 Jahr: " + k);
        k = k * q;
        System.out.println("3 Jahr: " + k);
        k = k * q;
        System.out.println("4 Jahr: " + k);




        //for schleife
        for (int jahr = 1; jahr <= 4; jahr++) {
            k = k * q;
            System.out.println(jahr + " Jahr: " + k);

        }



        //while schleife
        int jahr = 1;
        while (jahr <= 4) {
            k = k * q;
            System.out.println(jahr + " Jahr: " + k);
            jahr++;
        }



        //do while schleife
        jahr = 1;
        do {
            k = k * q;
            System.out.println(jahr + " Jahr: " + k);
            jahr++;
        } while (jahr <= 4);




        //alle elemente einer auflistung
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (String car : cars) {
            System.out.println(car);
        }
    }
}






