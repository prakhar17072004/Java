class CircleDriver

  {
  public static void main(String[] args)
  {
   Circle c1 = new Circle();
   Circle c2 = new Circle();
   Circle c3 = new Circle();
   
   c1.setValue(4);
   c2.setValue(4);
   c3.setValue(4);
   
   System.out.println("====Get area & perimeter of circle1===");
   c1.getArea();
   c1.getCircumference();
   System.out.println("====Get area & perimeter of circle3===");
   c2.getArea();
   c2.getCircumference();
   System.out.println("====Get area & perimeter of circle3===");
   c3.getArea();
   c3.getCircumference();
   }
  }
