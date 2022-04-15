import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), m = sc.nextInt();

    int[][] mat = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        mat[i][j] = sc.nextInt();
      }
    }

    int[] vec = new int[m];
    for (int i = 0; i < m; i++) {
      vec[i] = sc.nextInt();
    }

    sc.close();

    int[] res = new int[n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        res[i] += mat[i][j] * vec[j];
      }
    }

    for (int i = 0; i < n; i++) {
      System.out.println(res[i]);
    }

  }
}
