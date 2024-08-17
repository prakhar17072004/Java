class Circle
{
  double r;
  
  
  public void setValue(double r)
  {
  
  this.r = r;
  }
  
  public void getArea()
  {
    double area = 3.14 *r;
    System.out.println("Area of cricle is :" +area);
   }
   
   public void getCircumference()
   {
   double circumference=2*3.14*r;
    
    System.out.println("Circumference of circle is :" +circumference);
    
    }
    
  }
