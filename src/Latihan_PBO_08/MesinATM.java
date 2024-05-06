package Latihan_PBO_08;

import java.util.Scanner;

public class MesinATM {
	private KartuDebit kartuDebit;
	private boolean valid;
	
	public void init(KartuDebit kartuDebit) {
		if (kartuDebit.isValid()) {
			this.kartuDebit = kartuDebit;
			valid = true;
			
			System.out.println("Masukkan no. PIN");
			Scanner scan = new Scanner(System.in);
			String pinInput = scan.next();
			if (otentikasi(pinInput) == true) {
				System.out.println("Menu Utama");
			} else {
				System.out.println("N0. PIN TIDAK SESUAI...");
			}
		} else
			System.out.println("Kartu Debit tidak valid...");
	}
	
	private boolean otentikasi(String pinInput) {
		if (valid) {
			if (kartuDebit.getPin().equalsIgnoreCase(pinInput))
				return true;
			else
				return false;
		}
		return false;
	}
	
}