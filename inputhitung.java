import java.util.Scanner;
public class inputhitung{
	public static void main(String[] args){
		double luaslingkaran;
		double volumekubus;
		inputnilai x = new inputnilai();
		Scanner input= new Scanner(System.in);
		x.phi=3.14;
		System.out.print("Masukkan nilai r= ");
		x.r=input.nextInt();
		System.out.print("Masukkan nilai sisi= ");
		x.sisi=input.nextInt();
		luaslingkaran = x.phi*x.r*x.r;
		System.out.println("Luas Lingkaran= "+luaslingkaran);
		volumekubus = x.sisi*x.sisi*x.sisi;
		System.out.println("Volume Kubus= "+volumekubus);
	}
}