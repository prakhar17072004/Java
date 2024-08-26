class Student
{
 
 String name;
 String branch;
 int sid;
 
 
Student(String name,String branch,int sid)
{
  this.name=name;
  this.branch=branch;
  this.sid=sid;
  }
  
  public void getDetails()
  {
  System.out.println("Name of student is :"+name);
  System.out.println("Branch of student is :"+branch);
  System.out.println("Sid of student is :"+sid);
  }
 
 }
 
 
