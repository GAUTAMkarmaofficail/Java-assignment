/*11*/
import java.util.Scanner;
class Main{
	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Length :");
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int x[][] = new int[n][m]; 
		
		int sum=0,sumo=0;
		
		
		
		for(int r = 0 ; r < x.length ; r++)
		{ 
		  System.out.println("Enter the "+r+1+"row Elements :");
		    for(int c=0; c<x[r].length;c++)
		    {	
			x[r][c] = sc.nextInt();
	            }
	            
	          System.out.println();
	        }
	        
	     for(int r = 0 ; r < x.length ; r++)
		{ //System.out.println("Enter the "+r+"row Elements :");
		    for(int c=0; c<x[r].length;c++)
		    {	
		      if(r==c || (r+c)==n-1) 
			System.out.print(" "+x[r][c]);
			
		     else 
		     System.out.print("  ");
		
	            }
	            
	          System.out.println();
	        }
	        }
	        }
