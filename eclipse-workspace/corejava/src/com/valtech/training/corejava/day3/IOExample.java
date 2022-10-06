package com.valtech.training.corejava.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class IOExample {
	public void writeCharsToFile(String fileName,String data) throws Exception{
		File file =new File(fileName);
		Writer out=new BufferedWriter(new FileWriter(file));
		out.write(data);
		out.flush();
		out.close();
	}
	public void writeToFile(String fileName,String contents) throws Exception{
		byte[] data= contents.getBytes();
		File file=new File(fileName);
		OutputStream os =new FileOutputStream(file);
		os.write(data);
		os.close();//Always should be written in finally
		/**for (int i = 0; i < data.length; i++) {
			os.write(data[i]);
		}*/
		
	}
	public String readCharsFromFile(String fileName) throws Exception{
		char [] buffer=new char[4];//16k or 32k buffer is ideal
		File file=new File(fileName);
		Reader in= new BufferedReader(new FileReader(file));
		int i=-1;
		StringBuffer result=new StringBuffer();
		while((i=in.read(buffer))!=-1) {
			result.append(buffer,0,i);
			
		}
		in.close();
		return result.toString();
	}
	public String readFromFile(String fileName) throws Exception{
		byte [] buffer=new byte[4];//16k or 32k buffer is ideal
		File file=new File(fileName);
		InputStream is= new FileInputStream(file);
		int i=-1;
		StringBuffer sb=new StringBuffer();
		while((i=is.read(buffer))!=-1) {
			System.out.println("Size of Read = "+i);
			sb.append(new String(buffer,0,i));
			
		}
		is.close();
		return sb.toString();
	}

	public static void main(String[] args) throws Exception{
		IOExample ex= new IOExample();
		ex.writeToFile("hello.txt", "Hello World");
		//ex.writeToFile("hello.txt", "Ritesh Kumar Singh");// over writing
		System.out.println(ex.readFromFile("hello.txt"));
		ex.writeCharsToFile("hello.txt", "Ritesh Kumar");
		System.out.println(ex.readCharsFromFile("hello.txt"));
	}

}
