package Latihan_PBO_10;

public class BentukMain {
	public static void main(String[] args) {
		Lingkaran lingkaran = new Lingkaran(10);
		System.out.println("==Lingkaran==");
		System.out.println("Jari2: " + lingkaran.getjari2());
		System.out.println("Luas: " + lingkaran.luas());
		
		Tabung tabung = new Tabung(10,5);
		System.out.println("==Tabung=");
		System.out.println("Jari2: " + tabung.getjari2()+ ", tinggi: "+tabung.getTinggi());
		System.out.println("Luas: " + tabung.luas());
	}
}
