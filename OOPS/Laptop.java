class Laptop
{

String Brand_name;
int price;
int generation;


  Laptop(String Brand_name ,int price,int generation)
  {
  this.Brand_name=Brand_name;
  this.price=price;
  this.generation=generation;
  }
  
  public void getDetails()
  {
  System.out.println("Brand name of laptop is :" +Brand_name);
  System.out.println("Price of laptop is :" +price);
  System.out.println("Generation of laptop is :" +generation);
  
  }
  
  }
