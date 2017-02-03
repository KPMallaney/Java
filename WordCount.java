
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class WordCount {
	
	public static void main(String args[]) throws FileNotFoundException
	{ 
	   File f =  new File("word.txt");
	   Scanner input = new Scanner(f);
	   int count = 0;

	    while (input.hasNextLine()) {

	        if(input.hasNext()) {
	            String word = input.next();
	            count++;
	        }
	    }

	    System.out.println(count);
	}

};	

	
	
	
	
	

