package Constructor_Channing;
import java.util.Scanner;
public class EmployDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of Employ");
        String name1 = sc.nextLine();
        int id1 = sc.nextInt();
        double sal1 = sc.nextDouble();
        Employ e1 = new Employ(name1,id1,sal1);
        e1.getDetails();
        sc.close();
    }
    
}
