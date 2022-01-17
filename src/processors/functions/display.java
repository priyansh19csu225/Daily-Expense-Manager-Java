package processors.functions;
import java.io.*;
import java.util.*;
public class display {
     String name;
    public void getname(String c)
    {
        name=c;

    }
   public void display1(){
       try{
         FileReader f1 = new FileReader("C:\\Users\\Priyansh\\Desktop\\java_project\\user data\\daily_expenses_" + name +".txt");
         BufferedReader b1 = new BufferedReader(f1);//reading the saved expense details
        String money;
        int j=1;
        System.out.printf("\t\t===========*********************============\n");
        System.out.printf("\t\t|                                          |\n");
        System.out.printf("\t\t|        -------------------------         |\n");
        System.out.printf("\t\t|       Daily Expenses Manager App         |\n");
        System.out.printf("\t\t|+----------------------------------------+|\n");
        System.out.printf("\t\t|| S.no.  NAME         DATE        AMOUNT ||\n");
        System.out.printf("\t\t|+----------------------------------------+|\n");
        System.out.printf("\t\t============================================\n");
        while((money= b1.readLine())!=null){
            System.out.println("\t\t|     "+j+". "+money +"|");
            j++;
        }
        System.out.printf("\t\t============================================\n");
        
        b1.close();
        f1.close();
        
     
    }
     catch(IOException e){
            e.printStackTrace();
        }
        try{
         FileReader f1 = new FileReader("C:\\Users\\Priyansh\\Desktop\\java_project\\user data\\daily_expenses_" + name +".txt");
         BufferedReader b1 = new BufferedReader(f1);
         int total=0;
         String line;
         while((line= b1.readLine())!=null){
            String[] word;
            word=line.split("\t");
            total+=Integer.parseInt(word[2]);
         }   
         System.out.printf("\t\t=====================TOTAL Rs." +total +"       \n");//displaying the final amount of expense
        b1.close();
        f1.close(); 
       }
   catch(IOException e){
            e.printStackTrace();
        }
      
      
    }
}
  