package com.simplilearn.project;

import java.util.Scanner;

public class Filehandling {
	
	public static void main(String[] args) {
		//store two numbers
				int num1,num2;
				char business = 0;
				
				//take input from user
				Scanner sc= new Scanner(System.in);
				
				System.out.println("Select the option \n 1. Retrive CurrentFile Name in Ascending Order"
						+ "\n 2. Bussinesslevel Operation menu"
						+"\n 3. Exit From Application");
				
				 
				 System.out.println("Enter Your Input(1,2,3)");
						  
				 char operator= sc.next().charAt(0);
				
				 
				
				
				switch(operator) {
				
				case '1':
					
					 //write a program to fetch all files in ascending order
					 
								
					
					
					break;
					
				case '2':
					// business level operation menu
					System.out.println("Business Level Select the option \n 1. Add a file and its content to the directory"
							+ "\n 2. Delete a file From Directory"
							+"\n 3. Searching a file and Showing its content"
							+"\n 4. Exit From Business Level Operation");
					
					
					 	System.out.println("Enter Your Input(1,2,3,4)");
						
					 	  
						 business= sc.next().charAt(0);
					
					
					
					
					break;
					
				case '3':
					 
					 //exit from application
					System.exit(operator);
					break;
					
				 
				default:
					System.out.println("You enter wrong input");
					break;
					
			
				
				}
				
				 
				
				
				switch(business) {
				
				case '1':
					
					  
					addFile();
					
					break;
					
				case '2':
					 
					deleteFile();
					
					
					break;
					
				case '3':
					 
					SearchFile();
					 
					break;
					
				case '4':
					 
					//exit from application
					 System.exit(business);
					 
					break;
					
					
				 
				default:
					System.out.println("You enter wrong input");
					break;
					
			
				
				}
				
				 
		
	}
	
	public static int addFile() {
		System.out.println("Add File Method Called");
		return 0;
		
	}
	
	public static int deleteFile() {
		System.out.println("Delete File Method Called");
		return 0;
		
	}
	
	public static int SearchFile() {
		System.out.println("Search File Method Called");
		return 0;
		
	}
	 

}
