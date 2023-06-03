/*14) WAP check if a String contains only digits?*/

class Main {
    public static void main(String args[]) {

        String p = "";
        char y[] = x.toCharArray();
        int size = y.length;
        int i = 0;
        while (i != size) {

            if (y[i] >= '0' && y[i] <= '9') {
                ++i;

            }

            else {
                System.out.println("Not an integer string");
                System.exit(0);

            }

        }
        System.out.println("integer string");
    }
}

