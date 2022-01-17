package validators;
import java.util.*;
import exceptions.*;
import java.io.*;
public class emailvalidator
{

   public boolean Emvalidator(String filename){
		
		try{
			emailvalidation(filename);
			}
		catch(EmailException e)
		{
			System.out.println(e);
			return false;
		}	
		catch(Exception e){
             return false;
		}
      return true;
     }
	public void emailvalidation(String email) throws EmailException{
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
	int c=0;
	for(int i=0;i<email.length();i++){
		if(email.charAt(i)=='@')
			c++;}
	if(c!=1){
			throw new EmailException(prop.getProperty("EmailMessage"));
	}
  }
	
}
