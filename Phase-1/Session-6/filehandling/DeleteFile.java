package com.simplilearn.filehandling;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {
	
	public static void main(String[] args) {
		
		
		Path path= Paths.get("D:\\Simpliscorm\\Phase-1\\Session-6\\deletefile.txt");
		
		try {
			if(Files.deleteIfExists(path))
				System.out.println("File Deleted");
			else
				System.out.println("File not found");
			
		} catch (NoSuchFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No such file exist");
		}
		catch (DirectoryNotEmptyException e) {
			System.out.println("Directory is not empty");
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("Invalid Permission");
		}
		
		
	}

}
