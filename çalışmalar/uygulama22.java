import java.util.Scanner;
public class uygulama22 {

	public static void main(String[] args) {
		
		try (Scanner girdi = new Scanner (System.in)) {
			System.out.println("Dikd�rtgenin y�ksekli�i i�in bir say� yaz�n");
			int y�kseklik = girdi.nextInt();
			
			System.out.println("Dikd�rtgenin geni�li�i i�in bir say� yaz�n");
			int genislik= girdi.nextInt();
			
			for(int i=1; i<= y�kseklik; i++)
			{

				for(int j=1; j<= genislik; j++)
				{
					System.out.print("*");
				}
				System.out.println("");

			}
		}
	}

}
