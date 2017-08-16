// Laslo Kraus
//
// Citaj.java - Citanje podataka standardnih tipova preko glavnog ulaza.
//              (verzija za SDK 1.2.2)

package UnijaSkupova;

public final class Citaj {

  private static char c;           // Poslednji procitani znak.

  public static char getCh () {    // Dohvatanje sledeceg znaka.
    try { return c = (char)System.in.read(); }
      catch (Exception e) { return c = ' '; }
  }

  public static char Char () {     // Citanje jednog (ne belog) znaka.
    while (Character.isWhitespace(c=getCh()));
    return c;
  }

  public static String String () { // Citanje jedne reci.
    String s="";
    while ( Character.isWhitespace(c=getCh())); s += c;
    while (!Character.isWhitespace(c=getCh()))  s += c;
    return s;
  }

  public static String Line ()     // Citanje jedne linije teksta.
    { String s=""; while ((c=getCh()) != '\n') if (c != '\r') s += c; return s; }

  public static void getNL ()      // Preskoci znakove do kraja linije.
    { while (c != '\n') c = getCh (); c = '\0'; }

  public static byte   Byte   ()   // Citanje jednog podatka tipa byte.
    { return Byte.parseByte (String ()); }

  public static short  Short  ()   // Citanje jednog podatka tipa short.
    { return Short.parseShort (String ()); }

  public static int    Int    ()   // Citanje jednog podatka tipa int.
    { return Integer.parseInt (String ()); }

  public static long   Long   ()   // Citanje jednog podatka tipa long.
    { return Long.parseLong (String ()); }

  public static float  Float  ()   // Citanje jednog podatka tipa float.
    { return Float.parseFloat (String ()); }

  public static double Double ()   // Citanje jednog podatka tipa double.
    { return Double.parseDouble (String ()); }

  private Citaj () {}              // Nema smisla stvarati primerke klase!

}
