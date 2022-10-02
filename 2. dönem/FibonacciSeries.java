package finalll;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {

	public static void main(String[] args) {
		FibonacciSeries fs = new FibonacciSeries();
		fs.fibonacci(5);

	}

	private List<List<Integer>>fibonacci(int numOfRows) {
		
		List<List<Integer>> fib= new ArrayList<List<Integer>>();
		
		List<Integer> temp=new ArrayList<Integer>();
		
		temp.add(1);
		fib.add(temp);
		fib.add(temp);
		
		for(int index=2; index < numOfRows; index++) {
			
			List<Integer> firstPrevious = fib.get(index-1);
			List<Integer> secondPrevious = fib.get(index-2);
			
			int first = secondPrevious.get(secondPrevious.size()-1);
			int second = firstPrevious.get(firstPrevious.size()-1);
			
			List<Integer> currentList = new ArrayList<>();
			currentList.add(second);
			currentList.add(first+second);
			fib.add(currentList);
			
			

			
		}
		return fib;
		
	}

}
