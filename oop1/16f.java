/*

16) Create a class Person with properties (name and age) with following features.
Default age of person should be 18.
A person object can be initialized with name and age.
Method to display name and age of person.
*/
class Person{
    private String name;
    private int age = 18;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Name : "+name+" Age : "+age);
    }
}
class TestMain{
    public static void main(String args[]){
        Person obj = new Person("Cheeku",25); //obj-> name="cheeku",age=18
        obj.display();
    }
}
