import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      String s = sc.nextLine();
      if (s.charAt(0) == '0')
        break;
      int sum = 0;
      for (int i = 0; i < s.length(); i++)
        sum += Character.getNumericValue(s.charAt(i));
      System.out.println(sum);
    }
    sc.close();
  }
}
