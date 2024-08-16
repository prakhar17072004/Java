class RectangleDriver
{
  public static void main(String[] args)
  {
     Rectangle r1 = new Rectangle();
     Rectangle r2 = new Rectangle();
     Rectangle r3 = new Rectangle();
     
     r1.setValue(12,23.5);
     r2.setValue(12,23.5);
     r3.setValue(12,23.5);
     
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
     
  
