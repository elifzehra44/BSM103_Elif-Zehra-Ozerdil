import java.util.Scanner;

public class uygulama13 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Bir kelime giriniz:");
    	String kelime = sc.nextLine();
    	
    	System.out.println("Girilen kelime= "+kelime);
    	System.out.println("Kelimenin tersten yazilmis hali =" +tersten(kelime));
    }
    
    public static String tersten(String kelime) {
    	String ters = "";
    	for (int index= kelime.length();index > 0; index--) {
    		ters += kelime.substring(index - 1, index);
			
			
		}

	

	return ters;
			
    }
	}


