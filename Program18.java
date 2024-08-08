class Program18
{
static int x= 60;
public static void main(String[] args)
{
System.out.println("Main in methods starts");
test();
System.out.println("Main method ends");
}
public static void test()
{
System.out.println("This is  test the method");
int x=75;
System.out.println("X of test method is"+x);
System.out.println("Static x is :"+ Program18.x);
}
}

