import java.util.Scanner;
public class uygulama19 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// De�i�ken Tan�mlamas�:
			String myName;
			System.out.print("---------------\n- Ad�n�z ve Soyad�n�z� Girin: ");
			myName = scanner.nextLine();
			System.out.print("---------------\n-> Yapaca��m�z ��lemler:\n1- Metin Uzunlu�u: "+myName.length());
			System.out.print("\n2- � Harfi Ka��nc� �ndis Numaras�nda: "+myName.indexOf("�"));
			System.out.print("\n3- Substring(5) Kullan�m�: "+myName.substring(5)+"\n4- Substring(0,4) Kullan�m�: "+myName.substring(0,4));
			System.out.print("\n5- toLowerCase Kullan�m�: "+myName.toLowerCase()+"\n6- toUpperCase Kullan�m�: "+myName.toUpperCase());
		}
        System.out.print("\n---------------");
    }
}
	
		
	