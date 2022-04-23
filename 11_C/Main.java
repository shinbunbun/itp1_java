import java.util.Arrays;
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

  Dice[] createAllCases() {
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
    Dice dice1 = new Dice(), dice2 = new Dice();
    for (int i = 1; i < 7; i++) {
      dice1.surfaces[i] = sc.nextInt();
    }
    for (int i = 1; i < 7; i++) {
      dice2.surfaces[i] = sc.nextInt();
    }
    sc.close();
    Dice[] dice1Cases = dice1.createAllCases();
    // System.out.println(Arrays.toString(dice2.surfaces));
    for (int i = 0; i < dice1Cases.length; i++) {
      // System.out.println(Arrays.toString(dice1Cases[i].surfaces));
      if (Arrays.equals(dice1Cases[i].surfaces, dice2.surfaces)) {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}
