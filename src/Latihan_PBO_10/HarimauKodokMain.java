package Latihan_PBO_10;

public class HarimauKodokMain {
	public static void main(String[] args) {
        Kodok kodok = new Kodok();
        HarimauSumatra harimau = new HarimauSumatra();

        // Menunjukkan karakteristik Kodok
        System.out.println("*Kodok*");
        System.out.println("Nama: " + kodok.getJenis());
        System.out.println("Berat: " + kodok.getBeratBadan() + " kg");
        System.out.println("Warna: " + kodok.getWarnaKulit());
        kodok.melompat();
        kodok.makan();
        kodok.berbunyi();

        System.out.println("\n*Harimau*");
        System.out.println("Nama: " + harimau.getJenis());
        System.out.println("Berat: " + harimau.getBeratBadan() + " kg");
        System.out.println("Warna: " + harimau.getWarnaBulu());
        harimau.berlari();
        harimau.makan();
        harimau.mengaum();
    }

}
