//Assignment PC1401: Morse Code
//Chris Fernandez
//Editor: Notepad++
//Compiler: javac
//Date: 3/4/15
//CS 3340 - Winter 2015

import java.util.Scanner;

class pc1402MorseCode
{
  public static void titleLines()
  {
    System.out.println("Assignment PC1401: Morse Code");
    System.out.println("Author: Chris Fernandez");
    System.out.println("Editor: Notepad++");
    System.out.println("Compiler: javac");
    System.out.println("Date: 3/4/15\n\n");
  }
  
  public static void main(String[] args)
  {
    titleLines();
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a message and I will\nconvert it into a series of beeps: ");
    String buf = input.nextLine();
    System.out.println();
    
    buf = buf.replaceAll("\\s+", " ");
    char[] code = buf.toCharArray();
    
    for (char beep: code)
    {
      if (beep == 'a' | beep == 'A')
        System.out.print(".-");
      else if (beep == 'b' | beep == 'B')
        System.out.print("-...");
      else if (beep == 'c' | beep == 'C')
        System.out.print("-.-.");
      else if (beep == 'd' | beep == 'D')
        System.out.print("-..");
      else if (beep == 'e' | beep == 'E')
        System.out.print(".");
      else if (beep == 'f' | beep == 'F')
        System.out.print("..-.");
      else if (beep == 'g' | beep == 'G')
        System.out.print("--.");
      else if (beep == 'h' | beep == 'H')
        System.out.print("....");
      else if (beep == 'i' | beep == 'I')
        System.out.print("..");
      else if (beep == 'j' | beep == 'J')
        System.out.print(".---");
      else if (beep == 'k' | beep == 'K')
        System.out.print("-.-");
      else if (beep == 'l' | beep == 'L')
        System.out.print(".-..");
      else if (beep == 'm' | beep == 'M')
        System.out.print("--");
      else if (beep == 'n' | beep == 'N')
        System.out.print("-.");
      else if (beep == 'o' | beep == 'O')
        System.out.print("---");
      else if (beep == 'p' | beep == 'P')
        System.out.print(".--.");
      else if (beep == 'q' | beep == 'Q')
        System.out.print("--.-");
      else if (beep == 'r' | beep == 'R')
        System.out.print(".-.");
      else if (beep == 's' | beep == 'S')
        System.out.print("...");
      else if (beep == 't' | beep == 'T')
        System.out.print("-");
      else if (beep == 'u' | beep == 'U')
        System.out.print("..-");
      else if (beep == 'v' | beep == 'V')
        System.out.print("...-");
      else if (beep == 'w' | beep == 'W')
        System.out.print(".--");
      else if (beep == 'x' | beep == 'X')
        System.out.print("-..-");
      else if (beep == 'y' | beep == 'Y')
        System.out.print("-.--");
      else if (beep == 'z' | beep == 'Z')
        System.out.print("--..");
      else if (beep == '1')
        System.out.print(".----");
      else if (beep == '2')
        System.out.print("..---");
      else if (beep == '3')
        System.out.print("...--");
      else if (beep == '4')
        System.out.print("....-");
      else if (beep == '5')
        System.out.print(".....");
      else if (beep == '6')
        System.out.print("-....");
      else if (beep == '7')
        System.out.print("--...");
      else if (beep == '8')
        System.out.print("---..");
      else if (beep == '9')
        System.out.print("----.");
      else if (beep == '0')
        System.out.print("-----");
      else if (beep == ' ')
        System.out.print("   ");
      else
        continue;
      
      System.out.print(" ");
    }
    
    System.out.println('\n');
  }
}
