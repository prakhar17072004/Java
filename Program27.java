class Program27
{
public static double sum(double a, double b){
System.out.println("This is sum methods  starts");
double sum = a+ b;
System.out.println("Sum methods ends");

return sum;
}
public static void main(String[] args){
double p =30.0;
double q = 40.0;
double sum =sum(p,q);
System.out.println(sum +"Square of "+ sum*sum);
System.out.println("sum of " +sum+" and "  +sum+ " is " +(sum+sum));
}
}
