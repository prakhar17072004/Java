import java.util.Scanner;

class LaptopDriver
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("=======================");
System.out.println("Details of Laptop1");
System.out.println("Enter the  Brand name of laptop");
String name1= sc.nextLine();
System.out.println("Enter the  price of laptop");
int price1= sc.nextInt();
System.out.println("Enter the  Gen of laptop");
int Generation1= sc.nextInt();
sc.nextLine();
System.out.println("=======================");
System.out.println("Details of Laptop2");
System.out.println("Enter the  Brand name of laptop");
String name2= sc.nextLine();
System.out.println("Enter the  price of laptop");
int price2= sc.nextInt();
System.out.println("Enter the  Gen of laptop");
int Generation2= sc.nextInt();
sc.nextLine();
System.out.println("=======================");
System.out.println("Details of Laptop3");
System.out.println("Enter the  Brand name of laptop");
String name3= sc.nextLine();
System.out.println("Enter the  price of laptop");
int price3= sc.nextInt();
System.out.println("Enter the  Gen of laptop");
int Generation3= sc.nextInt();
System.out.println("=======================");
Laptop l1=new Laptop(name1,price1,Generation1);
Laptop l2=new Laptop(name2,price2,Generation2);
Laptop l3=new Laptop(name3,price3,Generation3);
System.out.println("=======================");
  l1.getDetails();
  System.out.println("=======================");
  l2.getDetails();
  System.out.println("=======================");
  l3.getDetails();
  }
  }
