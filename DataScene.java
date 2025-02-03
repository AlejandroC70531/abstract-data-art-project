import org.code.theater.*;

public class DataScene extends Scene {

private Rollercoaster[] rollercoasters; // An array of superfoods and their assorted information

/*
 * Initializes the files that will be used to provide the information for each food element
 */

public DataScene(String namesFile, String countriesFile, String heightsFile, String speedsFile, String lengthsFile){
  this.rollercoasters = createRollercoasters(namesFile, countriesFile, heightsFile, speedsFile, lengthsFile);
}
/*
 * Turns the files into the data that will be used, then starts creating the elements
 * in the Superfood.java class
 */
  public Rollercoaster[] createRollercoasters(String namesFile, String countriesFile, String heightsFile, String speedsFile, String lengthsFile) {
    String[] namesData = FileReader.toStringArray(namesFile);
    String[] countriesData = FileReader.toStringArray(countriesFile);
    double[] heightsData = FileReader.toDoubleArray(heightsFile);
    double[] speedsData = FileReader.toDoubleArray(speedsFile);
    double[] lengthsData = FileReader.toDoubleArray(lengthsFile);
    Rollercoaster[] newRollercoasters = new Rollercoaster[namesData.length];

    for (int i = 0; i < newRollercoasters.length; i++) {
      newRollercoasters[i] = new Rollercoaster(namesData[i], countriesData[i], heightsData[i], speedsData[i], lengthsData[i]);
    }
    return newRollercoasters;
  }
  /*
   * Returns a certain rollercoaster element given its index
   */
  public Rollercoaster getRollercoaster(int position) {
    return rollercoasters[position];
  }
 
  /*
   * Rollercoasters are assorted into lists based off their heights
   * and different lists are returned based off the requested heights
   */
  public Rollercoaster[] analyzeHeights(double desiredHeight){
    int shortCount = 0;
    int averageHeightCount = 0;
    int tallCount = 0;
    for(int i = 0; i < rollercoasters.length; i++){
      if(rollercoasters[i].getHeight() >= 60.0){
        tallCount++;
      } else if (rollercoasters[i].getHeight() < 60.0 && rollercoasters[i].getHeight() >= 30.0){
        averageHeightCount++;
      } else {
        shortCount++;
    }
  }
    Rollercoaster[] shortRollercoasters = new Rollercoaster[shortCount];
    Rollercoaster[] averageHeightRollercoasters = new Rollercoaster[averageHeightCount];
    Rollercoaster[] tallRollercoasters = new Rollercoaster[tallCount];
    int shortIndex = 0;
    int averageHeightIndex = 0;
    int tallIndex = 0;
    for(int i = 0; i < rollercoasters.length; i++){
      if(rollercoasters[i].getHeight() >= 60.0){
        tallRollercoasters[tallIndex] = rollercoasters[i];
        tallIndex++;
      } else if (rollercoasters[i].getHeight() < 60.0 && rollercoasters[i].getHeight() >= 30.0){
        averageHeightRollercoasters[averageHeightIndex] = rollercoasters[i];
        averageHeightIndex++;
      } else {
        shortRollercoasters[shortIndex] = rollercoasters[i];
        shortIndex++;
      }
   }
    if(desiredHeight >= 60.0){
      return shortRollercoasters;
    } else if(desiredHeight < 60.0 && desiredHeight >= 30.0){
      return averageHeightRollercoasters;
    } else {
      return tallRollercoasters;
    }
 }
    /*
   * Rollercoasters are assorted into lists based off their speeds
   * and different lists are returned based off the requested speed
   */
    public Rollercoaster[] analyzeSpeeds(double desiredSpeed){
    int slowCount = 0;
    int averageSpeedCount = 0;
    int fastCount = 0;
    for(int i = 0; i < rollercoasters.length; i++){
      if(rollercoasters[i].getSpeed() < 40.0){
        slowCount++;
      } else if (rollercoasters[i].getSpeed() >= 40.0 && rollercoasters[i].getSpeed() <= 80.0){
        averageSpeedCount++;
      } else {
        fastCount++;
    }
  }
    Rollercoaster[] slowRollercoasters = new Rollercoaster[slowCount];
    Rollercoaster[] averageSpeedRollercoasters = new Rollercoaster[averageSpeedCount];
    Rollercoaster[] fastRollercoasters = new Rollercoaster[fastCount];
    int slowIndex = 0;
    int averageSpeedIndex = 0;
    int fastIndex = 0;
    for(int i = 0; i < rollercoasters.length; i++){
      if(rollercoasters[i].getSpeed() < 40.0){
        slowRollercoasters[averageSpeedIndex] = rollercoasters[i];
        slowIndex++;
      } else if (rollercoasters[i].getSpeed() >= 40.0 && rollercoasters[i].getSpeed() <= 80.0){
        averageSpeedRollercoasters[averageSpeedIndex] = rollercoasters[i];
        averageSpeedIndex++;
      } else {
        fastRollercoasters[fastIndex] = rollercoasters[i];
        fastIndex++;
      }
   }
    if(desiredSpeed < 40.0){
      return slowRollercoasters;
    } else if(desiredSpeed >= 40.0 && desiredSpeed <= 80.0){
      return averageSpeedRollercoasters;
    } else {
      return fastRollercoasters;
    }
 }
  /*
   * Rollercoasters are assorted into lists based off their lengths
   * and different lists are returned based off the requested length
   */
    public Rollercoaster[] analyzeLengths(double desiredLength){
    int briefCount = 0;
    int averageLengthCount = 0;
    int longCount = 0;
    for(int i = 0; i < rollercoasters.length; i++){
      if(rollercoasters[i].getLength() < 700){
        briefCount++;
      } else if (rollercoasters[i].getLength() >= 700 && rollercoasters[i].getLength() < 1100){
        averageLengthCount++;
      } else {
        longCount++;
    }
  }
    Rollercoaster[] briefRollercoasters = new Rollercoaster[briefCount];
    Rollercoaster[] averageLengthRollercoasters = new Rollercoaster[averageLengthCount];
    Rollercoaster[] longRollercoasters = new Rollercoaster[longCount];
    int briefIndex = 0;
    int averageLengthIndex = 0;
    int longIndex = 0;
    for(int i = 0; i < rollercoasters.length; i++){
      if(rollercoasters[i].getLength() < 700){
        briefRollercoasters[briefIndex] = rollercoasters[i];
        briefIndex++;
      } else if (rollercoasters[i].getLength() >= 700 && rollercoasters[i].getLength() < 1100){
        averageLengthRollercoasters[averageLengthIndex] = rollercoasters[i];
        averageLengthIndex++;
      } else {
        longRollercoasters[longIndex] = rollercoasters[i];
        longIndex++;
      }
   }
    if(desiredLength < 700){
      return briefRollercoasters;
    } else if(desiredLength >= 700 && desiredLength < 1100){
      return averageLengthRollercoasters;
    } else {
      return longRollercoasters;
    }
  }
/*
 * Draws the scene where the chosen rollercoasters is presented along with its stats
 * which are compared with similar coasters and the differences are displayed
 */
 public void drawScene(){
   Rollercoaster randomCoaster = rollercoasters[(int) (Math.random() * 257)];
   Rollercoaster[] chosenHeightRollercoasters = analyzeHeights(randomCoaster.getHeight());
   Rollercoaster[] chosenSpeedRollercoasters = analyzeHeights(randomCoaster.getSpeed());
   Rollercoaster[] chosenLengthRollercoasters = analyzeHeights(randomCoaster.getLength());
   Rollercoaster randomSimilarHeightCoaster = chosenHeightRollercoasters[(int) Math.random() * chosenHeightRollercoasters.length];
   Rollercoaster randomSimilarSpeedCoaster = chosenSpeedRollercoasters[(int) Math.random() * chosenSpeedRollercoasters.length];
   Rollercoaster randomSimilarLengthCoaster = chosenLengthRollercoasters[(int) Math.random() * chosenLengthRollercoasters.length];
   String heightStatement = randomCoaster.getName() + " height: " + randomCoaster.getHeight() + " feet. Similar coaster: " + randomSimilarHeightCoaster.getName() + ". Difference: " + Math.abs(Math.max(randomCoaster.getHeight(), randomSimilarHeightCoaster.getHeight()) - Math.min(randomCoaster.getHeight(), randomSimilarHeightCoaster.getHeight()));
   String speedStatement = randomCoaster.getName() + " speed: " + randomCoaster.getSpeed() + " mph. Similar coaster: " + randomSimilarSpeedCoaster.getName() + ". Difference: " + Math.abs(Math.max(randomCoaster.getSpeed(), randomSimilarHeightCoaster.getSpeed()) - Math.min(randomCoaster.getSpeed(), randomSimilarHeightCoaster.getSpeed()));
   String lengthStatement = randomCoaster.getName() + " length: " + randomCoaster.getLength() + " tracks. Similar coaster: " + randomSimilarLengthCoaster.getName() + ". Difference: " + Math.abs(Math.max(randomCoaster.getLength(), randomSimilarHeightCoaster.getLength()) - Math.min(randomCoaster.getLength(), randomSimilarHeightCoaster.getLength()));
   
   clear("blue");
   setTextHeight(28);
   setTextColor("red");
   drawText("Let's learn about " + randomCoaster.getName() + "!", 10, 50);
   drawImage("rollercoaster.png", 150, 100, 100);
   pause(3);
   setTextHeight(10);
   setTextColor("black");
   playMusic();
   drawText(heightStatement, 0, (int) (Math.random() * 200) + 200);
   pause(5);
   playMusic();
   drawText(speedStatement, 0, (int) (Math.random() * 200) + 200);
   pause(5);
   playMusic();
   drawText(lengthStatement, 0, (int) (Math.random() * 200) + 200);
   pause(10);
   clear("white");
  setTextHeight(30);
   drawText("Thanks for watching!", 50, 150);
   playLongMusic();
   
 }
 public void playMusic(){
   int[] notes = {62, 66, 68, 70, 72};
   for(int i = 0; i < notes.length; i++){
     playNoteAndPause(notes[i], 0.2);
   }
 }
 public void playLongMusic() {
    int[] notes = {50, 55, 60, 65, 70, 75, 80, 75, 70, 65, 60, 55, 50};

    for (int i = 0; i < 5; i++) {
      for (int index = 0; index < notes.length; index++) {
        playNoteAndPause(notes[index], 0.2);
      }
    }
  }
}  
