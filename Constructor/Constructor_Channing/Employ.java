package Constructor_Channing;

public class Employ {
    String name;
    int id;
    double sal;
    Employ(){
        
        System.out.println("Employ without argument ");
    }
    Employ(String name){
        this();
        this.name = name;
        System.out.println("Employ with string argument");

    }
    Employ(String name,int id){
        this(name);
        this.id=id;
        System.out.println("Employ with int argument");
    }
    Employ(String name,int id,double sal){
        this(name,id);
        this.sal=sal;
        System.out.println("Employ with double argument");
    }

    public void getDetails(){
       System.out.println("Name of Empioy is :" +name);
       System.out.println("Id of Empioy is :" +id);
       System.out.println("Sal of Empioy is :" +sal);
    }
}
