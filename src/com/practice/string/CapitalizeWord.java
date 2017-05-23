package com.practice.string;

public class CapitalizeWord {
	
	
	public static void main(String[] args){
		
		boolean capitalize = true;
		int position = 0;
		String input = "this is gabe. gabe is a nice guy. hi im here too.";
		
		StringBuilder sb = new StringBuilder(input);
		
		while(position < sb.length()){
			
			if(sb.charAt(position) == '.'){
				capitalize = true;
			}
			else if(capitalize && !Character.isWhitespace(sb.charAt(position))){
				//sb.setCharAt(position, Character.toUpperCase(sb.charAt(position)));
				capitalizeWord(sb, position);
				capitalize = false;
	
			}
			
			position++;
		}
		
		System.out.println(sb.toString());
	}
	
	public static void capitalizeWord(StringBuilder string, int position){
		
		
		while(!Character.isWhitespace(string.charAt(position))){
			
			string.setCharAt(position, Character.toUpperCase(string.charAt(position)));
			position++;
		}
		
	}

}
