import java.util.Scanner;
class nilai{
	public static void main(String[]args){
		Scanner masuk = new Scanner(System.in);
		String nama, kelas, npm;
		int uts, uas;
		double total;
		System.out.println("===Program Nilai===");
		System.out.print("Masukkan nama : ");
		nama = masuk.nextLine();
		System.out.print("Masukkan kelas : ");
		kelas = masuk.nextLine();
		System.out.print("Masukkan npm : ");
		npm = masuk.nextLine();
		System.out.print("Nilai uts : ");
		uts = masuk.nextInt();
		System.out.print("Nilai uas : ");
		uas = masuk.nextInt();
		total = ((uts*0.7)+(uas*0.3));
		System.out.println("==============");
		System.out.println("Nama \t: " +nama);
		System.out.println("Kelas \t: " +kelas);
		System.out.println("NPM \t: " +npm);
		System.out.println("UTS \t: " +uts);
		System.out.println("UAS \t: " +uas);
		System.out.println("Total \t: " +total);
	}
}