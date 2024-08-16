class Employ
{
 String name;
 int id;
 double salary;
 
  public void setValue(String name,int id,double salary)
  {
   this.name=name;
   this.id=id;
   this.salary=salary;
   
    
   }
   
   
   public void getDetails()
   {
    System.out.println("Name is :"+name);
    System.out.println("Id is :"+id);
    System.out.println("Salary is :"+salary);
    
    }
 }
