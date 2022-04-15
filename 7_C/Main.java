import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt(), c = sc.nextInt();
    int map[][] = new int[r + 1][c + 1];
    for (int i = 0; i < r + 1; i++) {
      for (int j = 0; j < c; j++) {
        if (i != r) {
          map[i][j] = sc.nextInt();
          map[r][j] += map[i][j];
        }
        map[i][c] += map[i][j];
      }
    }
    sc.close();
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map[i].length; j++) {
        System.out.printf("%d", map[i][j]);
        if (j == map[i].length - 1)
          System.out.println();
        else
          System.out.print(" ");
      }
    }
  }
}
