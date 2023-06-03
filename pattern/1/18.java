/*18.
10001
01010
00100
01010
10001

*/
class Main{
    public static void main(String args[]){     
     
int j,i,k=1,c=0;
    
    for(i=1;i<=5;i++)
     {

       
        {
         for(j=1;j<=5;j++)
        
               { 
                  if(j==6-i||j==i)
             System.out.print(" "+k);
                 else
             System.out.print(" "+c);
               }
            System.out.println();
       
       }
      
     
    }
  }
}
