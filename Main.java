import java.io.*;
import java.util.*;
import java.lang.*;
public class Main{

	public static void main(String[] args){

		String fileName = "matches.csv";
		File file = new File(fileName);
		try{

			Scanner inputStream = new Scanner(file);
			while(inputStream.hasNext()){
				String data = inputStream.next();
				System.out.println(data+"**");
			}
			inputStream.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}