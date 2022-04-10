import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[4][13];
    for (int i = 0; i < n; i++) {
      char c = sc.next().charAt(0);
      int num = sc.nextInt() - 1;
      switch (c) {
        case 'S':
          arr[0][num] = 1;
          break;
        case 'H':
          arr[1][num] = 1;
          break;
        case 'C':
          arr[2][num] = 1;
          break;
        case 'D':
          arr[3][num] = 1;
          break;
      }
    }
    sc.close();
    char[] suits = { 'S', 'H', 'C', 'D' };
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 13; j++) {
        if (arr[i][j] == 0) {
          System.out.printf("%c %d\n", suits[i], j + 1);
        }
      }
    }
  }
}
