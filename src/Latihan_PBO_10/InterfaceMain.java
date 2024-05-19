package Latihan_PBO_10;

public class InterfaceMain {
		public static void main(String[] args) {
			KartuElektronik Kartu = new KartuElektronik("IF111", "123");
			System.out.println("otentikasi:"+ Kartu.otentikasi("123"));
		}
	}