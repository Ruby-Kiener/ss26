public class Person {

    protected String vorname;
    protected String nachname;
    protected int alter;

    public Person(String vorname, String nachname, int alter) {

        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }
    public void printInfo(){
        System.out.println(vorname +" "+ nachname +" "+alter);
    }
    public static void main (String[] args){
        Student student1= new Student ("Ruby", "Kiener", 23, "45678");
        student1.printInfo();
    }
}
