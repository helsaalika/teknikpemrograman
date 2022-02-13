package datatype;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		int n;
		
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		String[] number = new String[n];
		
		for(int i = 0; i < n ; i++) {
			number[i] = scan.next();
		}
		
		for(int i = 0 ;i < n;i++) {
			try {
				long number_long = Long.parseLong(number[i]);
				long max = 9223372036854775807L;
				long min = -9223372036854775808L;
				
				if(number_long > -32768 && number_long < 32767){
					System.out.println(number[i] + " can be fitted in: \n*short\n*int\n*long");
				}else if(number_long > -2147483648 && number_long < 2147483647) {
					System.out.println(number[i] + " can be fitted in: \n*int\n*long");
				}else if (number_long > min && number_long < max){
					System.out.println(number[i] + " can be fitted in: \n*long");
				}
			} catch (Exception e) {
				System.out.println(number[i] + " can't be fitted anywhere");
			}
			
		}
	}

}
