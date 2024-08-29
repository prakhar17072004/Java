package Constructor_Copy;

public class Fruit {
    String name;
    int price;
    double weight;
     
    Fruit(){
        System.out.println("Fruit without argrument");
    }
    Fruit(String name, int price,double weight){
        
           this.name = name;
           this.price = price;
           this.weight=weight;
    }
    Fruit(Fruit p){
     System.err.println("copy constructor");        
     this.weight = p.weight;

    }
    public void getDetails(){
        System.out.println("Name of fruit is : " +name);
        System.out.println("Price of fruit is : " +price);
        System.out.println("Weight of fruit is : " +weight);


    }
    
}
