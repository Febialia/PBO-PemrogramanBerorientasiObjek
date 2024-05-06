package Latihan_PBO_09;

public class InheritanceMain {
	public static void main(String[] args) {
		Mahasiswa mhs = new Mahasiswa("223040059", 
										"Febi Alia Rahman", 
										"Bandung");
		System.out.println(mhs.getNrp()
				+ " - "+ mhs.getNama()
				+ " - "+ mhs.getAlamat());
	}
}