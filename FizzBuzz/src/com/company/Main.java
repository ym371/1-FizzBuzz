package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
	    part1();
    }
    public static void addWordsIfDivides(Integer num, Integer divider, String addWord, ArrayList<String> CurrentString){
    	if (num % divider == 0)
    		CurrentString.add(addWord);
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
			addWordsIfDivides(i, 5, "Buzz", output);
			addWordsIfDivides(i, 3, "Fizz", output);
			printWordsOrNumber(output, i);
		}
	}

	public static void part2(){
		for(int i = 1 ; i<=200; i++){
			String output = "";
			if (i % 3 ==0) output+="Buzz";
			if (i % 5 == 0) output+= "Fizz";
			if (i % 13 == 0) output += "Fezz";
			if (i % 7 == 0) output+= "Bang";
			if (i % 11 == 0){
				if (i % 13 != 0) output = "Bong";
				if (i % 13 == 0) output = "FezzBong";
			}

			if (output =="")
				System.out.println(i);
			else
				System.out.println(output);
		}
	}
}
