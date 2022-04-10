import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    for (int i = 1; i <= n; i++) {
      int x = i;
      if (x % 3 == 0) {
        System.out.printf(" %d", i);
        continue;
      }
      while (true) {
        if (x % 10 == 3) {
          System.out.printf(" %d", i);
          break;
        }
        x /= 10;
        if (x == 0)
          break;
      }
    }
    System.out.println();
  }
}
