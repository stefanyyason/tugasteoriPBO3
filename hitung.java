public class hitung{
	public static void main(String[] args){
		double luaslingkaran;
		double volumekubus;
		nilai x = new nilai();
		x.phi = 3.14;
		x.r = 2;
		x.sisi = 2;
		luaslingkaran = x.phi*x.r*x.r;
		volumekubus = x.sisi*x.sisi*x.sisi;
		System.out.println("Luas Lingkaran= "+luaslingkaran);
		System.out.println("Volume Kubus= "+volumekubus);
	}
}