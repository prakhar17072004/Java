 package Constructor_Overloading;

class Employ {
    
    String name;
    int id;
    double salary;
    
    Employ(String name ,int id,double salary){
        this.name = name;
        this.id=id;
        this.salary=salary;
    }
    //By changing the no of argument at parameter//
    Employ(String name){
        this.name = name;
    }
    //By changing datatyp//
    Employ(int id){
        this.id=id;

    }
    //By changing sequence of datatype//
    Employ(int id ,String name,double salary){
        
        this.id=id;

        this.name = name;
        this.salary=salary;
    }
    public void getDetails(){
        System.out.println("Name of Employ is" +name);
        System.out.println("Id of Employ is" +id);
        System.out.println("Salary of Employ is" +salary);
    }



    
}