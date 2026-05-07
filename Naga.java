
public class Naga extends Musuh {

    public Naga() {
        super("Naga hitam legam", 200);
    }

    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + " Menyemburkan black fire dari udara! Player -50 HP");
    }

    public void suaraKhas() {
        System.out.println("RAWRRRR");
    }
}
