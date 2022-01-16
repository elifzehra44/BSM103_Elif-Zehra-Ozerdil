import java.util.Scanner;

public class FÝBONOCCÝ {

	public static void main(String[] args) {
				    try (// Creating a list of elements
						Scanner reader = new Scanner(System.in)) {
							int n1=0,n2=1,n3,i,n;
							System.out.print("N Sayýsýný Girin:");
							n = reader.nextInt();
							System.out.print(n1+" "+n2);//0 ve 1 yazdýr 
		  
		 for(i=2;i<n;++i)//Döngü 2 den baþlýyor çünkü ilk 2 terim 0 ve 1 her zaman yazýlacak  
		 {  
		  n3=n1+n2;  
		  System.out.print(" "+n3);  
		  n1=n2;  
		  n2=n3;  
		   }
						}
				        System.out.println();
				    }
				    
			}


