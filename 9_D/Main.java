import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int q = sc.nextInt();
    for (int i = 0; i < q; i++) {
      String order = sc.next();
      int a = sc.nextInt(), b = sc.nextInt();
      // System.out.println(order + " " + a + " " + b);
      StringBuilder sb = new StringBuilder(str);
      switch (order) {
        case "print":
          System.out.println(sb.substring(a, b + 1));
          break;
        case "reverse":
          StringBuilder sb2 = new StringBuilder(sb.substring(a, b + 1));
          sb2.reverse();
          str = sb.substring(0, a) + sb2.toString() + sb.substring(b + 1);
          break;
        case "replace":
          String p = sc.next();
          // System.out.println(p);
          str = sb.replace(a, b + 1, p).toString();
          break;
        default:
          break;
      }
    }
    sc.close();
  }
}
