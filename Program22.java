class Program22
{
public static void test()
{
System.out.println("This is test methods");
}
public static void main(String[] args){
System.out.println("This is main method");
demo();
System.out.println("this is ends main methods");
}
public static void demo()
{
System.out.println("This is demo methods");
test();
System.out.println("Demo ends");
}
}

