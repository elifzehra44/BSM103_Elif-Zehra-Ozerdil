package finalll;

public class Search {

	public static void main(String[] args) {
		int[] numbers= {63,18,51,37,29,49,42,11};
		
		int index = indexOf(numbers,29);
		
		if(index != -1)
			System.out.println("Eleman�n indeksi:" +index);
		else
			System.out.println("Eleman bulunamad�");
       }
	//target -> arad���m�z de�er
	public static int indexOf(int []numbers, int target) {
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i]==target)
				return i;
		}
		return -1;
	}

}
