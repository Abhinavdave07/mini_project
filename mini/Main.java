
import java.util.Scanner;
import java.lang.System;
import java.io.*;
class UserDetails
{
    String name,address,email;
    int age,ph;
    public UserDetails(String name,String address,String email,int age,int ph)
    {
     this.name=name;
     this.address=address;
     this.email=email;
     this.age=age;
     this.ph=ph;
    }
    void show()
    {
        System.out.println("Data saved successfully");
    }


}
public class Main
{
    public static void main(String[] args)
    {int age,ph;
        String name,address,email;
        Scanner sc = new Scanner(System.in);
   
        
    

        System.out.println("Enter your name= ");
        name=sc.nextLine();

        System.out.println("Enter your address= ");
        address=sc.nextLine();

        System.out.println("Enter your email= ");
        email=sc.nextLine();

        System.out.println("Enter your age= ");
        age=sc.nextInt();

        System.out.println("Enter your phone number= ");
        ph=sc.nextInt();

        try{
            FileWriter f = new FileWriter("User Details");
            f.write(name +"\n");
            f.write(address+"\n");
            f.write(email+"\n");
            f.write(age+"\n");
            f.write(ph+"\n");
            
            System.out.println("Data saved successfully");

            
                f.close();
            
            
        }
        catch(FileNotFoundException fnfe)
        {
          System.out.println(fnfe);
        }
        catch(IOException ioe)
        {
         System.out.println(ioe);
        }
        

        UserDetails ud =new UserDetails(name,address,email,age,ph);

        

    }
}