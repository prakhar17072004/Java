class TriangleDriver
{
  public static void main(String[] args)
  {
  
  Triangle t1= new Triangle();
  Triangle t2= new Triangle();
  Triangle t3= new Triangle();
  
  
  t1.setValue(12,22,24);
  t2.setValue(12,22,24);
  t3.setValue(12,22,24);
  System.out.println("=====Get Details of Triangle1 =====");
  t1.getArea();
  t1.getPerimeter();
  System.out.println("=====Get Details of Triangle2 =====");
  t2.getArea();
  t2.getPerimeter();
  System.out.println("=====Get Details of Triangle3 =====");
  t3.getArea();
  t3.getPerimeter();
  
  }
 }
