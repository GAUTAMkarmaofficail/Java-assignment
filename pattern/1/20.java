class Main{
    public static void main(String args[]){
        
   int i,j,k;
 
   for(i=1;i<=5;i++)
  {for(k=5;k>i;k--)
     System.out.print(" ");
    
    for(j=1,k=1;k<=2*i-1;k++)
 
    {
     if(k<=i) 
       {
       System.out.print(j);
       j++;
      
      if(k==i)
       j=i;
    
   }
      else
     {  
     --j;
     System.out.print(j);
     }
   }
  System.out.println();


  }
 }
}
