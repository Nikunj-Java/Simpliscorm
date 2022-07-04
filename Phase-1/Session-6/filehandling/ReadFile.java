package com.simplilearn.filehandling;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReadFile {
	
		//we can Read the files in three ways
		//1. read using FileClass
		//2. read using FileInputStream
		//3. read Using NIO
		
		 //1. read using FileClass
		public static void ReadFileUsingFileClass() throws IOException
		{
			
			FileReader reader= new FileReader("D:\\Simpliscorm\\Phase-1\\Session-6\\testFile1.txt");
			
			int data;
			
			while((data=reader.read())!=-1) {
				System.out.print((char)data);
			}
			 
			
		}
		
		//2. read using FileinputStream
		
		public static void readFileUsingFileInputStream() throws IOException 
		{
			
			FileInputStream steram= new FileInputStream("D:\\Simpliscorm\\Phase-1\\Session-6\\testFile2.txt");
			 
			int data;
			
			while((data=steram.read())!=-1) {
				System.out.print((char)data);
			}
					
		}
		
		//3. readUsing NIO
		public static void readFileUsingNIO() throws IOException
		{
			 List<String> list =Collections.emptyList();
			 Path path= Paths.get("D:\\Simpliscorm\\Phase-1\\Session-6\\testFile3.txt");
			 
			 list= Files.readAllLines(path,StandardCharsets.UTF_8);
			 
			 Iterator<String> it= list.iterator();
			 
			 while(it.hasNext()) {
				 System.out.println(it.next());
			 }
			 
		}
		
		
		public static void main(String[] args) {
			
			try {
				//ReadFileUsingFileClass();
				//readFileUsingFileInputStream();
				readFileUsingNIO();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("error:"+e);
			}
		}

}
