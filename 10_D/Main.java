import java.util.Scanner;

class MinkowskiDistance {
  int n;
  int arrx[];
  int arry[];

  MinkowskiDistance(int n) {
    this.n = n;
    arrx = new int[n];
    arry = new int[n];
  }

  double Calc(double p) {
    if (p == Double.POSITIVE_INFINITY)
      return CalcChebyshev();
    long sum = 0;
    for (int i = 0; i < n; i++) {
      sum += Math.pow(Math.abs(arrx[i] - arry[i]), p);
    }
    return Math.pow(sum, 1.0 / p);
  }

  private double CalcChebyshev() {
    double max = -1;
    for (int i = 0; i < n; i++) {
      max = Math.max(max, Math.abs(arrx[i] - arry[i]));
    }
    return max;
  }
}


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MinkowskiDistance md = new MinkowskiDistance(sc.nextInt());
    for (int i = 0; i < md.n; i++) {
      md.arrx[i] = sc.nextInt();
    }
    for (int i = 0; i < md.n; i++) {
      md.arry[i] = sc.nextInt();
    }
    sc.close();
    System.out.println(md.Calc(1));
    System.out.println(md.Calc(2));
    System.out.println(md.Calc(3));
    System.out.println(md.Calc(Double.POSITIVE_INFINITY));
  }
}
