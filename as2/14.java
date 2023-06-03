/*14.Write a program to accept percantage from the user and
display grade according to the following criteria
  Marks	  		Grade
  > 90       		 A
  >80 and <=90		 B
  >=60 and <=80		 C
  below 60		 D		  
*/
import java.util.Scanner;
   class Main{
	 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the mark");
	 float grade=sc.nextFloat();
     
          float total=0;

            if(grade>=90){
                System.out.println(" ***********************Grade A***************************");
               }

            else if(grade>=80&&grade<=90){
                System.out.println(" ***********************Grade B***************************");
               }

            else if(grade>=60&&grade<=80){
                System.out.println(" ***********************Grade C***************************");
               }



            else if(grade<60){
                System.out.println(" ***********************Grade d***************************");
               }

            else{
                System.out.println(" ***********************Invalid input*********************"); 
               }




	
    }

}
