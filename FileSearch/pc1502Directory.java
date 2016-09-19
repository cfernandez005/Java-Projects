//Assignment PC1502: List Contents of Directory
//Chris Fernandez
//Editor: Notepad++
//Compiler: javac
//Date: 3/19/15
//CS 3340 - Winter 2015

import java.util.Scanner;
import java.io.File;
import java.util.Date;

class pc1502Directory
{
  public static void titleLines()
  {
    System.out.println("Assignment PC1502: List Contents of Directory");
    System.out.println("Author: Chris Fernandez");
    System.out.println("Editor: Notepad++");
    System.out.println("Compiler: javac");
    System.out.println("Date: 3/19/15\n\n");
  }
  
  public static void main(String[] args)
  {
    titleLines();
    Scanner input = new Scanner(System.in);
    String dirPath = null;
    
    for(;;)
    {
      System.out.print("Directory path: ");
      dirPath = input.nextLine();
      boolean dirCheck = new File(dirPath).isDirectory();
      if (dirCheck)
        break;
      System.out.println("\n::Invalid directory::\n");
    }
    
    File parent = new File(dirPath);
    String[] files = parent.list();
    System.out.println("\n\nType FileName                             Bytes  LastModified");
    System.out.println("-----------------------------------------------------------------------------");
    for (String file : files)
    {
      File f = new File(dirPath + "\\" + file);
      if (f.isDirectory())
        System.out.print(" D");
      else
        System.out.print(" -");
      if (f.isAbsolute())
        System.out.print('A');
      else
        System.out.print('-');
      
      Date mod = new Date(f.lastModified());
      System.out.printf("  %-30s  %10d  %s\n", file, f.length(), mod);
    }
    System.out.println();
  }
}
