package uygulama2;
import java.util.Scanner;
public class adim2 {

	public static void main(String[] args) {
		       
		        int count=0,deger;
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Ba�lang�� De�erini Girin: ");
		        deger=scanner.nextInt();
		        for(int i=1;i<=deger;i++){
		            if(i%2==0){
		                count++;
		            }
		        }
		        System.out.println("1'den ba�layarak girmi� oldu�unuz "+deger+" de�erine kadar "+count+" �ift say� vard�r.");
		    }
		
	}


