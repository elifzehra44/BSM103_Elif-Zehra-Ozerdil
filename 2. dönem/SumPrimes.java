package finalll;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumPrimes {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		System.out.println("Kaç tane asal sayý toplamak istiyorsunuz?");
		int count=console.nextInt();
		int sum=sumPrimes(count);
		System.out.println("sum ="+sum);
      }
	public static int sumPrimes(int count) {
		if(count <= 0)
			return 0;
		else {
			int sum=IntStream.iterate(1, n -> n+1 )
					.filter(SumPrimes::isPrime)
					.limit(count)
					.sum();
			return sum;
		}
	}
	public static boolean isPrime(int n) {
		return IntStream.range(1, n+1)
				.filter(x -> n % x == 0)
				.count()==2;
	}

	}


