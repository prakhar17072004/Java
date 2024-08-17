import java.util.Scanner;
class Big
{
  public static void main(String[] args)
  {
    Scanner sc =new Scanner(System.in);
  int a =sc.nextInt();
  int b =sc.nextInt();
  int sum = getBig(a,b);
  
  System.out.println("Greater numberis is :"+sum);  
  }
  
  public static int getBig(int num1,int num2)
  {
   if(num1 >num2)
   {
   return num1;
   }
   else{
   return num2;
   }
 }
 
 }
 
