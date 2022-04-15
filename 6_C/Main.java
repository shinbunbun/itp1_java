import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][][] residents = new int[4][3][10];
    for (int i = 0; i < n; i++) {
      int b = sc.nextInt();
      int f = sc.nextInt();
      int r = sc.nextInt();
      int v = sc.nextInt();
      residents[b - 1][f - 1][r - 1] += v;
    }
    sc.close();

    for (int i = 0; i < residents.length; i++) {
      for (int j = 0; j < residents[i].length; j++) {
        for (int k = 0; k < residents[i][j].length; k++) {
          System.out.printf(" %d", residents[i][j][k]);
        }
        if (residents[i][j].length - 1 != j) {
          System.out.println();
        }
      }
      if (i != residents.length - 1) {
        System.out.println("####################");
      }
    }
  }
}
