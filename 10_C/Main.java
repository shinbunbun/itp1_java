import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      int n = sc.nextInt();
      if (n == 0)
        break;
      double sum = 0;
      double sqrSum = 0;
      for (int i = 0; i < n; i++) {
        int s = sc.nextInt();
        sum += s;
        sqrSum += s * s;
      }
      double ave = sum / n;
      double sqrAve = sqrSum / n;
      double var = sqrAve - ave * ave;
      double std = Math.sqrt(var);
      System.out.println(std);
    }
    sc.close();
  }
}
