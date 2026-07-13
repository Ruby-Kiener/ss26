public class Song extends Medium {
    private String artist;

    public Song(String artist, String titel) {
        super(titel);
        this.artist = artist;

    }
    public void ausgeben(){
        System.out.println("artist: " + artist + ", titel: " + titel);

    }

    public static void main(String[] args){
        Song song = new Song("Kehlani", "KK");
        song.ausgeben();
    }


}
