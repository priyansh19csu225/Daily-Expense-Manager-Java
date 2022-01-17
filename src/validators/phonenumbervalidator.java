package validators;
import java.util.*;
import exceptions.*;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
 public class phonenumbervalidator{

     public boolean pnvalidator(String s)
    {
        try
        {
            Numcheck(s);
        }
        catch(WrongPhoneNumberException p)
        {
            System.out.println(p);
            return false;
        }
        catch(Exception e)
        {
            return false;
        }

        return true;
    }
     public void Numcheck(String s) throws WrongPhoneNumberException
    {
    	Properties prop = new Properties();
		FileInputStream input=null;
        try
        {
            input = new FileInputStream("C:\\Users\\Priyansh\\Desktop\\java_project\\configs\\constants\\exceptions.properties");
            prop.load(input);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        Pattern p = Pattern.compile("^[0-9]{10}$");
        Matcher m = p.matcher(s);
        if(m.find() == false)
            throw new WrongPhoneNumberException(prop.getProperty("WrongPhoneNumberMessage"));
    }
}