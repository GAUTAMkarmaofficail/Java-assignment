/*13)WAP check if two Strings are anagrams of each other?
(Hint Anagram words: LISTEN - SILENT 
	             TRIANGLE - INTEGRAL)
*/
import java.util.Arrays;
class Main {
	public static void main(String[] args) {
		String x="Hello";
		String y="hello";
		x=x.toLowerCase();
		y=y.toLowerCase();
		char a[]=x.toCharArray();
		char b[]=y.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		Boolean result= Arrays.equals(a,b);
		if(result==true)
		System.out.println("Anagram");
                else
                System.out.println("not Anagram");	
      }
}


