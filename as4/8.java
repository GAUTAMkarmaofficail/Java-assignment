//8. WAP to print all armstrong number from 101 to 999
/*while(n!=0)
     { 
      rem=n%10;
      rev=rev+rem*rem*rem;
      n=n/10;
      }
if(temp==rev) 
System.out.println("armstron"); 
*/
class Main{
    public static void main(String args[]){  
    int j=101;
   while(j<=999)
   { 
   int n=j,rem=0,rev=0;
   
    while(n!=0)
     { 
      rem=n%10;
      rev=rev+rem*rem*rem;
      n=n/10;
      }
   if(j==rev)
   System.out.println("The armstrong btw (101-999)is "+rev);
  j++;
  }
 }
}
