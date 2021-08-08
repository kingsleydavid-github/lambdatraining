package javadesignpattern.singleton1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class SingletonTestMain{
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		//SampleSingleton s = new SampleSingleton();
		
		SampleSingleton s1 = SampleSingleton.getInstance();
		
		ObjectOutput fis = new ObjectOutputStream(new FileOutputStream(new File("C:\\Kingsley David\\singleton\\singleton.txt")));
		fis.writeObject(s1);
		
		ObjectInput fop = new ObjectInputStream(new FileInputStream(new File("C:\\Kingsley David\\singleton\\singleton.txt")));
		
		SampleSingleton s2 = (SampleSingleton) fop.readObject();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}
	
}
