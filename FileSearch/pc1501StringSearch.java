//Assignment PC1501: String Search
//Chris Fernandez
//Editor: Notepad++
//Compiler: javac
//Date: 3/19/15
//CS 3340 - Winter 2015

import java.util.Scanner;
import java.io.File;
import java.nio.file.Paths;

class pc1501StringSearch
{
  public static void titleLines()
  {
    System.out.println("Assignment PC1501: String Search");
    System.out.println("Author: Chris Fernandez");
    System.out.println("Editor: Notepad++");
    System.out.println("Compiler: javac");
    System.out.println("Date: 3/9/15\n\n");
  }
  
  public static void main(String[] args)
  {
    titleLines();
    Scanner input = new Scanner(System.in);
    String fileName = null;
    
    for (;;)
    {
      System.out.print("File name: ");
      fileName = input.nextLine();
      boolean fileCheck = new File(fileName).exists();
      if (fileCheck)
        break;
      System.out.println("\n::File does not exist under current directory::\n\n");
    }
    
    System.out.print("\nSearch: ");
    String search = input.nextLine();
    System.out.println("  ---------------------------------------------------------------------------");
    
    int result = 0;
    try
    {
      Scanner fileInput = new Scanner(Paths.get(fileName));
      while(fileInput.hasNext())
      {
        String line = fileInput.nextLine();
        if (line.matches(".*" + search + ".*"))
        {
          System.out.printf("  %s%n", line);
          result++;
    } }}
    catch(Exception e)     
    {
      e.printStackTrace();
      System.exit(1);
    }
    System.out.println("  ---------------------------------------------------------------------------");
    if (result == 1)
      System.out.printf("  %d occurrence found\n\n", result);
    else
      System.out.printf("  %d occurrences found\n\n", result);
  }
}
