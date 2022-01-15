
import java.util.Scanner;
public class uygulama20 {

	public static void main(String[] args) {
	
		     
			 try (Scanner klavye = new Scanner(System.in)) {
				System.out.println("Üçgen türü bulma programina hosgeldiniz");
				 System.out.println("Lütfen üçgenin ilk kenar uzunluðunu yazýn");
				 int a=klavye.nextInt();
				 
				 System.out.println("Lütfen üçgenin ikinci kenar uzunluðunu yazýn");
				 int b=klavye.nextInt();
				 
				 System.out.println("Lütfen üçgenin ucuncu kenar uzunluðunu yazýn");
				 int c=klavye.nextInt();
				 
				 
				 if (a==b && b==c)
					 System.out.println("üçgen eþkenar üçgendir");
				 else if (a==b || a==c || b==c)
					 System.out.println("üçgen ikizkenar üçgendir");
				 else
					 System.out.println("üçgen çeþitkenar üçgendir");
			}
			 
		    }

	}


