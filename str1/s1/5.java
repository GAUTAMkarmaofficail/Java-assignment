/*5) Write a java program to reverse each word of String.
     Sample Input: “Java Is Plateform Independent”
     Output: “avaJ sI mrofetalP tnednepednI”
*/
class Reverse {
    public static String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);

        }
        return rev;

    }
}

class Main {
    public static void main(String args[]) {
        System.out.println("Before reverse");
        String s1 = "java is very simple";
        System.out.println(s1);
        System.out.println("After reverse");
        String s2[] = s1.split(" ");
        String output = "";
        for (String data : s2) {

            output = output + " " + Reverse.reverse(data);
        }
        System.out.print(output+" ");

    }
}
