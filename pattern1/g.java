/*

G

*/
class Main{
  public static void main(String args[]){
  int i,j,space;
  for(i=1;i<=5;i++){
  
   for(j=1;j<=6;j++)
    
    if(j==1&&(i>1&&i<5)|| i==1&&(j>1&&j<5)|| i==5&&(j>1&&j<5)|| i==3&&j>2|| j==6&&i>2 ||j==4&&i==4)
    System.out.print("* ");
    else 
    System.out.print("  ");
    
    System.out.println();
    
    
      }
  
  
  }
}
