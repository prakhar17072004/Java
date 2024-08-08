class Program23
{
public static void test()
{
System.out.println("test method starts");
System.out.println("test methods  ends");
}
 public static void demo()
 {
 System.out.println("demo methods starts");
 test();
 System.out.println("demo methods ends");
 }
 public static void main(String[] args){
 System.out.println("Main methods starts");
 demo();
 Program22.test();
 System.out.println("Main methods ends");
 }
 } 
