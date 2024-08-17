import java.util.Scanner;
class RectangleDriver1
{ 
  public static void main(String[] args)
  {
  Scanner sc = new Scanner(System.in);
  Rectangle r1 = new Rectangle();
  Rectangle r2 = new Rectangle();
  Rectangle r3 = new Rectangle();
   
   System.out.println("Enter the value  length of Rectangle1");
   double l1 = sc.nextDouble();
   System.out.println("Enter the value width of Rectangle1");
   double w1 = sc.nextDouble();
    System.out.println("Enter the value length of Rectangle2");
   double l2 = sc.nextDouble();
   System.out.println("Enter the value width of Rectangle2");
   double w2 = sc.nextDouble();
    System.out.println("Enter the value length of Rectangle3");
   double l3 = sc.nextDouble();
   System.out.println("Enter the value width of Rectangle1");
   double w3 = sc.nextDouble();
     r1.setValue(l1,w1);
     r2.setValue(l2,w2);
     r3.setValue(l3,w3);
     
   System.out.println("====Area and Perimeter of Rectangle1 =======");  
    r1.getArea();
    r1.getPerimeter();
   
   System.out.println("====Area and Perimeter of Rectangle12=======");  
    r2.getArea();
    r2.getPerimeter();  
     
    System.out.println("====Area and Perimeter of Rectangle3 =======");  
    r3.getArea();
    r3.getPerimeter(); 
    
    
    }
    
  }
