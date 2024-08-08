class Program19
{
int x=11;
public void start(){
System.out.println("Starts methods starts");
int x = 80;
 System.out.println("Local x is :"+ x);
 System.out.println("Non-static x is :"+this.x);
 }
 public static void main(String[] args){
 System.out.println("Main methods starts ");
 Program19 f1= new Program19();
 f1.start();
 }}
