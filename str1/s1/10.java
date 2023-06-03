/*10) WAP to count the word whose first letter is  vowel.*/

class Main {

  public static void main(String args[]) {
        //String s1 = "aDear aStudent aYou ahave aneed ato awork ahard";
        String s1 = "aDear aStudent aYou ahave aneed ato awork ahard";
        String s[] = s1.split(" ");
       
        int count=0;
       
        for (int i=0;i<s.length;i++) 
            { 
              if(s[i].charAt(0)=='A'||s[i].charAt(0)=='I'||s[i].charAt(0)=='O'||s[i].charAt(0)=='U'||s[i].charAt(0)=='E'||s[i].charAt(0)=='a'||s[i].charAt(0)=='i'||s[i].charAt(0)=='o'||s[i].charAt(0)=='u'||s[i].charAt(0)=='e')
                count++;  
             
            }
        System.out.println(count);

    }
}
/*class TestMain{
    public static String wordWithMaximumLength(String s){
       String words[] = s.split(" ");
       int maxLength = words[0].length();
       String output = words[0];
       for(int i=1; i<words.length; i++){
          if(words[i].length() > maxLength){
            maxLength  = words[i].length();
            output = words[i];
          }          
       }  
       return output;
    }
    public static void main(String args[]){
        String input = "Dear Student ,You have need to work hard";
        String output = TestMain.wordWithMaximumLength(input);
        System.out.println(output);
    }
}*/
