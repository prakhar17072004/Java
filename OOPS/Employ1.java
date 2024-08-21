 import java.util.Scanner;
 class Employ1
{
 String name;
 int id;
 double sal ;
  

 
 public void setValue(String name,int id ,double sal)
 {
   this.name =name;
   this.id= id;
   this.sal=sal;
   
   }
   
   public void getDetails()
   {
   System.out.println("Name of Employ is:" +name);
  
    System.out.println("Id of Employ is:" +id);
     System.out.println("Sal of Employ is:" +sal);
   
   }
   
 
 public void getActualSalary( )
 {
  
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter no. of total days in  months");
  int total_days=sc.nextInt();
  System.out.println("Enter the no. of days leave");
  int total_leave = sc.nextInt();
  double actul_Salary=(((total_days)-(total_leave))/(total_days))*(sal);
  System.out.println("The actual salary  is:"+actul_Salary);
  
 
 }
 
 }
