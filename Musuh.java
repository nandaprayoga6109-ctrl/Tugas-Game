
public abstract class Musuh {

    protected String namaMusuh;
    protected int healthPoint;

//     Constructor otomatis dijalankan saat objek diciptakan
    public Musuh(String nama, int HP) {
        this.namaMusuh = nama;
        this.healthPoint = HP;
    }

// metode 1: Serangan fisik (Tanpa parameter)
    public void Serangan() {
        System.out.println(this.namaMusuh + " Melakukan serangan fisik! Pemain kehilangan 10 HP.");

    }

// isi dari pertemuan pertama
// // metode 2: Serangan Sihir (Dengan parameter String)
//     public void serang(String elemenSihir) {
//         System.out.println(this.namaMusuh + " Mengeluarkan sihir " + elemenSihir + "! Pemain kehilangan 30 HP. ");
//     }

// Metode dasar - akan "ditimpa" oleh masing-masing subclass
    public void terimaDamage(int damage) {
        this.healthPoint -= damage;
        System.out.println(this.namaMusuh + " Terkena serangan biasa. Sisa HP: " + this.healthPoint);
    }

    public abstract void serangPemain();

    public abstract  void suaraKhas();
}
