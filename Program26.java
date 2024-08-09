class Program26
{
public static void main(String[] args)
{
int p=30;
int q=40;
int Sum = getSum(p,q);
System.out.println(Sum +"Square of " +Sum*Sum);
}

public static int getSum(int a ,int b){
System.out.println("This is getSum method");
int sum = a+b;
return sum;
}
}
