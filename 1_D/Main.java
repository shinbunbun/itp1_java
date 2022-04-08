import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    sc.close();
    System.out.printf("%d:%d:%d\n", s / 3600, (s % 3600) / 60, s % 60);
  }
}
