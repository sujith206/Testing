package Test;

public class primecheck {
	public static boolean isPrime(int num) {
		// Numbers less than 2 are not prime
		if (num <= 1) {
			return false;
		}

		// Check divisibility from 2 up to the square root of the number
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false; // If divisible, not a prime number
			}
		}

		return true; // If no divisors found, it's prime
	}
	public static void main(String[] args) {
		int number =20;
		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}



		// Method to check if a number is prime
		
	}

}
