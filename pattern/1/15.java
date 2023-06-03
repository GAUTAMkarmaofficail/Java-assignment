/*15.
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
0 1 0 1 0 1
1 0 1 0 1 0 1
0 1 0 1 0 1 0 1




*/
class Main{
    public static void main(String args[]){     
     
int j,i,k=0,c=1;
    
    for(i=1;i<=8;i++)
     {

       
        {
         for(j=1;j<=i;j++)
        
               { 
                if((i+j)%2==0)
             System.out.print(" "+c);
                 else
             System.out.print(" "+k);
               }
            System.out.println();
       
       }
      
     
    }
  }
}
