package com.simplilearn.project;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchFromArray {

	public static void main(String args[]) {
		String array[] = { "Apple", "Banana", "Graps", "Kiwi" };

		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);

		String email = sc.next();

		boolean flag = false;
		
		for (int i = 0; i < array.length; i++) {

			if (email.equals(array[i])) {
				System.out.println("String Found");
				flag = true;
			}

		}
		if(flag==false) {
			System.out.println("No Email Id Available in Database");
		}

	}
}
