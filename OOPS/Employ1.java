class Employ1
{
 String name;
 int id;
 double sal ;
  int total_leave;
 int working_days;
 
 public void setValue(String name,int id ,double sal,int total_leave,int working_days)
 {
   this.name =name;
   this.id= id;
   this.sal=sal;
   this.total_leave=total_leave;
   this.working_days=working_days;
   }
   
   public void getDetails()
   {
   System.out.println("Name of Employ is:" +name);
   System.out.println("Id of Employ is:" +id);
   
   }
   
 
 public void getActualSalary( )
 {
  
 double actualSal= 30*sal-sal*total_leave;
 System.out.println("The actuel sal is  :"+ actualSal);
 
 }
 
 }
