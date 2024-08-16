class KnifeDriver
{
public static void main(String[] args)
{
  Knife k1 = new Knife();
  Knife k2 = new Knife();
  Knife k3 = new Knife();
  Knife k4 = new Knife();
  k1.name="ram";
  k1.length= 40.00;
  k1.width= 60.00;
  k1.color ="blue";
  k2.name="Shyam";
  k2.length= 30.00;
  k2.width= 70.00;
  k2.color ="Gray";
  k3.name="Prakhar";
  k3.length= 330.00;
  k3.width= 640.00;
  k3.color ="Yellow";
  k4.name="ram";
  k4.length= 40.00;
  k4.width= 60.00;
  k4.color ="Green";
  k1.hold();
  k1.swing();
  k1.kill();
  
  System.out.println("=======Details of Knife K1 class======");
  System.out.println("Name of k1 :" +k1.name);
  System.out.println("length of k1 :"+k1.length);
  System.out.println("Width of k1 :"+k1.width);
  System.out.println("Color of k1 :"+k1.color);
  
   System.out.println("=======Details of Knife K2 class======");
  System.out.println("Name of k2 :" +k2.name);
  System.out.println("length of k2 :"+k2.length);
  System.out.println("Width of k2 :"+k2.width);
  System.out.println("Color of k2 :"+k2.color);
   System.out.println("=======Details of Knife K3 class======");
  System.out.println("Name of k3 :" +k3.name);
  System.out.println("length of k3 :"+k3.length);
  System.out.println("Width of k3 :"+k3.width);
  System.out.println("Color of k3 :"+k3.color);
  
   System.out.println("=======Details of Knife K4 class======");
  System.out.println("Name of k4:" +k4.name);
  System.out.println("length of k4 :"+k4.length);
  System.out.println("Width of k4 :"+k4.width);
  System.out.println("Color of k4 :"+k4.color);
  }
 } 
