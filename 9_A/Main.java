import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    sc.close();
    for (int i = 0; i < str1.length(); i++) {
      if (str1.charAt(i) != str2.charAt(0))
        continue;
      Boolean flag = true;
      for (int j = 0; j < str2.length(); j++) {
        // System.out.printf("%c", str1.charAt((i + j) % (str1.length() - 1)));
        if (str1.charAt((i + j) % (str1.length())) != str2.charAt(j)) {
          flag = false;
          break;
        }
      }
      // System.out.println();
      if (flag) {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}
