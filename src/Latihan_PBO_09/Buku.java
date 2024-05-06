package Latihan_PBO_09;

public class Buku {
	protected String judul;
	protected String penulis;
	protected double harga;
	
	public Buku(String judul, String penulis, double harga) {
	    this.judul = judul;
	    this.penulis = penulis;
	    this.harga = harga;
	  }

	  public void setJudul(String judul) {
	    this.judul = judul;
	  }
	  
	  public String getJudul() {
		  return judul;
	  }
	  
	  public void setPenulis(String penulis) {
		    this.penulis = penulis;
	  }
	  
	  public String getPenulis() {
	    return penulis;
	  }

	  public void setHarga(double harga) {
		    this.harga = harga;
	  }
	  
	  public double getHarga() {
	    return harga;
	  }  
}