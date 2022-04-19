import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String W = sc.nextLine();
    int cnt = 0;
    while (true) {
      String T = sc.next();
      if (T.equals("END_OF_TEXT"))
        break;
      T = T.toLowerCase();
      // System.out.println(T);
      for (int i = 0; i < T.length(); i++) {
        if (i + W.length() > T.length())
          break;
        // System.out.println(T.substring(i, i + W.length()));
        if (T.equals(W)) {
          cnt++;
        }
      }
    }
    sc.close();
    System.out.println(cnt);
  }
}
