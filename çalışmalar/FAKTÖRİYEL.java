import java.util.Scanner;
public class FAKT�R�YEL {

	public static void main(String[] args) {
		
		        try (Scanner reader = new Scanner(System.in)) {
					System.out.print("Bir Say� Girin:");
 
					int num = reader.nextInt();
					long faktoriyel = 1;
					for(int i = 1; i <= num; ++i)
					{
					    faktoriyel *= i;
					}
					System.out.printf("%d Say�s�n�n Fakt�riyeli = %d \n", num, faktoriyel);
				}
		    } 
		

	}

