import java.util.ArrayList;

public class SortExample {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("kalem");
		words.add("bilgisayar");
		words.add("bartýn");
		words.add("kitap");
		
		System.out.println("sýralamadan önce:" +words);
		System.out.println(words.get(0));
 
	}

}
