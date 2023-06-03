//20. W.A.P to check whether a charachter is an alphabet or not.
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           System.out.println("Only for numeric value ");
           System.out.println("*************************************");
           System.out.println("Enter   charachter to check it is an alphabet or not.");
              char ch=sc.next().charAt(0);

if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
System.out.println("It is alphabat: "+ch);
else
System.out.println("It is not an alphabat: "+ch);
}
}
