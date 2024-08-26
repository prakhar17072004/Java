package Constructor_Overloading;

public class Fruit {
    String name;
    String color;
    String fruit_type;
    double weight;
   

    Fruit(String name,String color,String fruit_type, double weight){
        this.name = name;
        this.color=color;
        this.fruit_type=fruit_type;
        this.weight=weight;
    }
    //By changing the argument of parameter //
    Fruit(String name,String color){
        this.name = name;
        this.color=color;
        
    }
    //By changing the datatype//
    Fruit(double weight){
        this.weight=weight;
    }
    //By changing the sequence of datatype
    Fruit(String color,String name,double weight,String fruit_type){
        this.name = name;
        this.color=color;
        this.fruit_type=fruit_type;
        this.weight=weight;
    }
    public void getDetails(){
        System.out.println("Name of fruit is :"+ name);
        System.out.println("Color of fruit is :"+ color);
        System.out.println("Type of fruit is :"+ fruit_type);
        System.out.println("Weight of fruit is :"+ weight);
    }
}
