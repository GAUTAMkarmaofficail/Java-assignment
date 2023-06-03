/*26. Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.          Calculate percentage and grade according to following: 
	Percentage >= 90% : Grade A 
	Percentage >= 80% : Grade B 
	Percentage >= 70% : Grade C 
	Percentage >= 60% : Grade D 
	Percentage >= 40% : Grade E 
	Percentage < 40% : Grade F
*/
import java.util.Scanner;
   class Main{
	 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Entermarks of 1");
	 float a=sc.nextFloat();

	 System.out.println("Enter the mark of 2");
	 float b=sc.nextFloat();
	 
  System.out.println("Enter the mark of 3");

  float c=sc.nextFloat();
  System.out.println("Enter the mark of 4");
	 	 float d=sc.nextFloat();

System.out.println("Enter the mark of 5");
	 	 float e=sc.nextFloat();
	 	float result=0;

float total=(a+b+c+d+e);
float percentage =total/5;
if(percentage>=90)
{
   System.out.println(" Grade A");
}

else if(percentage>=80&&percentage<=90){
System.out.println(" Grade B");
}

else if(percentage>=70&&percentage<=80){
System.out.println(" Grade C");
}

else if(percentage>=60&&percentage<=70){
System.out.println(" Grade D");
}

else if(percentage>=50&&percentage<60){
System.out.println(" Grade E");
}

else{
System.out.println(" Grade F");

}



 System.out.println("The total Max is:"+total);
System.out.println("The percentage is:"+percentage);
	}
}
