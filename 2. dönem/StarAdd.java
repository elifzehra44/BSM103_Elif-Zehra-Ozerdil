import java.util.ArrayList;

public class StarAdd {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("kalem");
		words.add("bilgisayar");
		words.add("bartýn");
		words.add("kitap");
		System.out.println("döngü öncesi:" +words);
		for(int index=0; index < words.size(); index+=2) {
			words.add(index, "*");
		}
		System.out.println("döngü sonrasý:" +words);

	}

}
