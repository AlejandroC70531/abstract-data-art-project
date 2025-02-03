
/*
 * Creates a class representing each element in the rollercoasters array in DataScene.java
 */
public class Rollercoaster{
 /* 
  * Instance variables representing each data file to be used to create rollercoaster elements
  */
  private String name;
  private String country;
  private double height;
  private double speed;
  private double length;
  
/*
 * A no-argument constructor for a rollercoaster element with no data
 */
  public Rollercoaster(){
    name = "";
    country = "";
    height = 0.0;
    speed = 0.0;
    length = 0.0;
  }
/*
 * A parameterized constructor to create rollercoaster elements using their given data
 */
  public Rollercoaster(String name, String country, double height, double speed, double length){
  this.name = name;
  this.country = country;
  this.height = height;
  this.speed = speed;
  this.length = length;
 }
/*
 * Accessor methods used to access certain data for each rollercoaster element
 */
  public String getName(){
    return name;
  }
  
  public String getCountry(){
    return country;
  }

  public double getHeight(){
    return height;
  }

  public double getSpeed(){
    return speed;
  }

  public double getLength(){
    return length;
  }
  
/*
 * A toString() method that returns the name, country, park, and measurements for a certain rollercoaster element
 */
  public String toString(){
    return name + " is located in the country of " + country + " and it is " + height + " yards tall at its peak" + "\n" + "It goes up to "  + speed + " miles per hour" + "\n" + "And it is " + length + " feet long."; 
 }
}
