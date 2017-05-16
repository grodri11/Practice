package com.practice.string;

public class PrimeNumbers {
	public static void main(String [ ] args){
	
	int count = 100;
	
	for(int i = 1; i < count; i++){
		
		if(isPrime(i)){
			System.out.println(i);
		}
	}

	}
	
	public static boolean isPrime(int num){
		boolean isPrime = true;
		
		for(int i = 2; i < num/2; i++){
			if(num % i == 0){
				return false;
			}
		}
		
		return isPrime;
	}
}
