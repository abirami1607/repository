package string;


//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
import java.io.*;

public class Buffer {
	public static void main(String[] args)throws IOException
    {
 	   FileReader fr = new FileReader("C:\\Users\\Trainee\\Desktop\\newfolder\\sumi.txt");
 	   BufferedReader bfr = new BufferedReader(fr);
 	   FileWriter fw= new FileWriter("C:\\Users\\Trainee\\Desktop\\newfolder\\system.txt");
 	   BufferedWriter bfw = new BufferedWriter(fw);
 	   String line;
 	   
 	  while((line=bfr.readLine())!=null)
		{
			System.out.println(line);
			bfw.write(line);
			bfw.newLine();
		}
		//close file
		
		bfr.close();
		bfw.close();
		fr.close();
		fw.close();
    }
}

