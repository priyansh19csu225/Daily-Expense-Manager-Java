package validators;
import exceptions.*;
import java.util.*;
import java.io.*;


public class Namevalidator
{
	public boolean namevalidator(String filename){
		
		
	    try{
			emptyFileName(filename);
			}
		catch(EmptyFileNameException e)
		{
            System.out.println(e);
            return false;
		}	
		catch(Exception e){
			return false;
		}
		return true;
	 }  
      public void emptyFileName(String filename) throws EmptyFileNameException{
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
			 
		if (filename.isEmpty())
			throw new EmptyFileNameException(prop.getProperty("NameFormatMessage"));
	    }


}