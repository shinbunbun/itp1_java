import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max = -1000001, min = 1000001;
    long sum = 0;
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      sum += a;
      if (a > max)
        max = a;
      if (a < min)
        min = a;
    }
    sc.close();
    System.out.printf("%d %d %d\n", min, max, sum);
  }
}
