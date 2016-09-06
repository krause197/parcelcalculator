import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class app {
  public static void main(String[] args) {
    Console console = System.console();

    int height = Integer.parseInt(console.readLine("What is the height of the parcel in inches?"));
    int width = Integer.parseInt(console.readLine("What is the width of the parcel in inches?"));
    int length = Integer.parseInt(console.readLine("What is the length of the parcel in inches?"));
    int weight = Integer.parseInt(console.readLine("What is the weight of the parcel in pounds?"));
    int distance = Integer.parseInt(console.readLine("How far away is the destination of the parcel in miles?"));
    int speed = Integer.parseInt(console.readLine("How quickly would you like your parcel delivered? Enter 1 for regular shipping, 2 for expedited shipping, 3 for next day air."));

    Parcel parcel1 = new Parcel(height, width, length, weight, distance, speed);
    Parcel.parcelVolume(height, width, length);
    Parcel.costToShip(weight, distance, speed);
  }
}
