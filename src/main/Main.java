package main;
import java.util.*;
import java.time.*;
import java.io.*;
import processors.functions.*;
import exceptions.*;
import validators.*;
public class Main{
	
    public static void main(String[] args) {
	System.out.printf("\n\n\n\n");
    System.out.printf("\t\t============*************************==============\n");
    System.out.printf("\t\t|                    WELCOME TO                   |\n");
    System.out.printf("\t\t|            ---------------------------          |\n");
    System.out.printf("\t\t|           Daily Expenses Manager App            |\n");
    System.out.printf("\t\t|           -----------------------------         |\n");
    System.out.printf("\t\t|                                                 |\n");
    System.out.printf("\t\t|       Please choose an option:                  |\n");
    System.out.printf("\t\t|      1.Sign up for new account                  |\n");
    System.out.printf("\t\t|      2.Login to your existing account           |\n");
    System.out.printf("\t\t|      3.Exit                                     |\n");
    System.out.printf("\t\t|                                                 |\n");
    System.out.printf("\t\t|           		                          |\n");
    System.out.printf("\t\t|                                                 |\n");
    System.out.printf("\t\t============***************************============\n");
    int c;
    int count=0;
    char n='Y';
    int loop=0;
     Scanner scanner=new Scanner(System.in);
    c=scanner.nextInt();//getting input for what type of operation the user wants to do
     if(c==1)
    {
      try
      {
      	
      	File f=new File("C:\\Users\\Priyansh\\Desktop\\java_project\\user data\\signup.txt");//getting new user signed up
        BufferedWriter bout =new BufferedWriter(new FileWriter(f,true));
	    Float str;
	    int d;
      String m;
	    System.out.println("Enter your Name (Username) ");
      scanner.nextLine();
	    m=scanner.nextLine();
      Namevalidator nv= new Namevalidator();//validation for checking username
        while(!nv.namevalidator(m))
            {
                System.out.println("Invalid Input !");
                System.out.println("Enter Your name again : ");
                m = scanner.nextLine();
            }
    
      bout.write(m); 
	    bout.newLine();
	    System.out.print("Create password (should be include alphabets and digits of atleast 8 length )  ");
	    m=scanner.nextLine();
            while(!nv.namevalidator(m))
            {
                System.out.println("Invalid Input !");
                System.out.println("Enter Your password again : ");
                m = scanner.nextLine();
            }
       CheckPassword cp= new CheckPassword();//validation for checking password
        while(!cp.passwordcheck(m))
            {
                System.out.println("Invalid Input !");
                System.out.println("Enter Your password again : ");
                m = scanner.nextLine();
            }
    
      bout.write(m); 
      bout.newLine();
	    System.out.print("Enter your Date of birth in form yyyy-MM-dd  ");
          String date= scanner.next();
         dateValidator dv = new dateValidator();//validation for checking dob
         while(!dv.validate(date))
         { 
            System.out.println("Invalid Input !");
            System.out.println("Enter Date again : ");
              date = scanner.next();
         }
       bout.write(date);
       bout.newLine();


        System.out.print("Enter your Email-id "); 
        scanner.nextLine();       
	      m=scanner.nextLine();
            while(!nv.namevalidator(m))
            {
                System.out.println("Invalid Input !");
                System.out.println("Enter Your email again : ");
                m = scanner.nextLine();
            }
        emailvalidator ev= new emailvalidator();//validation for checking email id    
        while(!ev.Emvalidator(m))
            {
                System.out.println("Invalid Input !");
                System.out.println("Enter Your email again : ");
                m = scanner.nextLine();
            }
        bout.write(m);
	      bout.newLine();

	    System.out.print("Enter your Contact number ");
      m=scanner.next();
      phonenumbervalidator pnv= new phonenumbervalidator();//validation for checking phone number
      while(!nv.namevalidator(m))
            {
                System.out.println("Invalid Input !");
                System.out.println("Enter Your contact again : ");
                m = scanner.nextLine();
            }
      while(!pnv.pnvalidator(m))
            {   
                System.out.println("Invalid Input !");
                System.out.println("Enter Your contact again : ");
                m = scanner.nextLine();
            }
	    bout.write(m);
	    bout.newLine();
	    bout.close();
      loop=1;

      }
	catch(Exception e)
	{
		System.out.println("Error");
	}
	}	if(loop == 1){  
    System.out.println("Press Y to proceed to login or N to exit");//giving option whether to jump to login page or exit the program
	n=scanner.next().charAt(0); 
	if((n=='Y' || n=='y'))
	{
		c=2;
	}  
	if((n=='n' || n=='N'))
	{
	System.out.println("Exiting the program :)");
   	System.exit(0);
    }
  }   
    if(c==2 && (n=='Y' || n=='y')){
                 

    try{
   
     
            File f1 = new File("C:\\Users\\Priyansh\\Desktop\\java_project\\user data\\signup.txt");  
            BufferedReader bout2= new BufferedReader(new FileReader(f1));
            System.out.print("\nEnter user id :");//getting login details
            scanner.nextLine();
            String name=scanner.nextLine(); 
            Namevalidator nv= new Namevalidator();
            while(!nv.namevalidator(name))
            {
                System.out.println("Invalid Input !");
                System.out.println("Enter Your name again : ");
                name = scanner.nextLine();
            }             
            System.out.print("\nEnter a password:");
            String number=scanner.nextLine();
            while(!nv.namevalidator(number))
            {
                System.out.println("Invalid Input !");
                System.out.println("Enter password again : ");
                number = scanner.nextLine();
            }             
            String s;
            while((s=bout2.readLine())!=null)   
            {       
                 if (name.equals(s))
                 {
                   s=bout2.readLine();
                   if(number.equals(s))
                   {
                    count =2;
                   }
                 }
            }
            if(count == 0)
            {
               System.out.println("Invalid details");
            }

          if(count==2){
          	            System.out.println("\n\n\t\tHURRREEEEEE YIPEEEE::both r correct::SUCCESSSS");//successfully logged in
                        System.out.printf("\t\t============*************************==============\n");
                        System.out.printf("\t\t|                    WELCOME TO                   |\n");
                        System.out.printf("\t\t|            ---------------------------          |\n");
                        System.out.printf("\t\t|           Daily Expenses Manager App            |\n");
                        System.out.printf("\t\t|           -----------------------------         |\n");
                        System.out.printf("\t\t============*************************==============\n");
                        System.out.printf("\t\t|      Login verified successfully:)              |\n");
                        char ans='n';
                        do{
                        System.out.printf("\t\t============*************************==============\n");//the expense edit menu
                        System.out.printf("\t\t|       Please choose an option:                  |\n");
                        System.out.printf("\t\t|      1.ADD a new expense                        |\n");
                        System.out.printf("\t\t|      2.UPDATE existing expense                  |\n");
                        System.out.printf("\t\t|      3.DELETE existing expense                  |\n");
                        System.out.printf("\t\t|      4.DISPLAY existing expense                 |\n");
                        System.out.printf("\t\t|      5.EXIT                                     |\n");
                        System.out.printf("\t\t|                                                 |\n");
                        System.out.printf("\t\t============***************************============\n");
                        int choice1 = scanner.nextInt();
                        if(choice1 == 1){
                            add d=new add();
                            d.getname(name);
                            d.write();
                        }else if(choice1 == 2){
                            update d=new update();
                            d.getname(name);
                            d.update();
                        }else if(choice1 == 3){
                            file_delete1 d=new file_delete1();
                            d.getname(name);
                            d.delete();
                         }else if(choice1 == 4){
                             display d=new display();
                             d.getname(name);
                             d.display1();
                        }else if(choice1 == 5){
                        	System.exit(0);
                        }else{
                            
                            System.out.printf("Invalid selection");
                        }
                        System.out.printf("\t\t>>>>DO you WANT to CONTINUE .... (y/n)\n"); 
                        ans=scanner.next().charAt(0);    
                        }while((ans=='Y' || ans=='y'));

                      }
      bout2.close();
   
   }
    catch(IOException e){
              System.out.println(e);
          }
   } 
   if(c==3)
   {
    System.out.println("Exiting the program :)");
    System.exit(0);

   }   
      
   else {
       	System.out.println("Invalid Input");
       }
   
 
   } 
 
}
