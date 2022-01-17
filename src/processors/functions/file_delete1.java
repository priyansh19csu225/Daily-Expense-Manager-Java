package processors.functions;
import validators.*;
import java.io.*;
import java.util.Scanner;

class file_delete {
    void delete() {
        File f = new File("C:\\Users\\Priyansh\\Desktop\\java_project\\user data\\daily_expenses_" + name +".txt");
        File f1 = new File("C:\\Users\\Priyansh\\Desktop\\java_project\\user data\\updater.txt");
        f.delete();
        f1.renameTo(f);
    
     }
    String name;
    void getname(String c)
    {
         name=c;
    }
}
public class file_delete1 {
     String name;
    public void getname(String c)
    {
        name=c;

    }
   
   public void delete() {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the name of expense you want to delete:");
        String notice = a.nextLine();
        Namevalidator nv= new Namevalidator();
            while(!nv.namevalidator(notice))//checking if the expense to be deleted exists or not
            {
                System.out.println("Invalid Input !");
                System.out.println("Enter Your name again : ");
                notice = a.nextLine();
            }             
        try {
            FileReader read = new FileReader("C:\\Users\\Priyansh\\Desktop\\java_project\\user data\\daily_expenses_" + name +".txt");
            BufferedReader r = new BufferedReader(read);
            String reader = notice;
            String read1;
            FileWriter write;
            write = new FileWriter("C:\\Users\\Priyansh\\Desktop\\java_project\\user data\\updater.txt",true);//writing the file to be updated with the deleted expense
            BufferedWriter w = new BufferedWriter(write);
            while ((read1 = r.readLine()) != null) {
                String[] words = read1.split("\t");
                if (reader.equals(words[0])) {
                    System.out.println("\n\t\t***Expense deleted***\n");
                }
                else{
                    w.write(read1 + "\n");
                 }
            }
            w.close();
            r.close();
            read.close();

            
            file_delete fd = new file_delete();
            fd.getname(name);
            fd.delete();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

}
