package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CreateWriteFile {
	
	
	//we can prepare the files in three ways
	//1. create using FileClass
	//2. create using FileoutputStream
	//3. create Using NIO
	
	//1. create using FileClass
	public static void createFileUsingFileClass() throws IOException
	{
		
		File file= new File("D:\\Simpliscorm\\Phase-1\\Session-6\\testFile1.txt");
		
		if(file.createNewFile()) {
			System.out.println("File is Created");
		}
		else {
			System.out.println("File is already Exist");
		}
		//write data to the file
		
		FileWriter writer= new FileWriter(file,false);
		writer.write(" Welcome.....");
		writer.close();
		
	}
	
	//2. create using FileoutputStream
	
	public static void createFileUsingFileoutputStream() throws IOException 
	{
		FileOutputStream out= new FileOutputStream("D:\\Simpliscorm\\Phase-1\\Session-6\\testFile2.txt",true);
		String input= "Welcome to the File Handling";
		
		byte arry[]= input.getBytes();
		out.write(arry);
		
		System.out.println("Data Written Successfully");
		out.close();
		
	}
	
	//3. create Using NIO
	public static void createFileUsingNIO() throws IOException
	{
		Path path= Paths.get("D:\\Simpliscorm\\Phase-1\\Session-6\\testFile3.txt");
		//write the data using fileclass
		
		String input="Welcome to the file handling using NIO";
		
		byte array[]= input.getBytes();
		
		Files.write(path, array, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Data Written Successfully");
	}
	
	public static void main(String[] args) {
		
		 
		try {
			//createFileUsingFileClass();
			//createFileUsingFileoutputStream();
			createFileUsingNIO();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 
		 
	}

}
