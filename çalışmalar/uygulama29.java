
public class uygulama29 {

	public static final int N = 6;

	public static void main(String[] args) {
		
		for(int line=N; line >= 1; line--) {
			for(int bosluk1=1; bosluk1 <= (N + (-1 * line)); bosluk1++) {
				System.out.print("");
			}
			System.out.print(line);
			
			for(int bosluk2= 1; bosluk2 < (line*2 -1); bosluk2++) {
				System.out.print("");
			}
			System.out.println(line);
		}

	}

}
