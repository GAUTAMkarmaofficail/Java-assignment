//6. WAP to print the reverse of all number from 101 to 199

class Main{
    public static void main(String args[]){  
    int j=101;
   while(j<=199)
   { 
   int n=j,r=0;
   int s=0;
    while(n!=0)
   {
   r=n%10;
   s=s*10+r;
   n=n/10;
   }
   System.out.println("reverse of "+j+" is ="+s);
  j++;
  }
 }
}













