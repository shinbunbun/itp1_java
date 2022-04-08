import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 20000; i++) {
      int a = sc.nextInt();
      char op = sc.next().charAt(0);
      int b = sc.nextInt();
      if (op == '?') {
        break;
      }
      if (op == '+') {
        System.out.println(a + b);
      } else if (op == '-') {
        System.out.println(a - b);
      } else if (op == '*') {
        System.out.println(a * b);
      } else if (op == '/') {
        System.out.println(a / b);
      }
    }
    sc.close();
  }
}
