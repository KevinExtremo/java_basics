import java.util.*;



public class SarrusRegel 
{

	/**
	 * @author Extremo
	 * @copyright 2009
	 */
	
	public static void main(String[] args) 
	{
		// Dekleration der Variablen
		
		double[]dA;
		dA = new double[3];
		double[]dB;
		dB = new double[3];
		double[]dC;
		dC = new double[3];
		double[]dD;
		dD = new double[3];
		boolean done=true;
		
		
		// Initialisieren des Scanners/Buffers
		
		Scanner scan = new Scanner(System.in);
		
		
		while(done)
		{
			try
			{
				// Eingabe
				
				for(int x = 1; x < 4; x++)
				{
					System.out.println("Bitte geben Sie a"+x+" ein!");
					dA[x-1] = Double.parseDouble(scan.next().replace(',','.'));
				}
				for(int x = 1; x < 4; x++)
				{
					System.out.println("Bitte geben Sie b"+x+" ein!");
					dB[x-1] = Double.parseDouble(scan.next().replace(',','.'));
				}
				for(int x = 1; x < 4; x++)
				{
					System.out.println("Bitte geben Sie c"+x+" ein!");
					dC[x-1] = Double.parseDouble(scan.next().replace(',','.'));
				}
				for(int x = 1; x < 4; x++)
				{
					System.out.println("Bitte geben Sie d"+x+" ein!");
					dD[x-1] = Double.parseDouble(scan.next().replace(',','.'));
				}
				
				// Stoppen der while loop
				done=false;
				
				System.out.println("Alle variablen würden erfolgreich eingegeben. Berechnung ist intialisiert!");
				double D, X, Y, Z;
				D = rechneMember(dA, dB, dC);
				if(D == 0)
				{
					System.out.println("Keine reelle Lösung möglich!");
					System.exit(0);
				}
				X = rechneMember(dB, dC, dD);
				X = X/rechneMember(dA, dB, dC);
				Y = rechneMember(dA, dD, dC);
				Y = Y/rechneMember(dA, dB, dC);
				Z = rechneMember(dA, dB, dD);
				Z = Z/rechneMember(dA, dB, dC);
				System.out.println("Lösung: L = {"+X+"|"+Y+"|"+Z+"}");
			}
			catch(Exception e)
			{
				System.out.println("Fehler in der Eingabe: "+e);
			}
		}
	}
	public static double rechneMember(double a[], double b[],double c[])
	{
		
		double temp = a[0] * (b[1] * c[2] - c[1] * b[2]) -
		 			  b[0] * (a[1] * c[2] - c[1] * a[2]) +
					  c[0] * (a[1] * b[2] - b[1] * a[2]);
		return temp;
	}
	

}
