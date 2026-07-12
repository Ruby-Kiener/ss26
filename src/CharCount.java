public class CharCount {

    public static void main(String[] args){
        String text = "Unternehmenskommunikation";
        //wie viele 'm'?
        int count = 0;
        char[] ar = text.toCharArray(); //text in char-Array

        //for each über char-Array:ar
        for (char c : ar) {
            if (c == 'm')
                count++;
        }
        System.out.println(count);
    }

}

//Aufgabe 07072026