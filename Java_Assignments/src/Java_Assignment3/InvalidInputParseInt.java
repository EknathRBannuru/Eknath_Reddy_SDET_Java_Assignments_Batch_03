package Java_Assignment3;

import java.util.Scanner;

public class InvalidInputParseInt {

	public static void main(String[] args) {
		int age;                        
		Scanner sc = new Scanner(System.in);                        
		System.out.println("Please Enter your age : ");                                               
		age = Integer.parseInt(sc.next());                      
		System.out.println("Your age is : " +age);                      
		}  
	}


