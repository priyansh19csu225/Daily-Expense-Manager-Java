package validators;
import java.util.*;
import java.time.*;
import java.io.*;
         public class dateValidator
{
  public boolean validate(String date){
    
    try{
          LocalDate dateOfbirth=LocalDate.parse(date);
          }
          catch(Exception e)
          {
            System.out.println(e);
            return false;
          }
          return true;
         } 
          
 } 