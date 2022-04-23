import java.util.Arrays;
import java.util.Scanner;

class Dice implements Cloneable {
  int[] surfaces;

  Dice() {
    surfaces = new int[7];
  }

  void routate(String orders) {
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

  private Dice[] createAllCases() {
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

  private Boolean compareDice(Dice dice) {
    if (Arrays.equals(surfaces, dice.surfaces))
      return true;
    return false;
  }

  Boolean isSameDice(Dice dice) {
    Dice[] diceCases = createAllCases();
    for (int i = 0; i < diceCases.length; i++) {
      if (dice.compareDice(diceCases[i])) {
        return true;
      }
    }
    return false;
  }

}


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Dice[] inputDices = new Dice[n];
    for (int i = 0; i < n; i++) {
      inputDices[i] = new Dice();
      for (int j = 0; j < 6; j++) {
        inputDices[i].surfaces[j + 1] = sc.nextInt();
      }
    }
    sc.close();
    for (int i = 0; i < inputDices.length; i++) {
      for (int j = i + 1; j < inputDices.length; j++) {
        if (inputDices[i].isSameDice(inputDices[j])) {
          System.out.println("No");
          return;
        }
      }
    }
    System.out.println("Yes");
  }
}
