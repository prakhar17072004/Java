 //use util package to userinput//
 
 import java.util.Scanner;
 
 class Program34
 {
 
  public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Main methods starts");
   //take input for sum of to number//
   System.out.println("Enter the Frist number");
   int a= sc.nextInt();
   System.out.println("Enter the Second number");
   int b = sc.nextInt(); 
   int Sum = a+b;
   System.out.println("The Sum of " +a+ " and " +b+ " : " +Sum);
  } 
  
 }
