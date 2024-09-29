import java.util.*;

public class FibPrime {
	
	public static boolean isPrime(int num) {
		for(int div = 2; div < num; div++) {
			if(num % div == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void fibPrime(int range) {
		int term1 = 1;
		int term2 = 1;
		int count = 0;
		int nextTerm = term1 + term2;
		while(nextTerm <= range) {
			term1 = term2;
			term2 = nextTerm;
			if(isPrime(nextTerm)) {
				System.out.println(nextTerm);
				count++;
			}
			nextTerm = term1 + term2;
			
		}
		if(count == 0) {
			System.out.println("No primes in the range");
		}
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range : ");
		int range = sc.nextInt();
		fibPrime(range);
		
		sc.close();
	}

}
