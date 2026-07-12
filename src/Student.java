public class Student extends Person{
    private String matrikelNr;

    public Student(String vorname, String nachname, int alter, String matrikelNr){
        super(vorname, nachname, alter);
        this.matrikelNr = matrikelNr;
    }
    public void printInfo(){
        System.out.println(vorname + " "+ nachname + " "+alter+ " "+ matrikelNr);
    }
}
