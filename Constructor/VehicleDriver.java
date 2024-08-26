import java.util.Scanner;
class VehicleDriver
{
public static void main(String[] args)
{

  Scanner sc = new Scanner(System.in);
  System.out.println("=====================");
  
  System.out.println("Enter the name of vehicle");
  String name1= sc.nextLine();
  System.out.println("Enter the model of vehicle");
  String model1= sc.nextLine();
  System.out.println("Enter the Year of vehicle");
  int year1= sc.nextInt();
  
  sc.nextLine();
   System.out.println("=====================");
  System.out.println("Enter the name of vehicle");
  String name2= sc.nextLine();
  System.out.println("Enter the model of vehicle");
  String model2= sc.nextLine();
  System.out.println("Enter the Year of vehicle");
  int year2= sc.nextInt();
  
  sc.nextLine();
   System.out.println("=====================");
  System.out.println("Enter the name of vehicle");
  String name3= sc.nextLine();
  System.out.println("Enter the model of vehicle");
  String model3= sc.nextLine();
  System.out.println("Enter the Year of vehicle");
  int year3= sc.nextInt();
  Vehicle v1=new Vehicle(name1,model1,year1);
  Vehicle v2=new Vehicle(name2,model2,year2);
  Vehicle v3=new Vehicle(name3,model3,year3);
  
  System.out.println("======================");
  v1.getDetails();
  System.out.println("======================");
  v2.getDetails();
  System.out.println("======================");
  v3.getDetails();
  
  }
}  
