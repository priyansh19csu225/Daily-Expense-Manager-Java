package validators;
import exceptions.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;
import java.util.*;

public class CheckPassword{
public boolean passwordcheck(String filename){
		
		 try{
			checkpassword(filename);
			}
		 catch(InvalidPasswordException e)
		 {
		 	System.out.println(e);
		 	return false;
		 }	
		catch(Exception e){
			
			return false;
		}
		return true;
	}	
public void checkpassword(String fileName) throws InvalidPasswordException{
	    Properties prop = new Properties();
		FileInputStream input=null;
		try{
			input = new FileInputStream("C:\\Users\\Priyansh\\Desktop\\java_project\\configs\\constants\\exceptions.properties");
			prop.load(input);
		   }
		catch (IOException e)
        {
            e.printStackTrace();
        }	   
        if (fileName.length() <8)
			throw new InvalidPasswordException(prop.getProperty("LengthMessage"));
		Pattern costPattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*[0-9])[A-Za-z0-9]+$");
		Matcher costMatcher = costPattern.matcher(fileName);
		boolean value = costMatcher.find();
		if (value==false)
			throw new InvalidPasswordException(prop.getProperty("AlphaNumMessage"));
		
	}
}