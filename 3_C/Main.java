import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 10000; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      if (x == 0 && y == 0) {
        break;
      }
      if (x < y) {
        System.out.printf("%d %d\n", x, y);
      } else {
        System.out.printf("%d %d\n", y, x);
      }
    }
    sc.close();
  }
}
