import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      String str = sc.next();
      // System.out.println(str);
      if (str.equals("-"))
        break;
      int m = sc.nextInt();
      // System.out.println(m);
      for (int i = 0; i < m; i++) {
        int h = sc.nextInt();
        // System.out.println(h);
        String str2 = str.substring(0, h);
        str = str.substring(h) + str2;
      }
      System.out.println(str);
    }
    sc.close();
  }
}
