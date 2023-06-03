/*A person enter in a D-Mart mall for the shopping. He is first
time visiting the D-mart mall. 
He/She has to purchase 10 items.

System should ask for the name of the customer and Gender.

User will tell you the item name and quantity of each product
purchased one by one.

You have to calculate the total bill amount on the following 
Criteria basis
 
 on first product purchase if quantitiy greater then
 4 then you have to offer 5% discount on total price of that product
 
 on 5th product purchase you have to offer 10% discount on total
 price.
 
 on 10th product purchase you have to offer 15% discount on total
 price of that product. 

 let suppose the cost of 1st product is 10
 cost of 2nd product is 20
    .
    .
 cost of 10th product is 100;

 if Total Bill amount is greater then 50000 then you have
 to offer 15% of total bill amount
 if total Bill amount is between 30000 and 50000 then 
 you have to offer 10% of total bill amount
 
 Also 10% GST of total Bill Amount
 
 Then you have to ask for carry bag to customer
 if he/she yes then add 10 rupees in total bill amount.
 
 if the customer is female then you have to gift a Cadeberry
 If the customer is mael then you have to gift a Ladger Wallet
 
 Develop a Java Application to Generate the Bill in 
 Following Format
 
                         D-Mart
   Name : Cheeku Sing			Data: 12/9/2022
   -----------------------------------------------------------
   Item Name	Quantity    Price	Total   After-Discount		                      
     Item-1	   5	      10        50 Rs       47.5 Rs
     Item-2	   3	      20	60 RS       60.0 RS	
       .
       .
       .
       .
       .
       .
       .
     Item-10	  20        100         2000       300.0 Rs
   ----------------------------------------------------------
                                        A.P	    D.P	
                                        45000	    43500 
     Gift :- Cadeberry                  0.00	    0.00
                                        
     Carry Bag : yes                    10:00	    10:00
     GST (10%)	                        450         450
   ---------------------------------------------------------
                                        45460       43960 RS
                                        
                       Thank You
                        To Vist
                         D-Mart                 
                                          		  
   ----------------------------------------------------------  
*/ 
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
             System.out.println("Enter costumer name ");
             String name=sc.nextLine();
             System.out.println("Enter costumer gender(M/F)");
             char gender=sc.next().charAt(0);
             


             System.out.println("Enter ITEM 1 name ");
             String i1=sc.nextLine();
             System.out.println("Enter quantity ");
             int q1=sc.nextInt();
             System.out.println("Enter price");
             int p1=sc.nextInt();

             System.out.println("Enter ITEM 2 name ");
             String i2=sc.nextLine();
             System.out.println("Enter quantity ");
             int q2=sc.nextInt();
             System.out.println("Enter price");
             int p2=sc.nextInt();

             System.out.println("Enter ITEM 3 name ");
             String i3=sc.nextLine();
             System.out.println("Enter quantity ");
             int q3=sc.nextInt();
             System.out.println("Enter price");
             int p3=sc.nextInt();

             System.out.println("Enter ITEM 4 name ");
             String i4=sc.nextLine();
             System.out.println("Enter quantity ");
             int q4=sc.nextInt();
             System.out.println("Enter price");
             int p4=sc.nextInt();

             System.out.println("Enter ITEM 5 name ");
             String i5=sc.nextLine();
             System.out.println("Enter quantity ");
             int q5=sc.nextInt();
             System.out.println("Enter price");
             int p5=sc.nextInt();

             System.out.println("Enter ITEM 6 name ");
             String i6=sc.nextLine();
             System.out.println("Enter quantity ");
             int q6=sc.nextInt();
             System.out.println("Enter price");
             int p6=sc.nextInt();

             System.out.println("Enter ITEM 7 name ");
             String i7=sc.nextLine();
             System.out.println("Enter quantity ");
             int q7=sc.nextInt();
             System.out.println("Enter price");
             int p7=sc.nextInt();

             System.out.println("Enter ITEM 8 name ");
             String i8=sc.nextLine();
             System.out.println("Enter quantity ");
             int q8=sc.nextInt();
             System.out.println("Enter price");
             int p8=sc.nextInt();

             System.out.println("Enter ITEM 9 name ");
             String i9=sc.nextLine();
             System.out.println("Enter quantity ");
             int q9=sc.nextInt();
             System.out.println("Enter price");
             int p9=sc.nextInt(); 

              System.out.println("Enter ITEM 10 name ");
              String i10=sc.nextLine();
              System.out.println("Enter quantity ");
              int q10=sc.nextInt();
              System.out.println("Enter price");
              int p10=sc.nextInt();
             
             
           
            












             System.out.println("\t\t\t\tWELCOME TO D-MARK");
             System.out.println("*******************************************************************************************");
             System.out.println("NAME:"+name+"\t\t\t\t\t\t\t DATE :22/09/2022");
             System.out.println("*******************************************************************************************");
             System.out.println("Item Name	   Quantity              Price	           Total              After-Discount");
             System.out.println(i1+"	           "+q1+"                "+p1+"	           Total              After-Discount");
             System.out.println(i2+"	           "+q2+"                "+p2+"	           Total              After-Discount");
             System.out.println(i3+"	           "+q3+"                "+p3+"	           Total              After-Discount");
             System.out.println(i4+"	           "+q4+"                "+p4+"            Total              After-Discount");
             System.out.println(i5+"	           "+q5+"                "+p5+"	           Total              After-Discount");
             System.out.println(i6+"	           "+q6+"                "+p6+"	           Total              After-Discount");
             System.out.println(i7+"	           "+q7+"                "+p7+"	           Total              After-Discount");
             System.out.println(i8+"	           "+q8+"                "+p8+"	           Total              After-Discount");
             System.out.println(i9+"	           "+q9+"                "+p9+"	           Total              After-Discount");
             System.out.println(i10+"	           "+q10+"               "+p10+"	   Total              After-Discount");



  }
}



















































          


 

