import java.util.Scanner;
public class uygulama19 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Deðiþken Tanýmlamasý:
			String myName;
			System.out.print("---------------\n- Adýnýz ve Soyadýnýzý Girin: ");
			myName = scanner.nextLine();
			System.out.print("---------------\n-> Yapacaðýmýz Ýþlemler:\n1- Metin Uzunluðu: "+myName.length());
			System.out.print("\n2- Ç Harfi Kaçýncý Ýndis Numarasýnda: "+myName.indexOf("Ç"));
			System.out.print("\n3- Substring(5) Kullanýmý: "+myName.substring(5)+"\n4- Substring(0,4) Kullanýmý: "+myName.substring(0,4));
			System.out.print("\n5- toLowerCase Kullanýmý: "+myName.toLowerCase()+"\n6- toUpperCase Kullanýmý: "+myName.toUpperCase());
		}
        System.out.print("\n---------------");
    }
}
	
		
	