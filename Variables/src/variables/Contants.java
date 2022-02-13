package variables;

public class Contants {

	public static void main(String[] args) {
		final double CM_PER_INCH = 2.54;
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("Paper size in centimeters : " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);

	}

}

/*
 * Komentar Program
 * penggunaan final double dan public static final double pada Class Contants2
 * 
 *  Pertanyaan :
 *  1. Bagaimana output dari masing – masing class Constants dan Constants2 ?
 *  	Output yang dihasilkan dari masing-masing class adalah sama, 
 *  	yaitu Paper size in centimeters : 21.59 by 27.94
 *  
 *  2. Apa perbedaan penggunaan final double dengan public static final double ?
 *  	Final double membuat nilainya tidak dapat diubah atau sama saja dengan konstanta 
 *  	dan hanya digunakan pada modul final double itu berada, disini berarti pada modul main
 *  	Public static final double sama hal nya dengan final double yakni nilainya tidak 
 *  	dapat diubah, hanya aja variabel ini bisa diakses di modul manapun jika dipanggil 
 *  	karena bersifat public. 
 */
