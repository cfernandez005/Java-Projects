//Assignment PC1001: Ship, CruiseShip, and CargoShip Classes
//Chris Fernandez
//Editor: Notepad++
//Compiler: javac
//Date: 2/8/15
//CS 3340 - Winter 2015

package ship;

public class ship
{
  private String name, year;
  
  public ship(String name, String year)
  {
    this.name = name;
    this.year = year;
  }
  
  public final String getName(){return name;}
  public final String getYear(){return year;}
  public final void setName(String n){name = n;}
  public final void setYear(String y){year = y;}
  
  public void print()
  {
    System.out.printf("Ship name: %s\nBuilt: %s\n", name, year);
  }
}
