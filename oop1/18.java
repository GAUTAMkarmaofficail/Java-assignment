/*18).Create class Product (p_id, price, quantity) with parameterized constructor.Create a main function in different class (say XYZ) and perform following task:
Accept five product information from user and store in an array
Find P_id of product with highest price.
Create method (with array of product’s object as argument) in XYZ class to calculate and return total amount spent on all products. (amount spent on single product=price of product * quantity of product).
*/
import java.util.Scanner;
class Product{
  private int b[],c[],max,max1=0;
  private String a[];
  public int sum=0;
  int k[]=new int [5];
  public Product(String a[], int b[],int c[]){
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public Product(){}

  public void setA(String a[]){
    this.a = a;
  }
  public void setB(int b[]){
    this.b = b;
  }
  public void setC(int C[]){
    this.c = c;
  }
 public String[] getA(){
    return a;
  }
  public int[] getB(){
    return b;
  }
 public int[] getC(){
    return c;
  }
public void display()
{
    System.out.println("Total Products :  5");
  
  for(int i=0;i<5;i++)
     
       {
        k[i]=b[i]*c[i];
       
       }
    max=c[0];
    
  for(int i=1;i<5;i++){
      
       if(max<c[i])
        
        max1=c[i];
       
     }
   max=1;
  for(int i=0;i<5;i++){
      
       if(max1==c[i])
        
        max=i;
       
     }
 
  System.out.println("P_Id of product with highest price:"+(max));
  for(int ele: k)
    {
     
     sum=sum+ele;
    }
   
     System.out.println("Total amount spent on all products:"+sum);
    
}

}
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String x[]=new String [5];
    int y[]=new int [5];
    int z[]=new int [5];
    System.out.println("Enter 5 product name ");
    for(int i=0;i<5;i++){
     
    System.out.println("Enter "+(i+1)+"  product name ");
      sc.next();
     x[i] = sc.nextLine();
    
    System.out.println("Enter "+(i+1)+"  product quantity ");
     y[i] = sc.nextInt();
    System.out.println("Enter "+(i+1)+"  product price ");
     z[i] = sc.nextInt();
}
    
    
    
   
 
 Product obj1 = new Product(x,y,z);// obj--> a=0,b=0
 obj1.display();

  }
}


