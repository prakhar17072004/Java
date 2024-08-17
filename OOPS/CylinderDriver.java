class CylinderDriver
{
  public static void main(String[] args)
  {
   Cylinder c1=new Cylinder();
   Cylinder c2=new Cylinder();
   Cylinder c3=new Cylinder();
   
   c1.setValue(4,5);
   c2.setValue(12,5);
   c3.setValue(45,3);
   
   System.out.println("Get CSA,TSA AND VOLUME of  cylinder1");
    c1.getCSA();
    c1.getTSA();
    c3.getVolume();
    
    System.out.println("Get CSA,TSA AND VOLUME of  cylinder2");
    c1.getCSA();
    c1.getTSA();
    c3.getVolume();
    System.out.println("Get CSA,TSA AND VOLUME of  cylinder3");
    c1.getCSA();
    c1.getTSA();
    c3.getVolume();
    
   }
} 
