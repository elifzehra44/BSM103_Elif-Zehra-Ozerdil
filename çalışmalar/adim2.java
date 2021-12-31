package uygulama2;
import java.util.Scanner;
public class adim2 {

	public static void main(String[] args) {
		       
		        int count=0,deger;
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Baþlangýç Deðerini Girin: ");
		        deger=scanner.nextInt();
		        for(int i=1;i<=deger;i++){
		            if(i%2==0){
		                count++;
		            }
		        }
		        System.out.println("1'den baþlayarak girmiþ olduðunuz "+deger+" deðerine kadar "+count+" çift sayý vardýr.");
		    }
		
	}


