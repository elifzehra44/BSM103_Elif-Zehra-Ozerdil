
import java.util.Scanner;
public class uygulama20 {

	public static void main(String[] args) {
	
		     
			 try (Scanner klavye = new Scanner(System.in)) {
				System.out.println("��gen t�r� bulma programina hosgeldiniz");
				 System.out.println("L�tfen ��genin ilk kenar uzunlu�unu yaz�n");
				 int a=klavye.nextInt();
				 
				 System.out.println("L�tfen ��genin ikinci kenar uzunlu�unu yaz�n");
				 int b=klavye.nextInt();
				 
				 System.out.println("L�tfen ��genin ucuncu kenar uzunlu�unu yaz�n");
				 int c=klavye.nextInt();
				 
				 
				 if (a==b && b==c)
					 System.out.println("��gen e�kenar ��gendir");
				 else if (a==b || a==c || b==c)
					 System.out.println("��gen ikizkenar ��gendir");
				 else
					 System.out.println("��gen �e�itkenar ��gendir");
			}
			 
		    }

	}


