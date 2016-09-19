//Assignment PC1001: Ship, CruiseShip, and CargoShip Classes
//Chris Fernandez
//Editor: Notepad++
//Compiler: javac
//Date: 2/8/15
//CS 3340 - Winter 2015

package ship;

import java.util.Scanner;

public class shipDriver
{
  public static void titleLines()
  {
    System.out.println("Assignment PC1001: Ship, CruiseShip, and CargoShip Classes");
    System.out.println("Author: Chris Fernandez");
    System.out.println("Editor: Notepad++");
    System.out.println("Compiler: javac");
    System.out.println("Date: 2/8/15\n\n");
  }
  
  public static void main(String[] args)
  {
    titleLines();
    ship yarg[] = {new ship("Mona Lisa", "1776"), new cruiseShip("The Black Pearl", "1750", 250), new cargoShip("Meal Gear!", "1998", 11111110)};
    
    for (int i = 0; i < 3; i++)
    {
      yarg[i].print();
      System.out.println();
  } }
}