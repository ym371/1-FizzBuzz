package com.company;

public class Main {

    public static void main(String[] args) {
	    part2();
    }
    public static void part1(){
		for(int i = 1 ; i<=100; i++){
			if (i % 15 == 0){
				System.out.println("FizzBuzz");
			}
			else if (i % 5 ==0){
				System.out.println("Buzz");
			}
			else if (i % 3 == 0){
				System.out.println("Fizz");
			}
			else System.out.println(i);
		}
	}

	public static void part2(){
		for(int i = 1 ; i<=200; i++){
			String output = "";
			if (i % 3 ==0) output+="Buzz";
			if (i % 5 == 0) output+= "Fizz";
			if (i % 7 == 0) output+= "Bang";
			if (output =="")
				System.out.println(i);
			else
				System.out.println(output);
		}
	}
}
