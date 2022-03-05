
public class Week2 {

	public static void main(String[] args) {
	
		System.out.println("Sonuc :" +sumTo(3));

	}
	public static double sumTo(int n) {
		
		if(n<0)
			throw new IllegalArgumentException();
		
		if(n==0)
			return 0.0;
		
		return (double)sumTo(n-1) + 1.0 / n;
	}

}
