
public class polindrom {

	public static void main(String[] args) {
		String[] array= {"alpha" ,"beta", "beta","alpha2"};
		System.out.println(isPalindrome(array));

	}
	public static boolean isPalindrome(String[] array) {
		int size =array.length;
		int lastIndex = size - 1;
		for(int sayac = 0; sayac < array.length /2; sayac++) {
			
			if(array[sayac] != array[lastIndex-sayac]) {
				return false;
			}
			
		}
		return true;
	}



}
