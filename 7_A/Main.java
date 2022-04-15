import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char res[] = new char[51];
    int i = 0;
    while (true) {
      int m = sc.nextInt(), f = sc.nextInt(), r = sc.nextInt();
      int score = m + f;
      if (m == -1 && f == -1 && r == -1)
        break;
      if (m == -1 || f == -1)
        res[i] = 'F';
      else if (score >= 80)
        res[i] = 'A';
      else if (score >= 65)
        res[i] = 'B';
      else if (score >= 50)
        res[i] = 'C';
      else if (score >= 30) {
        res[i] = 'D';
        if (r >= 50)
          res[i] = 'C';
      } else
        res[i] = 'F';
      i++;
    }
    res[i] = 'Z';
    sc.close();
    for (char c : res) {
      if (c == 'Z')
        break;
      System.out.println(c);
    }
  }
}
