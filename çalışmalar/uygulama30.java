
public class uygulama30 {
	public static final int N = 6;

	public static void main(String[] args) {
		
		for(int line=N; line>=1; line--) {
			for(int bosluk = 1; bosluk <=(-1 * line + N); bosluk++) {
				System.out.print(" ");
			}
			System.out.println(line);
		}
		for(int line = 1; line <= N; line++) {
			for(int bosluk=1; bosluk <= (-1 * line + N); bosluk++) {
				System.out.print(" ");
			}
			System.out.println(line);
		}

	}

}
