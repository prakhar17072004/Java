class Triangle
{
  double a;
  double b;
  double c;
  double s;
  
  public void setValue(double a,double b,double c)
  {
   this.a=a;
   this.b=b;
   this.c=c;
  
  }
 
  
  public  void getArea()
  {
    if(a+b>c && b+c>a && c+a>b)
    {
     s=(a+b+c)/2;
    double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println("Area of triangle :" +area);
    }
    else{
    System.out.println("Triangle not satisfied the condition ");
    }
  }
   public  void getPerimeter()
  {
    if(a+b>c && b+c>a && c+a>b)
    {
     
    double Perimeter = a+b+c;
    System.out.println("Perimeter of triangle :" + Perimeter);
    }
    else{
    System.out.println("Triangle not satisfied the condition ");
    }
  }
  
  }
