
public class uygulama27 {

	public static void main(String[] args) {
		System.out.println(sumTo(0));
		}
	
	   private static double sumTo(int n) {
		   if(n < 0) {
			   throw new IllegalArgumentException();
		   } else if (n == 0) {
			   return 0.0;
		   } else {
			   return 0;
		   }
	   }
}


