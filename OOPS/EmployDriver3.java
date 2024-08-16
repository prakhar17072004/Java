class EmployDriver3
{
public static void main(String[] args)
{
  
  Employ e1 = new Employ();
  Employ e2 = new Employ();
  Employ e3 = new Employ();
  e1.setValue("Mohan",233,12345.00);
  e2.setValue("Mohan",223,134545.00);
  e3.setValue("Mohan",253,123555.00);
  
  System.out.println("=====Detail of Employ1 =====");
  e1.getDetails();
  System.out.println("=====Detail of Employ2 =====");
  e2.getDetails();
  System.out.println("=====Detail of Employ3 =====");
  e3.getDetails();
  
  
  
  }
  
 } 
