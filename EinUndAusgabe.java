import java.io.*;
public class EinUndAusgabe 
{
	/**
	 * @author Extremo
	 * @copyright 2009
	 * @serialDate 04.12.2009
	 * @license GNU
	 */
	
	public static void main(String[] args) throws IOException
	{
		// Definition der Variablen
		double [][]a = null;
		double []b = null;
		int n = 0;
		//Definiere Buffer
		BufferedReader br = null;
		//Initialisiere Buffer
		br = new BufferedReader(new InputStreamReader(System.in));
		
		//Eingabe
		System.out.print("Wie viele Gleichungen wollen Sie berechnen? ");
		try
		{
			n = Integer.parseInt(br.readLine());
			while(n<0)
			{
				System.out.println("Es sind keine Zahlen im negativen Bereich erlaubt!");
				System.out.print("Wie viele Gleichungen wollen Sie berechnen? ");
				n = Integer.parseInt(br.readLine());
			}
		}
		catch(Exception e)
		{
			System.out.println("Eingabefehler: "+e);
			n=3;
		}
		System.out.println("Sie wollen "+n+" Gleichungen berechnen!");
		a = new double[n+1][n+1];
		b = new double[n+1];
		//Eingabe der Werte
		for(int i = 1; i <= n; i++)
		{
			for(int k = 1; k <= n; k++)
			{
				System.out.print("Bitte a("+i+"."+k+") eingeben! ");
				try
				{
					a[i][k] = Double.parseDouble(br.readLine().replace(',','.'));	
				}
				catch(Exception e)
				{
					System.out.println("Eingabefehler: "+e);
					a[i][k] = 1;
				}
			}//k
			System.out.print("Bitte b("+i+") eingeben! ");
			try
			{
				b[i] = Double.parseDouble(br.readLine().replace(',','.'));
			}
			catch(Exception e)
			{
				System.out.println("Eingabefehler: "+e);
				b[i] = 1;
			}
		}//i
		//Ausgabe der Eingabematrix mit Bezeichnern
		for(int i = 1; i <= n; i++)
		{
			for(int k = 1; k <= n; k++)
			{
				System.out.print("a("+i+"."+k+") = "+a[i][k]+" ");		
			}//k
			System.out.println("b("+i+") = "+b[i]+" ");
		}//i
		
		
	}//main for dummies

}//class for dummies
