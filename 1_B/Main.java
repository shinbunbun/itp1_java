import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    sc.close();
    System.out.println((int) Math.pow(x, 3));
  }
}
