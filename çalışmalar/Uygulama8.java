package uygulama3;

import java.util.Scanner;

public class Uygulama8 {

	public static void main(String[] args) {
		        try (// 345=> 3+4+5=12
						/*
						 * 345%10=5
						 * 345/10=34
						 * 34%10=4
						 * 34/10=3
						 * 3%10=3
						 * 3/10=0
						 **/
		Scanner sc = new Scanner(System.in)) {
			System.out.print("Lütfen bir sayı giriniz:");
			int number=sc.nextInt();
			number=Math.abs(number);
			int sum=0;
			while(number>0) {
				sum=sum+(number%10);
				number=number/10;
			}
			System.out.println("Toplam="+ sum);
		}
		
	}
}


