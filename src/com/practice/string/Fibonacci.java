package com.practice.string;

public class Fibonacci {

	public static void main(String [ ] args){
		
		
		int fib1 = 1;
		int fib2 = 1;
		int current = 0;
		
		for(int i = 0; i < 10; i++){
			
			current= current + fib1;
			System.out.print(current + " ");
			fib1 = fib2;
			fib2 = current;
		}
		
	}


}
