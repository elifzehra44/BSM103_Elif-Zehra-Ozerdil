import java.util.Scanner;
public class FAKTÖRÝYEL {

	public static void main(String[] args) {
		
		        try (Scanner reader = new Scanner(System.in)) {
					System.out.print("Bir Sayý Girin:");
 
					int num = reader.nextInt();
					long faktoriyel = 1;
					for(int i = 1; i <= num; ++i)
					{
					    faktoriyel *= i;
					}
					System.out.printf("%d Sayýsýnýn Faktöriyeli = %d \n", num, faktoriyel);
				}
		    } 
		

	}

