/*
good programing to call static method
(by class name)
static ko hamesa class name se call krege,
*/
class TestMain{
  public static void sayHello(){
   
  }
  public static void main(String args[]){
    /*
    TestMain obj = new TestMain();
    obj.sayHello();
    */
    TestMain.sayHello();
  }
}
