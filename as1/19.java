/* 19. W.A.P to check whether the traingle is equilateral, scalene, or isosceles.
/ Hint: - Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides of equal length. 
Equilateral triangle: In geometry, an equilateral triangle is a triangle in which all three sides are equal.
 Scalene triangle: A scalene triangle is a triangle that has three unequal sides. 
*/
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           System.out.println("Only for value ");
           System.out.println("*************************************");
           
           System.out.println("Enter the lenght,brieth,height  ");
           float l=sc.nextFloat();
           float b=sc.nextFloat();
           float h=sc.nextFloat();
if(l==b&&l==h)        
     {
System.out.println("equilateral triangle ");

} 
else if ((l==b||l==h)||(h==b))
{
System.out.println(" isosceles triangle ");
}

else
System.out.println("  scalene triangle ");
}
} 
