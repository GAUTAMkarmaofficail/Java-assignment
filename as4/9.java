/*9. WAP in C to display the n terms of harmonic series and
   their sum
   1 + 1/2 + 1/3 + 1/4 + 1/5 ... 1/n terms
*/
import java.util.Scanner;
class Main{
    public static void main(String args[]){     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number to display the n terms of harmonic series");
      int n=sc.nextInt();
   float i=1,sum=0;
   while(i<=n)
  {
 int z=1;
 //z1=z/i;
 sum=sum+(z/i);
 i++;

 }

 System.out.println(sum);
 }
}
