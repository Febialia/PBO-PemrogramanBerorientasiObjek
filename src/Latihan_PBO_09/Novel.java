package Latihan_PBO_09;

class Novel extends Buku {
	private int jumlahHalaman;
	
	public Novel(String judul, String penulis, double harga, int jumlahHalaman) {
		super(judul, penulis, harga);
		setJumlahHalaman(jumlahHalaman);
		}
	
	public int getJumlahHalaman() {
		return jumlahHalaman;
		}

	public void setJumlahHalaman(int jumlahHalaman) {
		this.jumlahHalaman = jumlahHalaman;
		}
}