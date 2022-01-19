
public class BÖLME {

	public static void main(String[] args) {
		int deger = bolmeIslemi(8,2);
		System.out.println(deger);

	}
	public static int bolmeIslemi(int sayi1, int sayi2) {
		if(sayi2==0) {
			return 0;
	}
		if(sayi1 - sayi2 == 0)
			return 1;
		if(sayi1 < sayi2)
			return 0;
		
		return 1 + bolmeIslemi(sayi1 - sayi2 ,sayi2);
	}
}


