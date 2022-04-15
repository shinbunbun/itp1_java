import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (Character.isAlphabetic(ch)) {
        if (Character.isLowerCase(ch)) {
          System.out.print(Character.toUpperCase(ch));
        } else {
          System.out.print(Character.toLowerCase(ch));
        }
      } else {
        System.out.print(s.charAt(i));
      }
    }
    System.out.println();
    sc.close();
  }
}
