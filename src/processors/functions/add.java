package processors.functions;
import validators.*;
import java.io.*;
import java.util.*;
import java.time.*;
public class add{  
    
    String name;
    public void getname(String c)
    {
        name=c;

    }
    public void write(){
        FileWriter write;
        try{ 
            
            write = new FileWriter("C:\\Users\\Priyansh\\Desktop\\java_project\\user data\\daily_expenses_"+ name +".txt",true);
            Scanner b1=new Scanner(System.in);
            String a;
            BufferedWriter w = new BufferedWriter(write);
            System.out.println("Enter NAME of your expense ");//getting expense details 
            a=b1.nextLine();
            Namevalidator nv= new Namevalidator();
            while(!nv.namevalidator(a))
            {
                System.out.println("Invalid Input !");
                System.out.println("Enter Your name again : ");
                a = b1.nextLine();
            }             
            w.write(a  + "\t");  
            System.out.print("Enter your DATE of expense in form yyyy-MM-dd  ");
            String date= b1.next();
            dateValidator dv = new dateValidator();
            while(!dv.validate(date))
           { 
            System.out.println("Invalid Input !");
            System.out.println("Enter Date again : ");
              date = b1.next();
            }
            w.write(date + "\t");
            System.out.println("Enter AMOUNT of your expense "); 
            b1.nextLine();   
            a=b1.nextLine();
            expenseamount ea = new expenseamount();
             while(!ea.amount(a))
            {
                System.out.println("Invalid Input !");
                System.out.println("Enter AMOUNT again : ");
                a=b1.nextLine();
            }

            w.write(a + "\n");
            w.close();
            System.out.println("\n\t\tEXPENSE MANAGED");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}