import java.util.Scanner;

class Dice implements Cloneable {
  int[] surfaces;

  Dice() {
    surfaces = new int[7];
  }

  void routate(String orders) {
    // System.out.println(orders + " " + orders.length());
    for (int i = 0; i < orders.length(); i++) {
      int[] newSurface = surfaces.clone();
      switch (orders.charAt(i)) {
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

  void turnRight() {
    int[] newSurfaces = surfaces.clone();
    newSurfaces[1] = surfaces[1];
    newSurfaces[2] = surfaces[3];
    newSurfaces[3] = surfaces[5];
    newSurfaces[4] = surfaces[2];
    newSurfaces[5] = surfaces[4];
    newSurfaces[6] = surfaces[6];
    surfaces = newSurfaces;
  }

  Dice[] createAllCase() {
    String[] orders = {"", "N", "N", "N", "E", "EE"};
    Dice[] res = new Dice[24];
    Dice tempDice = new Dice();
    tempDice.surfaces = this.surfaces.clone();
    int cnt = 0;
    for (int j = 0; j < orders.length; j++) {
      tempDice.routate(orders[j]);
      for (int j2 = 0; j2 < 4; j2++) {
        tempDice.turnRight();
        Dice diceCase = new Dice();
        diceCase.surfaces = tempDice.surfaces.clone();
        res[cnt++] = diceCase;
      }
    }
    return res;
  }

}


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Dice dice = new Dice();
    for (int i = 0; i < 6; i++) {
      dice.surfaces[i + 1] = sc.nextInt();
    }
    int q = sc.nextInt();
    Dice[] allCase = dice.createAllCase();
    for (int i = 0; i < q; i++) {
      int top = sc.nextInt();
      int front = sc.nextInt();
      for (int j = 0; j < allCase.length; j++) {
        if (allCase[j].surfaces[1] == top && allCase[j].surfaces[2] == front) {
          System.out.println(allCase[j].surfaces[3]);
          break;
        }
      }
    }
    sc.close();
  }
}
