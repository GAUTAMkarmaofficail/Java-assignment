/*
Instance method can access static and non-static member both
But static only access ststic member
*/
class Test{
  private int a = 20;// by making it static then will run
  private static int b = 10;
  
  
  public void increment(){
    ++a;
    ++b;
  }
  public static void display(){
     System.out.println("a : "+a);
     System.out.println("b : "+b);
  }
}
class TestMain{
   public static void main(String args[]){
     //Test.display();
     Test obj = new Test(); // obj --> a=20, Test--> b=10
     obj.display();
   }
}
