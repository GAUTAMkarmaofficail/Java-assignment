
/*Login form
*/
import java.util.*;
import java.util.Scanner;

class TestMain {
  Scanner sc = new Scanner(System.in);
  private String name, email, pwd, cpwd, loginmail, loginpwd;

  public int c = 0;
//default constructor
  public TestMain(){}


  public void register() {
    System.out.println("-----------------------------------------------------------------------");

    // *****************************************

    //int invalidCount = 0;

    final int Min_Lowercase = 1;

    final int NUM_Digits = 2;

    final int Special = 1;

    int uppercaseCounter = 0;

    int digitCounter = 0;

    int specialCounter = 0;
    boolean flag = true;

    System.out.println("\t\t\tEnter your Email_Id");
    do {
      email = sc.nextLine();

      for (int i = 0; i < email.length(); i++) {
        char c = email.charAt(i);
        if (Character.isUpperCase(c))
          uppercaseCounter++;
        else if (Character.isDigit(c))
          digitCounter++;
        if (c == '@') {
          specialCounter++;
        }

        if (uppercaseCounter >= Min_Lowercase && specialCounter == 1 && digitCounter == 2 || digitCounter == 3|| digitCounter == 3|| digitCounter == 4 || digitCounter == 5) {
          System.out.println("Valid Email");
          flag = false;
          
          break;
        } else {

          flag = true;

        }
      }
      if (flag) {
        System.out.println("In_Valid Email");
        System.out.println("Re_Enter your Email");
      }
    } while (flag);
    // ****************************************

    int invalidCount1 = 0;

    final int MIN_Uppercase1 = 1;

    final int NUM_Digits1 = 2;

    final int Special1 = 1;

    int uppercaseCounter1 = 0;

    int digitCounter1 = 0;

    int specialCounter1 = 0;
    boolean flag1 = true;

    System.out.println("\t\t\tEnter your Password");
    do {
      pwd = sc.next();

      for (int i = 0; i < pwd.length(); i++) {
        char c = pwd.charAt(i);
        if (Character.isUpperCase(c))
          uppercaseCounter1++;
        else if (Character.isDigit(c))
          digitCounter1++;
        if (c == '$' || c == '#' || c == '?' || c == '!' || c == '_' || c == '=' || c == '%' || c == '@') {
          specialCounter1++;
        }

        if (uppercaseCounter1 >= MIN_Uppercase1 && specialCounter1 == 1 && digitCounter1 == 2 || digitCounter1 == 3
            || digitCounter1 == 4 || digitCounter1 == 5) {
          System.out.println("Valid Password");
          flag1 = false;
          break;
        } else {

          flag1 = true;

        }
      }
      if (flag1) {
        System.out.println("In_Valid Password");
        System.out.println("Re_Enter your Password");
      }
    } while (flag1);
    do {
      System.out.println("\t\t\tConform Password");
      cpwd = sc.next();

      if (pwd.equals(cpwd)) {
        System.out.println("\t\t\tRegistration Successfull");
        c++;
      } else {
        System.out.println("\t\t\tConform Password does't matched");
        System.out.println("\t\t\tReEnter Password ");
      }
    } while (c == 0);
    c--;
  }

  public void login() {
       
    do {
      System.out.println("\t\t\tEnter your Email Id");
      loginmail = sc.next();

      System.out.println("\t\t\tEnter your Password");
      loginpwd = sc.next();

      if (email.equals(loginmail)) {
        if (pwd.equals(loginpwd)) {
          System.out.println("\t\t\tLogin Successfull");
          c++;
        }
      }

      else {
        System.out.println("\t\t\tEmail Id and Password not matched");
        System.out.println("\t\t\tPlease Try Again");
        System.out.println("-----------------------------------------------------------------------");
      }
    } while (c == 0);

  }
}

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    TestMain obj = new TestMain();
    System.out.println("Press 1 for Redistration");
    System.out.println("Press 2 for Login");
    int reg = sc.nextInt();

    switch (reg) {
      case 1:
        obj.register();
        obj.login();
        break;
      case 2:
        obj.login();
        break;
      default:
        System.out.println("You Entered Wrong Choise");
    }
  }
}
