import java.io.*;
public class SparTabelleDQM 
{

	/**
	 * @author Extremo
	 * @copyright 2009
	 */
	public static void main(String[] args) throws IOException
	{
		// Dekleration der Variablen
		double Kapital = 0;
		double Zinssatz = 0;
		double Laufzeit = 0;
		double abfrage = 0;
		char ende = 'f';
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			// Dauer Schleife solange die Eingabe nicht richtig ist
			while(ende == 'f')
			{
				try
				{
					System.out.println("Bitte Kapital eingeben:");
					Kapital = Integer.parseInt(br.readLine().replace(',','.'));
					System.out.println("Bitte den Zinssatz eingeben:");
					Zinssatz = Integer.parseInt(br.readLine().replace(',','.'));
					System.out.println("Bitte die Laufzeit in Jahren eingeben:");
					Laufzeit = Integer.parseInt(br.readLine().replace(',','.'));
					ende = 'w';
				}
				catch(Exception e)
				{
					System.out.println("Eingabefehler: "+e);
				}
			}
			// Ausgabe der Daten
			System.out.println("Jahr\tAnfangskapital\tZinsbetrag\tJahresendbetrag");
        	OutputVars(Kapital,Zinssatz,Laufzeit);
			
        	// Nachfrage nach wiederholung der do-while
			System.out.println("Weitere Aufgabe bearbeiten? 1 = Ja/ 0 = Nein:");
			abfrage = Integer.parseInt(br.readLine());

		}while(abfrage==1);
	}// main
	// Funktion zur ausgabe der Daten
	public static void OutputVars(double kap, double zin, double lau)
	{
		for(int i = 1; i < lau+1; i++)
		{
			
			System.out.println(i+"\t"+runden(kap)+"\t\t"+runden(Zinsen(kap,zin))+"\t\t"+runden((kap+Zinsen(kap,zin))));
			kap = kap+Zinsen(kap,zin);
		}
	}
	// Funktion zum Runden der Zahlen
	public static double runden(double var)
	{
		return Math.round(var*100.0)/100.0;
	}
	// Funktion zur ausgabe der Zinsen
	public static double Zinsen(double kapital, double zinsen)
	{
		double output = kapital/100*zinsen;
		return output;
	}
}//class
