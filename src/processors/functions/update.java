package processors.functions;
import validators.*;
import java.io.*;
import java.util.*;
import java.time.*;
class update2{
     String name;
     void getname(String c)
    {
        name=c;

    }
     void delete() {
        File f = new File("C:\\Users\\Priyansh\\Desktop\\java_project\\user data\\daily_expenses_" + name +".txt");
        File f1 = new File("C:\\Users\\Priyansh\\Desktop\\java_project\\user data\\updater.txt");
        File f2 = new File("C:\\Users\\Priyansh\\Desktop\\java_project\\user data\\updater1.txt");
        f.delete();
        f2.delete();
        f1.renameTo(f);
        
    }
}
class update_add{ 
        
    public void write(){
        FileWriter write;
        try{
            write = new FileWriter("C:\\Users\\Priyansh\\Desktop\\java_project\\user data\\updater1.txt");
            Scanner b1=new Scanner(System.in);
            String a;
            BufferedWriter w = new BufferedWriter(write);//updating the file by adding a new expense
            System.out.println("Enter NAME of your expense ");
             a=b1.nextLine();
             Namevalidator nv= new Namevalidator();
            while(!nv.namevalidator(a))
            {
                System.out.println("Invalid Input !");
                System.out.println("Enter Your name again : ");
                a = b1.nextLine();
            }             
            w.write(a + "\t");
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
            } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class update {
     String name;
    public void getname(String c)
    {
        name=c;

    }

   public void update() {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the name of expense you want to update :");
        String notice = a.nextLine();
        Namevalidator nv= new Namevalidator();
            while(!nv.namevalidator(notice))
            {
                System.out.println("Invalid Input !");
                System.out.println("Enter Your name again : ");
                notice = a.nextLine();
            }             
        System.out.println("Enter the updated expense :");
        update_add d=new update_add();
        d.write();

        try {
            FileReader read = new FileReader("C:\\Users\\Priyansh\\Desktop\\java_project\\user data\\daily_expenses_" + name +".txt");
            BufferedReader r = new BufferedReader(read);
            FileReader update = new FileReader("C:\\Users\\Priyansh\\Desktop\\java_project\\user data\\updater1.txt");
            BufferedReader up = new BufferedReader(update);
            String reader = notice;
            String notice1= up.readLine();
            String read1;
            FileWriter write;
            write = new FileWriter("C:\\Users\\Priyansh\\Desktop\\java_project\\user data\\updater.txt",true);
            BufferedWriter w = new BufferedWriter(write);
            
            while ((read1 = r.readLine()) != null) {
                String[] words = read1.split("\t");
                if (reader.equals(words[0])) {
                    System.out.println("\n\t\t***expense updated***\n");
                    w.write(notice1 + "\n");
                }
                else{
                    w.write(read1 + "\n");
                }
            }
            w.close();
            r.close();
            read.close();
            up.close();
            update2 uc = new update2();
            uc.getname(name);
            uc.delete();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}

