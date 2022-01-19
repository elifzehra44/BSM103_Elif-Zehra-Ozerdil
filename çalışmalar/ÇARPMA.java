
public class ÇARPMA {

	public static void main(String[] args) {
		int deger = carpmaIslemi(4,7);
		System.out.println(deger);

	}
	public static int carpmaIslemi(int sayi1, int sayi2) {
		if(sayi2==0)
			return 0;
		if(sayi1==1)
			return sayi2;
		
		return sayi1 + carpmaIslemi(sayi1,sayi2 - 1);
	}

}
