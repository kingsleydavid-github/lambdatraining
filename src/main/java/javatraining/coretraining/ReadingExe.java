package javatraining.coretraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingExe {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
		int c;
		 while((c = br.read()) != -1) {
			 char ch = (char) c;
			 System.out.print(ch);
		 }
		} catch (IOException e) {
			
		}
	}
	
}
