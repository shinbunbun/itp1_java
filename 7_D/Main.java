import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), m = sc.nextInt(), l = sc.nextInt();
    int[][] A = new int[n][m];
    int[][] B = new int[m][l];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        A[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < l; j++) {
        B[i][j] = sc.nextInt();
      }
    }
    long[][] C = new long[n][l];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < l; j++) {
        for (int k = 0; k < m; k++) {
          C[i][j] += A[i][k] * B[k][j];
        }
      }
    }
    for (int i = 0; i < C.length; i++) {
      for (int j = 0; j < C[i].length; j++) {
        System.out.printf("%d", C[i][j]);
        if (j != C[i].length - 1) {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
