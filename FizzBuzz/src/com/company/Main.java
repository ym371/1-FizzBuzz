package com.company;

public class Main {

    public static void main(String[] args) {
	    part1();
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
}
