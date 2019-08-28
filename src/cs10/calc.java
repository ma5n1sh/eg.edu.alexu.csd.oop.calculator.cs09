package eg.edu.alexu.csd.oop.calculator.cs10;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class calc implements Calculator{

	private String in;
	private ArrayList<String> history=new ArrayList<String>();
	private int index,currentIndex;
	private boolean flag;
	
	public calc() {
		index=0;currentIndex=-1;flag=false;
		
	}
	
	public void input(String s) {
		in=s;
	}
	

	public void flusher() {
		if(index>5) {history.remove(0);index--;currentIndex--;}
	}
	
	
	private void oneWayValve() {
		if(index-currentIndex==1) {return;}
		else {for(int j=currentIndex+1;j<index;j++) {history.remove(j);}
		index=currentIndex+1;
		}
	}
	
	private boolean inputValidator(String input) {
		if(input=="") {return false;}
		int operatorIndex=0,j=1,dotcount=0;
		while(j<input.length()) {
			if(input.charAt(j)=='+'||input.charAt(j)=='-'||input.charAt(j)=='*'||input.charAt(j)=='/') {operatorIndex=j;break;}
			j++;
		}
		if(j==input.length()) {return false;}
		for(j=0;j<operatorIndex;j++) {if(input.charAt(j)=='.') {dotcount++;}}
		if(dotcount>1) {return false;}
		dotcount=0;
		for(j=operatorIndex;j<input.length();j++) {if(input.charAt(j)=='.') {dotcount++;}}
		if(dotcount>1) {return false;}
		
		for(j=0;j<input.length();j++) {
			if(j!=operatorIndex) {
				if(j!=0&&j!=operatorIndex+1) {
					if(input.charAt(j)=='+'||input.charAt(j)=='-'||input.charAt(j)=='*'||input.charAt(j)=='/') {return false;}
				}
				if((j==0||j==operatorIndex+1)&&(input.charAt(j)=='+'||input.charAt(j)=='*'||input.charAt(j)=='/')) {return false;}
			} 
		}
			
		
		
		return true;
	}
	
	public String getResult() {
		if(!inputValidator(in)) {return"input error";}
		double one,two;
		char op;
		int i=1;
		while(in.charAt(i)!='+'&&in.charAt(i)!='-'&&in.charAt(i)!='*'&&in.charAt(i)!='/') {
			i++;
		}
		one=Double.valueOf(in.substring(0,i));
		op=in.charAt(i);
		two=Double.valueOf(in.substring(i+1));
		
		switch (op){
		case '+':
				history.add(in);
				index++;
				currentIndex++;
				flusher();
				oneWayValve();
				return Double.toString(one+two);
		case'-':
				history.add(in);
				index++;
				currentIndex++;
				flusher();
				oneWayValve();
				return Double.toString(one-two);
		case'*':
				history.add(in);
				index++;
				currentIndex++;
				flusher();
				oneWayValve();
				return Double.toString(one*two);
		case'/':if(two!=0) {
				history.add(in);
				index++;
				currentIndex++;
				flusher();
				oneWayValve();
				return Double.toString(one/two);}
		else return "error cannot divide by zero";
		
		}
		
		return null;
	}

	
	public String current() {
		if(!flag) {return history.get(currentIndex);}
		else return "No saved files available";
	
	}

	
	public String prev() {
		if(currentIndex-1>=0)return history.get(--currentIndex);
	else return null;
	}

	
	public String next() {
		if(index-currentIndex>1) {return history.get(++currentIndex);}
	else return null;
	}

	
	public void save() throws IOException  {
		String Save=Integer.toString(index)+"\n"+Integer.toString(currentIndex);
	for(int j=0;j<history.size();j++) {Save=Save+"\n"+history.get(j);}
	 BufferedWriter writer = new BufferedWriter(new FileWriter("saved.txt"));
	 writer.append(Save);
	 writer.close();
	}

	
	
	
	public void load() throws NumberFormatException, IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("saved.txt",true));
		 writer.append("-2"+"\n");
		 writer.close();
		 
		BufferedReader br = new BufferedReader(new FileReader("saved.txt"));
		index=Integer.valueOf(br.readLine());
		if(index!=-2) {
		currentIndex=Integer.valueOf(br.readLine());
		String line;
		history=new ArrayList<String>();
		while ((line = br.readLine()) != null) {history.add(line);}
		history.set(currentIndex,history.get(currentIndex).substring(0,history.get(currentIndex).length()-2));
		in=history.get(currentIndex);
		br.close();
		}
		else {flag=true;}
	}
	

}
