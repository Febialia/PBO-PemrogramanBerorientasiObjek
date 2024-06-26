package Latihan_PBO_07;

public class MataKuliah {
	private String kode;
	private String nama;
	private String index;
	private int sks;
	private double nilai;

	public MataKuliah(String kode, String nama, String index, int sks, double nilai) {
		super();
		this.kode = kode;
		this.nama = nama;
		this.index = index;
		this.sks = sks;
		this.nilai = nilai;
	}

	public double nilaiIndex() {
		double nilaiNumerik = 0;
        switch (index) {
            case "A":
                nilaiNumerik = 4.0;
                break;
            case "AB":
                nilaiNumerik = 3.5;
                break;
            case "B":
                nilaiNumerik = 3.0;
                break;
            case "BC":
                nilaiNumerik = 2.5;
                break;
            case "C":
                nilaiNumerik = 2.0;
                break;
            case "D":
                nilaiNumerik = 1.0;
                break;
            case "E":
                nilaiNumerik = 0;
                break;
            default:
                System.out.println("Nilai tidak valid");
        }
        return nilaiNumerik;
    }

	public String display() {
		return kode + " - "+ nama + " - "+ index;
	}
	 public int getSks() {
	        return sks;
	    }
	 public double getNilai() {
		 return nilai;
	 }
}