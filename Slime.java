
public class Slime extends Musuh {

    public Slime() {
        //     this.namaMusuh = "Slime Berlendir";
        //     this.healthPoint = 50;
        // }
        super("Subo Slime", 50);
    }

// public void terimaDamage(int damage) {
//     super.terimaDamage(damage); 
//     System.out.println("Efek Pasif: " + this.namaMusuh + "Membelah diri menjadi dua karena diserang! ");
// }

    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + " Melompat dan menyiram cairan asam! Player -15 HP");
    }

    public void suaraKhas() {
        System.out.println("BLUBUKKK");
    }

}
