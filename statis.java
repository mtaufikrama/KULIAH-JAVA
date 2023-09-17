import java.util.Scanner;
import java.util.Arrays;
import javax.swing.*;

class CariMean extends statis{
	void CariMean(){
		n = Integer.parseInt(JOptionPane.showInputDialog("Banyak Data [MAX 10] : "));
		for(int i = 0;i<n;i++){
			x[i] = Integer.parseInt(JOptionPane.showInputDialog("Input datum ke-"+(i+1)));
			f[i] = Integer.parseInt(JOptionPane.showInputDialog("Input frekuensi datum ke-"+(i+1)));
			cetakdata(i);
			jmlf+=f[i];
			fx+=(x[i]*f[i]);
		}
		float mean = (float) fx/jmlf;
		System.out.println("Nilai Mean\t : "+mean);
	}
	void cetakdata(int i){
		System.out.print(x[i]+"\t");
		System.out.println(f[i]);
		System.out.println("");
	}
	void CariMedian(){
		int z = 0;
		int temp[]=new int[jmlf];
		for(int i=0;i<n;i++){
			for(int j=0;j<f[i];j++){
				temp[z]=x[i];
				z=z+1;
			}
		}
		Arrays.sort(temp);
		if(jmlf % 2 == 1){
			int median = temp[jmlf/2];
			System.out.println("Nilai Median\t : "+median);
		}else{
			float median = (float)(temp[(jmlf)/2-1]+temp[(jmlf)/2+1])/2;
			System.out.println("Nilai Median\t : "+median);
		}
	}
}
public class statis{
	Scanner input = new Scanner(System.in);
	int jmlf, fx, n, temp;
	int x[]=new int[10];
	int f[]=new int[10];
	public static void main(String[]args){
		CariMean mean = new CariMean();
		mean.CariMean();
		mean.CariMedian();
	}
}