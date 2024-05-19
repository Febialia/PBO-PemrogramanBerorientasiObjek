package Latihan_PBO_10;

public class HarimauSumatra {
	private String jenis;
    private double beratBadan;
    private String warnaBulu;

    public void HarimauSumatera() {
        this.jenis = "Harimau Sumatera";
        this.beratBadan = 150.0;
        this.warnaBulu = "Cokelat Kehitaman";
    }

    public String getJenis() {
        return jenis;
    }

    public double getBeratBadan() {
        return beratBadan;
    }

    public String getWarnaBulu() {
        return warnaBulu;
    }

    public void berlari() {
        System.out.println("Harimau berlari dengan lincah dan gesit.");
    }

    public void makan() {
        System.out.println("Harimau memakan daging rusa, babi hutan, dan hewan besar lainnya.");
    }

    public void mengaum() {
        System.out.println("Harimau mengeluarkan suara auman yang keras.");
    }

}
