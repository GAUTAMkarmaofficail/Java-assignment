/*11) Input name of a person and count how many vowels it contains. Use String class methods.*/
class Reverse {
    public static String reverse(String s) {
        String temp=s;
        String rev ="";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);

        }
      if(rev.equals(temp))
        return rev;
      else
        return "";

    }
}

class Main {
    public static void main(String args[]) {
          
       
       
        String s1 = "person";
        
    }
}


