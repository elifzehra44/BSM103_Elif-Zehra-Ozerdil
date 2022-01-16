
public class uygulama28 {

	public static void main(String[] args) {
            int bosluk,satir,sutun;
            int derinlik1 = 0;
			for(satir=1; satir < derinlik1; satir++) {
            	for(bosluk = satir; bosluk < derinlik1 - 1; bosluk++) {
            		System.out.print("");
            	}
            	
            	for(sutun = 0; sutun < satir; sutun++) {
            		System.out.print("*");
            		System.out.print("");
            	}
            	System.out.println();
            }
	}

}
