package Constructor_Overloading;
import java.util.Scanner;
public class FruitDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of fruit");
        String name1 = sc.nextLine();
        String color1 = sc.nextLine();
        String type = sc.nextLine();
        double weight1= sc.nextDouble();

        Fruit f1=new Fruit(name1,color1,type,weight1);
        Fruit f2=new Fruit(name1,color1);
        Fruit f3=new Fruit(weight1);
        Fruit f4=new Fruit(color1,name1,weight1,type);
      System.out.println("===================") ; 
        f1.getDetails();
        System.out.println("===================") ; 
        f2.getDetails();
        System.out.println("===================") ; 
        f3.getDetails();
        System.out.println("===================") ; 
        f4.getDetails();
        System.out.println("===================") ; 
        sc.close();
    }

}
