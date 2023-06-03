import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
   public int p1(int a,int b){
if(a>b)
return a;
else
return b;

   }
}   
class Main{
 public static void main(String args[]){
 
   
    Operation obj=new Operation();
 System.out.println(obj.p1(obj.p1(58,45),obj.p1(25,12) ) );
  
  }

}

