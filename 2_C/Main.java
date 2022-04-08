import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int t = a;
    if (a > b) {
      a = b;
      b = t;
    }
    int c = sc.nextInt();
    sc.close();
    if (a > c) {
      t = a;
      a = c;
      c = b;
      b = t;
    } else if (b > c) {
      t = b;
      b = c;
      c = t;
    }
    System.out.printf("%d %d %d\n", a, b, c);
  }
}
