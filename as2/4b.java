/*
4.A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
*/
import java.util.Scanner;
   class Main{
	 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Entermarks of English (0-100)");
	 float grade=sc.nextFloat();
         
	/* System.out.println("Enter the mark of Physic");
	 float b=sc.nextFloat();
	 
  System.out.println("Enter the mark of chemistry");

  float c=sc.nextFloat();
  System.out.println("Enter the mark of math");
	 	 float d=sc.nextFloat();

System.out.println("Enter the mark of 5");
	 	 float e=sc.nextFloat();*/
float total=0;

if(grade>=80)
{
   System.out.println(" ***********************Grade A***************************");
}

else if(grade>=60&&grade<=80){
 System.out.println(" ***********************Grade B***************************");
}

else if(grade>=50&&grade<=60){
 System.out.println(" ***********************Grade C***************************");
}

else if(grade>=45&&grade<=50){
 System.out.println(" ***********************Grade D***************************");
}

else if(grade>=26&&grade<45){
 System.out.println(" ***********************Grade E***************************");
}

else{
 System.out.println(" ***********************Grade F***************************");

}




	}
}
