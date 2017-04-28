import java.util.*;


public class QGlei 
{
	/**
	 * @author Extremo
	 */
	
	
	public static void main(String[] args) 
	{
		// Deklaration der Variablen
		double a = 0;
		double b = 0;
		double c = 0;
		double x1 = 0;
		double x2 = 0;
		double p = 0;
		double q = 0;
		double d = 0;
		char gotit = 'f';
		while(gotit == 'f')
		{
			try
			{
				// Einen Eingabebuffer erstellen
				Scanner scan = new Scanner(System.in);
				// Anfrage nach Koeffizienten stellen
				System.out.println("Bitte geben Sie den Koeffizienten a ein!");
				a = Double.parseDouble(scan.next().replace(',','.'));
				// Kontrolliere ob a == 0 ist oder nicht
				if(a == 0)
				{
					System.exit(0);
				}
				System.out.println("Bitte geben Sie den Koeffizienten b ein!");
				b = Double.parseDouble(scan.next().replace(',','.'));
				System.out.println("Bitte geben Sie den Koeffizienten c ein!");
				c = Double.parseDouble(scan.next().replace(',','.'));
				gotit = 'w';
				p = rechneP(b, a);
				q = rechneQ(c, a);
				d = rechneD(p, q);
				if(d<0)
				{
					System.out.println("Keine reelle Lösung möglich!");
					scan.close();
					System.exit(0);
				}
			}
			catch(Exception e)
			{
				System.out.println("Fehler in der Eingabe: " +e);
			}
		}
		x1 = -p/2+Math.sqrt(d);
		x2 = -p/2-Math.sqrt(d);
		System.out.println("Die Loesungen sind X1: " +x1+ " und X2: "+x2);
		
		
	}
	// Deklaration der Rechne P Funktion
	public static double rechneP(double b, double a)
	{
		return b/a;
	}
	// Deklaration der Rechne Q Funktion
	public static double rechneQ(double c, double a)
	{
		return c/a;
	}
	// Deklaration der Rechne D Funktion
	public static double rechneD(double p, double q)
	{
		return p*p/4-q;
	}
}
