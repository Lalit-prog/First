import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class file1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   try {  
	            // Create f1 object of the file to read data  
	            File f1 = new File("C:/Apps/SeleniumWorkspace/Java/bin/resource/testing.txt");    
	            Scanner dataReader = new Scanner(f1);  
	            while (dataReader.hasNextLine()) {  
	                String fileData = dataReader.nextLine();  
	                String[] str =fileData.split("~");
	                for(int i=0;i<str.length;i++)
	                System.out.println(str[i]);  
	            }  
	            dataReader.close();  
	        } catch (FileNotFoundException exception) {  
	            System.out.println("Unexcpected error occurred!");  
	            exception.printStackTrace();  
	        }  

	}

}
