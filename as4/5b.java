//5. WAP to print all prime number from 101 to 199

class Main{
    public static void main(String args[]){  
    int j=101;
   while(j<=199)
   { 
   int n=j,i=2; 
   while(i<=n/2)
   {
   if(n%i==0)
   break;
   i++;
   }
  if(i>n/2)
  System.out.println("prime btw(101-199)is:"+n);
  j++;
  }
 }
}













