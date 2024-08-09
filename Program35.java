//use util package to userinput//
 
 import java.util.Scanner;
 
 class Program35
 {
 
  public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Main methods starts");
   //take input for difference of to number//
   System.out.println("Enter the Frist number");
   int a= sc.nextInt();
   System.out.println("Enter the Second number");
   int b = sc.nextInt(); 
   int Sum = a+b;
   int Sub = a-b;
   int Mul = a*b;
   int Div =a/b;
   int Rem = a%b;
   System.out.println("The Sum of " +a+ " and " +b+ " : " +Sum);
   System.out.println("The difference of " +a+ " and " +b+ " : " +Sub);
   System.out.println("The Multipication of " +a+ " and " +b+ " : " +Mul);
   System.out.println("The Division of " +a+ " and " +b+ " : " +Div);
   System.out.println("The Reminder of " +a+ " and " +b+ " : " +Rem);
  } 
  
 }
