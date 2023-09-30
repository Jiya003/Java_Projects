/*Simple Word Counter
Description: Use Java to count words, characters, and lines in text.
Functionalities:
a. Analyze text files and count words, characters, and lines (file paths).
import java.util.*;
import java.io.*;
*/

public class SimpleWordCounter{
	public static void main(String[] args) throws IOException{
		File fr=new File("para.txt");
		int wordCount=0;
		int charCount=0;
		int lineCount=0;
		BufferedReader br=new BufferedReader(new FileReader(fr));
		
		String s;
		
		while((s=br.readLine())!=null){
		String words[]=s.split(" ");
		wordCount=wordCount+words.length;
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' ')
			charCount++;
			if(s.charAt(i)=='\n')
			lineCount++;
		}
		}
		System.out.println("Number of words in the File :"+wordCount);
		System.out.println("Number of characters in the File :"+charCount);
		System.out.println("Number of lines in the File :"+LinerCount);
		br.close();
	}
}
