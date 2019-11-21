package string;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//import java.io.FileInputStream;


//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;

//import java.io.IOException;
// for byte 
public class filecreation {
           public static void main(String[] args)throws IOException
           {
        	   FileInputStream fis = new FileInputStream("C:\\Users\\Trainee\\Desktop\\newfolder\\sumi.txt");
        	   FileOutputStream fos = new FileOutputStream("C:\\Users\\Trainee\\Desktop\\newfolder\\system.txt");
        	   int val;
        	   
        	   // to check end of stream
        	   while((val=fis.read())!= -1)
        	   {
        		   fos.write(val);
        	   }
        	   // close file
        	   fis.close();
        	   fos.close();
           }
}
