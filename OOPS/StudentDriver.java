import java.util.Scanner;
class StudentDriver
{
  public static void main(String[] args)
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("===================");
  System.out.println("Detail of student1");
  System.out.println("Enter the name of student ");
  String name1=sc.nextLine();
  System.out.println("Enter the branch of student ");
  String branch1=sc.nextLine();
  System.out.println("Enter the sid  of student ");
  int sid1=sc.nextInt();
  
  sc.nextLine();
  System.out.println("===================");
  System.out.println("Detail of student1");
  System.out.println("Enter the name of student ");
  String name2=sc.nextLine();
  System.out.println("Enter the branch of student ");
  String branch2=sc.nextLine();
  System.out.println("Enter the sid of student ");
  int sid2=sc.nextInt();
  
  
   sc.nextLine();
   
  System.out.println("===================");
  System.out.println("Detail of student1");
  System.out.println("Enter the name of student ");
  String name3=sc.nextLine();
  System.out.println("Enter the branch of student ");
  String branch3=sc.nextLine();
  System.out.println("Enter the sid  of student ");
  int sid3=sc.nextInt();
   Student s1 = new Student(name1,branch1,sid1);
   Student s2 = new Student(name2,branch2,sid2);
   Student s3= new Student(name3,branch3,sid3);
   
   System.out.println("===================");
   s1.getDetails();
   System.out.println("===================");
   s2.getDetails();
   System.out.println("===================");
   s3.getDetails();
   
   
   }
 }
   
   
   
   
   
   

