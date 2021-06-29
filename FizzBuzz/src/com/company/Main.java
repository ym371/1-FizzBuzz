package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
	    part2();
    }
    public static void addWordsIfDivides(Integer num, Integer divider, String addWord,
										 ArrayList<String> CurrentString, String location,
										 boolean WipeOut){
    	if (num % divider == 0) {
			if (WipeOut)
				CurrentString.clear();
			if (location.equals("right"))
				CurrentString.add(addWord);
			else
				CurrentString.add(0, addWord);
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
			addWordsIfDivides(i, 3, "Fizz", output, "right", false);
			addWordsIfDivides(i, 5, "Buzz", output, "right", false);
			printWordsOrNumber(output, i);
		}
	}

	public static void part2(){
		for(int i = 1 ; i<=200; i++){
			ArrayList<String> output = new ArrayList<String>();
			addWordsIfDivides(i, 3, "Fizz", output, "right", false);
			addWordsIfDivides(i, 5, "Buzz", output, "right", false);
			addWordsIfDivides(i, 7, "Bang", output, "right", false);
			addWordsIfDivides(i, 11, "Bong", output, "right", true);
			//addWordsIfDivides(i, 13, "Bong",
			printWordsOrNumber(output, i);
		}
	}
}
