class Vehicle
 {
   String name;
   String model;
   int year_Of_Manuf;
   
   Vehicle(String name,String model,int year_Of_Manuf)
   {
     
   this.name=name;
   this.model=model;
   this.year_Of_Manuf=year_Of_Manuf;
   
   }
   
   public void getDetails()
   {
   System.out.println("Name of Vehicle is :" +name);
   System.out.println("Model of Vehicle is :" +model);
   System.out.println("Year_of_Manufacture of Vehicle is :" +year_Of_Manuf);
   }
 }
