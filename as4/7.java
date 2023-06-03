//7. WAP to print all palindrome number from 101 to 199

class Main{
    public static void main(String args[]){  
    int j=101;
   while(j<=999)
   { 
   int n=j,rem=0,rev=0;
   
    while(n!=0)
     { 
      rem=n%10;
      rev=rev*10+rem;
      n=n/10;
      }
   if(j==rev)
   System.out.println(rev);
  j++;
  }
 }
}

 








