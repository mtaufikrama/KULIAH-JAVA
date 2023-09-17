import java.util.Scanner;

public class operator {
	public static void main (String args []){
		Scanner input = new Scanner(System.in);
		int jumlah, kurang, kali, bagi;
		
		System.out.println("Nama  : Muhammad Taufik Ramadhan");
		System.out.println("Kelas : 2IA22");
		System.out.println("NPM   : 54419471");
		System.out.println("Matkul: Pemrograman Berbasis Obyek");
		System.out.println("");
		System.out.println("================================");
		
		System.out.println("");
		System.out.print("Masukkan Angka 1 : ");
		int a = input.nextInt();
		System.out.print("Masukkan Angka 2 : ");
		int b = input.nextInt();
		
		jumlah = a+b;
		kurang = a-b;
		kali = a*b;
		bagi =a/b;
		
		System.out.println("");
		System.out.println("penjumlahan :" +jumlah);
		System.out.println("pengurangan :"+kurang);
		System.out.println("perkalian   :"+kali);
		System.out.println("pembagian   :"+bagi);
	}
 
}