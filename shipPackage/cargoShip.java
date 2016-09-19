//Assignment PC1001: Ship, CruiseShip, and CargoShip Classes
//Chris Fernandez
//Editor: Notepad++
//Compiler: javac
//Date: 2/8/15
//CS 3340 - Winter 2015

package ship;

public class cargoShip extends ship
{
  private int cargoCap;
  
  public cargoShip(String name, String year, int cargoCap)
  {
    super(name, year);
    this.cargoCap = cargoCap;
  }
  
  public final int getCargoCap(){return cargoCap;}
  public final void setCargoCap(int cC){cargoCap = cC;}
  
  @Override
  public void print()
  {
    System.out.printf("CargoShip name: %s\nCargo Capacity: %s tons\n", getName(), getYear());
  }
}
