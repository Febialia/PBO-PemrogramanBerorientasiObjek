package Latihan_PBO_10;

public class Kodok {
	private String jenis;
    private double beratBadan;
    private String warnaKulit;

    Kodok() {
        this.jenis = "Kodok";
        this.beratBadan = 0.3;
        this.warnaKulit = "Hijau";
    }

    public String getJenis() {
        return jenis;
    }

    public double getBeratBadan() {
        return beratBadan;
    }

    public String getWarnaKulit() {
        return warnaKulit;
    }

    public void melompat() {
        System.out.println("Kodok melompat dengan lompatan yang tinggi.");
    }

    public void makan() {
        System.out.println("Kodok memakan serangga, seperti nyamuk, lalat, dan belalang.");
    }

    public void berbunyi() {
        System.out.println("Kodok mengeluarkan suara kwek-kwek.");
    }

}
