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
	public static Integer inputMaxNum(){
		System.out.println("Please key in a positive integer:");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public static void part2(){
    	Integer num = inputMaxNum();
    	List<Integer> rule= Arrays.asList(3, 5, 7, 11, 13, 17);
		for(int i = 1 ; i<=num; i++){
			ArrayList<String> output = new ArrayList<String>();
			addWordsIfDivides(i, rule.get(0), "Fizz", output, "");
			addWordsIfDivides(i, rule.get(4), "Fezz", output, "");
			addWordsIfDivides(i, rule.get(1), "Buzz", output, "");
			addWordsIfDivides(i, rule.get(2), "Bang", output, "");
			addWordsIfDivides(i, rule.get(3), "Bong", output,"Fezz");
			reverseIfDivides(i, rule.get(5), output);
			printWordsOrNumber(output, i);
		}
	}
}
