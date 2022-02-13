package operators;

public class FloatingPoint {

	public static void main(String[] args) {
		double x = 92.98;
		int nx = (int) Math.round(x);
		System.out.println(nx);
	}
}

/*
 * Komentar Program
 * Program ini menjalankan perintah Math.round() untuk pembulatan angka
 * 
 * Pertanyaan :
 * 1. Pada kasus berikut jelaskan nilai nx setelah digunakan Math.round(x) ?
 * 		Nilai nx berisikan operasi Math.round() pada variabel x. Dimana variabel 
 * 		tersebut memiliki nilai yaitu 92.98, karena Math.round() adalah perintah 
 * 		untuk mencari angka pembulatan yang terdekat dari angka yang dimasukkan 
 * 		maka nilai x yang semula 92.98 setelah digunakan Math.round(x) pada variabel nx, 
 * 		nilai nx menjadi 93. Atau terjadi pembulatan pada variabel x dari 92.98 menjadi 93.
 * 
 * 2. Kenapa dibutuhkan cast (int) dalam penggunaan Math.round(x) ?
 * 		Cast (int) digunakan agar hasil dari Math.round(x) menghasilkan angka 
 * 		bertipe data integer. Dimana x tersebut sudah berupa tipe data double 
 * 		dan agar menghasilkan tipe data integer maka dibutuhkan cast (int). 
 */
