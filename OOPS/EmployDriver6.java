import java.util.Scanner;
class EmployDriver6
{
  public static void main(String[] args)
  {
  Scanner sc = new Scanner(System.in);

    Employ1 e1= new Employ1();
    Employ1 e2= new Employ1();
    Employ1 e3= new Employ1();
    System.out.println("Enter the name of Employ");
    String nam1 =sc.nextLine();
     System.out.println("Enter the id of Employ");
     int Id1 = sc.nextInt();
      System.out.println("Enter the sal of Employ");
      double salary1= sc.nextDouble();
       
       sc.nextLine();
      
    System.out.println("Enter the name of Employ2");
    String nam2 = sc.nextLine();
     System.out.println("Enter the id of Employ2");
     int Id2 = sc.nextInt();
      System.out.println("Enter the sal of Employ2");
      double salary2= sc.nextDouble();
      
       sc.nextLine();
    System.out.println("Enter the name of Employ3");
    String nam3 =sc.nextLine();
     System.out.println("Enter the id of Employ3");
     int Id3 = sc.nextInt();
      System.out.println("Enter the sal of Employ3");
      double salary3= sc.nextDouble();
       
     
      
    
    e1.setValue(nam1,Id1,salary1);
    e2.setValue(nam2,Id2,salary2);
    e3.setValue(nam3,Id3,salary3);
    
    System.out.println("=========");
    e1.getDetails();
    e1.getActualSalary();
     System.out.println("=========");
    e2.getDetails();
    e2.getActualSalary();
     System.out.println("=========");
    e3.getDetails();
    e3.getActualSalary();
    
    }
  }
