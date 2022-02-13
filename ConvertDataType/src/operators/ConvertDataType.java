package operators;

public class ConvertDataType {

	static short methodOne(long l) {
		int i = (int) l;
		return (short) i;
	}
	
	public static void main(String[] args) {
		double d = 10.25;
		float f = (float) d;
		byte b = (byte) methodOne((long) f);
		System.out.println(b);
	}
}

/* 
 * Komentar Program
 * Program untuk mengkonversi dari double ke float ke byte lalu dari long ke int lalu ke short
 * 
 * Pertanyaan 
 * 1. Jelaskan output nilai dari variabel b 
 * 		Output yang dihasilkan oleh variabel b adalah 10 dengan tipe data byte.
 * 
 * 2. Jelaskan apa yang berubah dari variabel d menjadi variabel b setelah dilakukan cast ?
 * 		variabel d dengan tipe data double dikonversikan ke tipe data float pada variabel f
 * 		lalu dikonversikan kembali ke tipe data byte setelah memanggil modul methodOne
 * 		di modul methodOne terjadi pengkonversian dari long ke int lalu ke short. Variabel b
 * 		sekarang bertipe byte.
 */

