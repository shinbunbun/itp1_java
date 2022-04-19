import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int['z' - 'a' + 1];
    while (sc.hasNext()) {
      String str = sc.nextLine();
      for (int i = 0; i < str.length(); i++) {
        if (!Character.isAlphabetic(str.charAt(i)))
          continue;
        if (!Character.isLowerCase(str.charAt(i))) {
          arr[Character.toLowerCase(str.charAt(i)) - 'a']++;
        } else {
          arr[str.charAt(i) - 'a']++;
        }
      }
    }
    sc.close();
    for (int i = 0; i < 'z' - 'a' + 1; i++) {
      System.out.printf("%c : %d\n", (char) i + 'a', arr[i]);
    }
  }
}
