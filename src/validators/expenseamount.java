package validators;
import java.util.*;
import java.io.*;


public class expenseamount
{
	public boolean amount(String f){
		
		
	    try{
			Integer.parseInt(f);
		   }
		catch(Exception e){
			return false;
		   }
		return true;
	 }  
      
}