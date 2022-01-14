import java.util.Scanner;
public class uygulama18 {

	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Bir kelime giriniz:");
		String inputStr = sc.nextLine();
		
		System.out.println("Bir sayi giriniz:");
		int inputInt = sc.nextInt();
		
		splitter(inputStr, inputInt);
		//bubirdenememesajidir
		//3
	    //bub
		//ird
		//ene
		//mem
		//esa
		//jýd
		//ýr
		
	}
          public static void splitter (String str, int n) {
        	  int index=0;
        	  for(int i =0; i< str.length(); i++) {
        		  System.out.println(str.substring(index,index + n));
        		  index = index + n;
        	  }
        	  System.out.println(str.substring(index, str.length()));
          }
}
