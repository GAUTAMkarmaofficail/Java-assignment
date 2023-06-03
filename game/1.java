import java.util.Scanner;
import java.util.Random;
class Main{
public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
public static final String A= "\033[0;33m";
 public static final String RESET = "\033[0m";
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random  rm=new Random();
  int a,b,d,t,a1=0,b1=0;
  a=10000;
   b=10000;
  for(int i=1;i<6;i++)
{  
 System.out.println( "round "+(i));
   for(int j=1;j<2;j++)
   {
    for(j=1;j<2;j++){
     System.out.println("A Enter your money");
       a1=sc.nextInt(); 
      if(a1<100||a1>1000)
        { j--;
        System.out.println(" re-enter  your money A ");
         continue;
       }
   }
   for( j=1;j<2;j++){
    System.out.println("B Enter your money");
       b1=sc.nextInt();
      if(b1<100||b1>1000)
      {
         j--;
       System.out.println(" re-enter  your money B ");
         continue;
       }
}
    System.out.println(); 
    System.out.println("Bett is ->");
    System.out.println(); 
    int random1=rm.nextInt(52);
    int random2=rm.nextInt(52);
     System.out.println("\033[0;33m|-----------------------------------------------|");
     System.out.println("|\t TIGER A \t|\tDRAGUN B \t|");
     System.out.println("|-----------------------------------------------|");
     
    // System.out.println("|\t    "+random1+"\t\t|\t    "+random2+"\t        |");
   System.out.print("|\t    "+random1+"\t\t|");
 try
      {
        
        Thread.sleep(2000);   
          System.out.println("\t    "+random2+"\t\t|");
      }
      catch(InterruptedException ex)
      {
          ex.printStackTrace();
      }

    
     System.out.println("|-----------------------------------------------|\033[0m");
    if(random1>random2)
   {
   System.out.println("\t\t  ***\u001B[41m A won \033[0m ***");
  a=a+(a1*2);
  b=b-b1;
    }
  else if(random1<random2)
        {
       System.out.println("\t\t  ***\u001B[41m B won \033[0m ***");
       b=b+(b1*2);
a=a-a1;
       }
  else
     System.out.println("\t\t  ***\u001B[41m  TIE  \033[0m ***");
     break;
 
   }
 System.out.println();
  }
System.out.println("After all round");
if(a>b)
{
  System.out.println(" TIGER A won :"+a);
//System.out.println("B won :"+b);
}
else if(a<b){
// System.out.println("A won :"+a);
  System.out.println("GIRAFF B won :"+b);
}
else
 System.out.println(" Tie ");

 }
}
