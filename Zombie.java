public class Zombie extends Musuh {

    public Zombie() {
        super("Bellion Zombie", 150);
    }
    
    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + " Bellion menggiggit anda! Player -20 HP");
    }

    public void suaraKhas() {
        System.out.println("NGESSS");
    }
}