package com.practice.string;

public class factorial {

	
	public static void main(String [ ] args){
	System.out.println(factorial(2));
	
	
	}
	
	public static int factorial(int num){
		if(num == 0){
			return 1;
		}
			
		return num * factorial(num -1);
	}
	
	public void factorialInterative(){
		int number = 10;
		int result = 1;
		
		while(number > 0){
			result = result * number;
			number--;
		}
		System.out.println(result);
	}


}

