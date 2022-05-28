package finalll;
 class InsertionSort {
    	
	 void insertionSort(int[] array) {
		 for(int i= 1; i < array.length; i++) {
			 int key = array[i];
			 int j = i - 1;
			 while(j >= 0 && array[j] > key) {
				 array[j+1] = array[j];
				 j--;
			 }
			 array[j+1] = key;
		 }
    }
	 
	 void printArray(int[] array) {
			for(int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}
	 public static void main(String[] args) {
		 int[] array= {19,28,11,3,1,35};
		 BubbleSort ob= new BubbleSort();
		 ob.bubbleSort(array);
		 ob.printArray(array);
	 }

}
