package string;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		String stringA, stringB;
		int sum_length, compare_string;
		
		Scanner inputan = new Scanner(System.in);
		stringA = inputan.next();
		stringB = inputan.next();
		
		sum_length = stringA.length()+stringB.length();
		System.out.println(sum_length);
		
		compare_string = stringA.compareTo(stringB);
		if(compare_string > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		stringA = stringA.substring(0, 1).toUpperCase() + stringA.substring(1);
		stringB = stringB.substring(0, 1).toUpperCase() + stringB.substring(1);
		System.out.println(stringA+" "+stringB);

	}

}

/*
 * Komentar Program
 * Pada program ini membuat dua buah inputan string dengan ketentuan lowercase, 
 * lalu dua string tersebut dijumlahkan panjang hurufnya dan menentukan apakah 
 * string yang pertama lebih dulu secara lexicographically dari string kedua apa 
 * tidak serta masing-masing string huruf awalan nya diubah menjadi kapital 
 */
