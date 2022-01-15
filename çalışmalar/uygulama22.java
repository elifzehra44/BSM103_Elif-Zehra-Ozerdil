import java.util.Scanner;
public class uygulama22 {

	public static void main(String[] args) {
		
		try (Scanner girdi = new Scanner (System.in)) {
			System.out.println("Dikdörtgenin yüksekliði için bir sayý yazýn");
			int yükseklik = girdi.nextInt();
			
			System.out.println("Dikdörtgenin geniþliði için bir sayý yazýn");
			int genislik= girdi.nextInt();
			
			for(int i=1; i<= yükseklik; i++)
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
