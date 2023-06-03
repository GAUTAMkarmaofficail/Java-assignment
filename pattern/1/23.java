/*



    *
   * *
  * * * 
 * * * *
* * * * * 
 * * * *
  * * *
   * *
    * 

        
*/
class Main{
    public static void main(String args[]){     
     
int i,j;
     //for(i=1;i<=9;i++) try for it in future for clarification
 for(i=5;i>=1;i--){
         for(j=1;j<=11;j++)
          {         
            if(i<j&&j<=(11-i))
             System.out.print("*");
            else
             System.out.print(" ");
          }
      System.out.println();
    }

    for(i=1;i<=5;i++){
         for(j=1;j<=11;j++)
          {         
            if(j>i&&j<=11-i)
             System.out.print("*");
            else
             System.out.print(" ");
          }
      System.out.println();
    }

    

  }
}
