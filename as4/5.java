//5. WAP to print all prime number from 101 to 199 int i=2,r=0;
 


class Main{
    public static void main(String args[]){  
    int i=2,r=0,n=101;
    while(n<=199)
  {
   if(n%i==0)
    {
     r=n/i;
     break;
   }
   else
  n++;
 }
   while(true)
   if(r==1)
      System.out.println(n);

  }
}
