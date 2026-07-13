public class Email {
    private String email;

    public Email(String email) {
        this.email = email;
    }

    public void checkValid() {
        boolean ok = true;
        int count = 0;
        if(!email.endsWith(".de")) {
            System.out.println("email muss mit .de enden!");
            ok = false;
        }
        for (char c : email.toCharArray()) {
            if(c=='@')
                count = count + 1;
        }
        if(count!=1) {
            System.out.println("email muss das Zeichen @ genau einmal enthalten");
            ok = false;
        }
        if(ok)
            System.out.println("email ist ok");
    }

    public static void main(String[] args) {
        Email email = new Email("ruby.kiener@student.hs-neu-ulm.de");
        email.checkValid();
    }
}

