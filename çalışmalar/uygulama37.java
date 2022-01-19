
public class uygulama37 {

	public static void main(String[] args) {
    int[] list = {1,3,6,7,12};
    System.out.println(minGap (list));
	}
	
	public static int minGap(int[] list) {
		if (list.length < 2)
			return 0;
		int min = list[1] - list[0];
		for(int index=2; index < list.length; index++) {
			int gap = list [index] - list [index - 1];
			if(gap < min)
				min = gap;
		}
		return min;
	}

}
