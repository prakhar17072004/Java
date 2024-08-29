package Constructor_Copy;

public class FruitDriver {

    public static void main(String[] args) {
        Fruit f1 = new Fruit("Apple",123,23.3);
        Fruit f2 = new Fruit(f1);
        Fruit f3 = new Fruit();
        System.out.println("============================");
        f1.getDetails();
        System.out.println("============================");
        f2.getDetails();
        System.out.println("============================");
        f3.getDetails();
        System.out.println("============================");
    }
    
}
