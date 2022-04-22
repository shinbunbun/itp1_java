import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble(), b = sc.nextDouble(), C = sc.nextDouble();
    sc.close();
    double radC = C * Math.PI / 180;
    double S = a * b * Math.sin(radC) / 2;
    System.out.println(S);
    double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(radC));
    double L = a + b + c;
    System.out.println(L);
    double h = 2 * S / a;
    System.out.println(h);
  }
}
