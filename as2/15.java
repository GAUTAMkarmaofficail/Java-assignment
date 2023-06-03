/*15. Write a java program to accept the cost price of a bike
      and display the road tax to be paid according to the 
      following criteria.
      Cost Price(In Rs)		Tax
     > 100000			 15%
     >50000 and <=100000	 10%
     <=50000			 5%			  
*/
import java.util.Scanner;
class Main{
  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the cost price of bike");
       float cost=sc.nextFloat();
       float tax,price;
         if(cost<=50000)
            {
             tax=(cost*5)/100;
           
            }
         else if(cost>50000&&cost>=100000)
               {
                tax=(cost*10)/100;
             

               }
         else
               {
                tax=(cost*15)/100;
               

               }
 System.out.println("The tax is "+tax);
  
}

}
