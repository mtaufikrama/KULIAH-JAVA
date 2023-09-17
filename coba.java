import java.util.Scanner;

class taufik{
	public static void main(String[]args){
		Scanner masuk = new Scanner (System.in);
		int gtotal = 0;
		
		System.out.print("masukkan angka : ");
		int batas = masuk.nextInt();
		
		for (int i=1;i<=batas;i++){
			int total = 0;
			int bil = 3;
			
			for(int j=1;j<=i;j++){
				int kubik = j+bil;
				total = total + kubik;
				
				if (j<i){
					System.out.print(bil+ "+");
					
				}else {
					System.out.print(bil+ "=" +total);
					
				}
					bil = bil+3;
			}
			System.out.println ();
			gtotal = gtotal + total;
			if (i==batas){
				System.out.println("total keseluruhan = "+gtotal);
			}
		}
	}
}