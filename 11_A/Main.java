import java.util.Scanner;

class Dice {
  int[] surfaces;

  Dice() {
    surfaces = new int[7];
  }

  void routate(char order) {
    int[] newSurface = surfaces.clone();
    switch (order) {
      case 'N':
        newSurface[1] = surfaces[2];
        newSurface[2] = surfaces[6];
        newSurface[6] = surfaces[5];
        newSurface[5] = surfaces[1];
        break;
      case 'E':
        newSurface[1] = surfaces[4];
        newSurface[4] = surfaces[6];
        newSurface[6] = surfaces[3];
        newSurface[3] = surfaces[1];
        break;
      case 'S':
        newSurface[1] = surfaces[5];
        newSurface[5] = surfaces[6];
        newSurface[6] = surfaces[2];
        newSurface[2] = surfaces[1];
        break;
      case 'W':
        newSurface[1] = surfaces[3];
        newSurface[3] = surfaces[6];
        newSurface[6] = surfaces[4];
        newSurface[4] = surfaces[1];
        break;

      default:
        break;
    }
    surfaces = newSurface;
  }
}


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Dice dice = new Dice();
    for (int i = 0; i < 6; i++) {
      dice.surfaces[i + 1] = sc.nextInt();
    }
    String orders = sc.next();
    sc.close();
    for (int i = 0; i < orders.length(); i++) {
      char order = orders.charAt(i);
      dice.routate(order);
    }
    System.out.println(dice.surfaces[1]);
  }
}
