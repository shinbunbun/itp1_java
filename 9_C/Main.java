import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int taroPnt = 0, hanakoPnt = 0;
    for (int i = 0; i < n; i++) {
      String taro = sc.next(), hanako = sc.next();
      if (taro.compareTo(hanako) > 0) {
        taroPnt += 3;
      } else if (taro.compareTo(hanako) < 0) {
        hanakoPnt += 3;
      } else if (taro.compareTo(hanako) == 0) {
        taroPnt++;
        hanakoPnt++;
      }
    }
    sc.close();
    System.out.println(taroPnt + " " + hanakoPnt);
  }
}
