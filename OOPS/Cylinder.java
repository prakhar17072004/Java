class Cylinder
{
  double r;
  double h;
  
  public void  setValue(double r,double h)
  {
   this.r=r;
   this.h=h;
   }
   public void getCSA()
   {
    double csa=2*3.14*r*h;
    System.out.println("CSA of cylinder is  :"+csa);
    }
    public void getTSA()
    { 
      double tsa =2*3.14*r*(r+h);
      System.out.println ("TSA of cylinder is :"+tsa);
      
     }
     public void  getVolume()
     { 
       double Volume =3.14*r*r*h;
       System.out.println("Volume of cylinder:"+Volume);
       }
       
       
   }
