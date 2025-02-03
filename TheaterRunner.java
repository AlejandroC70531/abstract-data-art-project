import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {
DataScene rollercoasterScene = new DataScene("names.txt", "countries.txt", "heights.txt", "speeds.txt", "lengths.txt");
    rollercoasterScene.drawScene();
    Theater.playScenes(rollercoasterScene);
  }
}
