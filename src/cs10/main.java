package eg.edu.alexu.csd.oop.calculator.cs10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class main {
public static void main(String[] args) throws IOException {
	calc a=new calc();
	a.input("1-2");
	System.out.println(a.getResult());
	a.input("5-1");
	System.out.println(a.getResult());
	//a.input("3-1");
	//System.out.println(a.getResult());
	//System.out.println(a.prev());
	//System.out.println(a.prev());
	System.out.println(a.prev());
	System.out.println(a.next());
	//System.out.println(a.next());
	//System.out.println(a.next());

	 
}
}
