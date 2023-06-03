/*9 interchange max and min*/


  

import java.util.Scanner;
class Main{
	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Length :");
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int x[][] = new int[n][m]; 
		
		int a=0,b=0,d=0;
		
		
		
		for(int i = 0 ; i < x.length ; i++)
		{ System.out.println("Enter the "+(i+1)+"row Elements :");
		    for(int j=0; j<x[i].length;j++)
		    {	
			x[i][j] = sc.nextInt();
	            }
	            
	          System.out.println();
	        }
	        
	   for(int i = 0 ; i < x.length ; i++)
		{ //System.out.println("Enter the "+r+"row Elements :");
		    for(int j=0; j<x[i].length;j++)
		    {	
		    if(i==0)
		      a=a+x[0][j];
		    
		    if(i==1)
		      b=b+x[1][j];
		      
		    if(i==2)
		      d=d+x[2][j];
		      
		
	            }
	            
	          System.out.println();
	        }
	        System.out.println("row1 Sum is  "+a);
	        System.out.println("row2 Sum is  "+b);
	        System.out.println("row3 Sum is  "+d);
	         System.out.println("**************min************");
	        if(a<b && a<d)
	         
	        {
                 System.out.println("min Sum is "+a);
	      
                 for(int i = 0 ; i < 1 ; i++)
		{ 
		    for(int j=0; j<3;j++)
                   System.out.print(" "+x[i][j]);  
                   
                }
           }
	        else if(b<d)
	        {System.out.println("Min Sum is  "+b);
	    
                  for(int i = 0 ; i < 1 ; i++)
		{ 
		    for(int j=0; j<3;j++)
                   System.out.print(" "+x[i][j]);
                   
                }
             }
	        else
	        {
                System.out.println("Min Sum is  "+d); 
               
                 //for(int i = 0 ; i < 1 ; i++)
		//{ 
		   // for(int j=0; j<3;j++)
                  //  System.out.print(" "+x[i][j]);
                  // 
                //}
                 }
  System.out.println();
                 System.out.println("**************max************");
                if(a>b && a>d)
	        { 
	        System.out.println("max Sum is "+a);
                    //for(int i = 0 ; i < 1 ; i++)
		//{ 
		    //for(int j=0; j<3;j++)
                    //System.out.print(" "+x[i][j]);    
                   
                }//}
	        
	        else if(b>d)
               {
	        System.out.println("max Sum is  "+b);
                }
	        
	        else
                {
	        System.out.println("max Sum is  "+d);   
                    // for(int i = 0 ; i < 1 ; i++)
		//{ 
		  //  for(int j=0; j<3;j++)
                  // System.out.print(" "+x[i][j]);
                   
               // }
	        
	     }
	}
}
