package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
	    part2();
    }
    public static void addWordsIfDivides(Integer num, Integer divider, String addWord,
										 ArrayList<String> CurrentString, boolean WipeOutExceptFezz){
    	if (num % divider == 0) {
			if (WipeOutExceptFezz)
				if (CurrentString.contains("Fezz")){
					CurrentString.clear();
					CurrentString.add("Fezz");
				}
				else
					CurrentString.clear();
			CurrentString.add(addWord);
		}
	}

	public static void reverseIfDivides(Integer num, Integer divider, ArrayList<String> output){
    	if (num % divider ==0){
			Collections.reverse(output);
		}
	}
	public static void printWordsOrNumber(ArrayList<String> output, Integer num){
		if (output.isEmpty())
			System.out.println(num);
		else
			System.out.println(String.join("", output));
	}
	
    public static void part1(){
		for(int i = 1 ; i<=100; i++){
			ArrayList<String> output = new ArrayList<String>();
			addWordsIfDivides(i, 3, "Fizz", output, false);
			addWordsIfDivides(i, 5, "Buzz", output, false);
			printWordsOrNumber(output, i);
		}
	}

	public static void part2(){
		for(int i = 1 ; i<=300; i++){
			ArrayList<String> output = new ArrayList<String>();
			addWordsIfDivides(i, 3, "Fizz", output, false);
			addWordsIfDivides(i, 13, "Fezz", output, false);
			addWordsIfDivides(i, 5, "Buzz", output,  false);
			addWordsIfDivides(i, 7, "Bang", output, false);
			addWordsIfDivides(i, 11, "Bong", output, true);
			reverseIfDivides(i, 17, output);
			printWordsOrNumber(output, i);
		}
	}
}
