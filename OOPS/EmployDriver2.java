class EmployDriver2
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
  System.out.println("Name is :" +e1.name);
  System.out.println("Name is :" +e1.id);
  System.out.println("Name is :" +e1.salary);
  System.out.println("=====Detail of Employ2 =====");
  System.out.println("Name is :" +e2.name);
  System.out.println("Name is :" +e2.id);
  System.out.println("Name is :" +e2.salary);
  System.out.println("=====Detail of Employ3 =====");
  System.out.println("Name is :" +e3.name);
  System.out.println("Name is :" +e3.id);
  System.out.println("Name is :" +e3.salary);
  
  
  
  }
  
 } 
