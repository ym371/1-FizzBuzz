package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
	    part2();
    }


    public static void addWordsIfDivides(Integer num, Integer divider, String addWord,
										 ArrayList<String> CurrentString, String wipeoutexcept){
    	if (num % divider == 0) {
    		if (!wipeoutexcept.equals("")) WipeOutExcept(CurrentString, wipeoutexcept);
			CurrentString.add(addWord);
		}
	}

	public static void WipeOutExcept(ArrayList<String> CurrentString, String exceptWord){
		if (CurrentString.contains(exceptWord)){
			CurrentString.clear();
			CurrentString.add(exceptWord);
		}
		else
			CurrentString.clear();
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
			addWordsIfDivides(i, 3, "Fizz", output, "");
			addWordsIfDivides(i, 5, "Buzz", output, "");
			printWordsOrNumber(output, i);
		}
	}

	public static void part2(){
		for(int i = 1 ; i<=300; i++){
			ArrayList<String> output = new ArrayList<String>();
			addWordsIfDivides(i, 3, "Fizz", output, "");
			addWordsIfDivides(i, 13, "Fezz", output, "");
			addWordsIfDivides(i, 5, "Buzz", output, "");
			addWordsIfDivides(i, 7, "Bang", output, "");
			addWordsIfDivides(i, 11, "Bong", output,"Fezz");
			reverseIfDivides(i, 17, output);
			printWordsOrNumber(output, i);
		}
	}
}
