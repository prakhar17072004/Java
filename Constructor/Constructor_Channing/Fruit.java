package Constructor_Channing;

public class Fruit {
    String name;
    String color;
    double weight;

    Fruit(){
        System.out.println("Constructor wihtout argument");
    }
    Fruit(String name){
        this();
        this.name = name;
        System.out.println("Constructor with sting argument");
         
    }
    Fruit(String name,String color){
        this(name);
        this.color=color;
        System.out.println("Constructor with string string argument");

    }
    Fruit(String name,String color,double weight){
        this(name,color);
        this.weight=weight;
        System.out.println("Constructor with string string double argument");
    }
    public void getDetails(){
        System.out.println("Name of fruit is :"+name);
        System.out.println("Color of fruit is :"+color);
        System.out.println("Weight of fruit is :"+weight);
    }
   
    
}
