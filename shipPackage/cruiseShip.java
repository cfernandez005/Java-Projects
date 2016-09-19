//Assignment PC1001: Ship, CruiseShip, and CargoShip Classes
//Chris Fernandez
//Editor: Notepad++
//Compiler: javac
//Date: 2/8/15
//CS 3340 - Winter 2015

package ship;

public class cruiseShip extends ship
{
  private int passengerMax;
  
  public cruiseShip(String name, String year, int passengerMax)
  {
    super(name, year);
    this.passengerMax = passengerMax;
  }
  
  public final int getPassengerMax(){return passengerMax;}
  public final void setPassengerMax(int pM){passengerMax = pM;}
  
  @Override
  public void print()
  {
    System.out.printf("CruiseShip name: %s\nMax Passengers: %s\n", getName(), getYear());
  }
}
