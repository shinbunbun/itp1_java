import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    for (int i = 0; i < n; i++) {
      System.out.printf("%d", arr[n - i - 1]);
      if (i != n - 1)
        System.out.print(" ");
    }
    System.out.println();
  }
}
