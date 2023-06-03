/*6 sum of array and print max array*/

//      

import java.util.Scanner;
class Main{
	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Length :");
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int x[][] = new int[n][m]; 
		
		int a=0,b=0,d=0,r;
		
		
		
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
	      {  
	        if(a>b && a>d)
	         
	        {System.out.println("Max Sum is "+a);
	        r=0;}
	        else if(b>d)
	        {System.out.println("Max Sum is  "+b);
	        r=1;}
	        else
	        {System.out.println("Max Sum is  "+d);  
	        r=2;} 
               }
          {
           for(int i=r;i<n;i++)
               {
            for(int j=0;j<m;j++)
             System.out.print(" "+x[i][j]);
            break;
                }
              
           }
	 }
	}








