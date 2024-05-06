package Latihan_PBO_09;

public class InheritanceMainBuku {
	public static void main(String[] args) {
		Novel novel = new Novel("Laskar Pelangi", "Andrea Hirata", 50000, 300);
		
		System.out.println("Judul : " + novel.getHarga());
		System.out.println("Penulis : " +novel.getPenulis());
		System.out.println("Harga : " +novel.getJudul());
		System.out.println("Jumlah Halaman : " +novel.getJumlahHalaman());
	}
}