package Constructor_Overloading;
import java.util.Scanner;
public class EmployDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Details");
        String name1 = sc.nextLine();
        int id1= sc.nextInt();
        double sal = sc.nextDouble();

        Employ e1 = new Employ(name1,id1,sal);
        Employ e2 =new Employ(name1);
        Employ e3 = new Employ(id1);
        Employ e4 = new Employ(id1,name1,sal);

    
        System.out.println("============================");
        e1.getDetails();
        System.out.println("============================");
        e2.getDetails();
        System.out.println("============================");
        e3.getDetails();
        System.out.println("============================");
        e4.getDetails();
        System.out.println("============================");

        sc.close();
    }
}
