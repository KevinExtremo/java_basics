import java.io.*;
public class Datenfelder 
{

	/**
	 * @author Extremo
	 * @copyright 2009
	 */
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)  
	{
		try
		{
			System.out.println("Bitte Anzahl an Zahlen erfassen: ");
			int nr = Integer.parseInt(br.readLine());
			double a[] = new double[nr];
			for(int x = 0; x < nr; x++)
			{
				a[x] = doubleEingabe("Bitte "+(x+1)+" Zahl erfassen: ");
			}
			for(int i = 0; i < nr; i++)
			{
				System.out.print(" "+a[i]);
			}
			System.out.println();
			double erg = 0;
			for(int y = 0; y < nr; y++)
			{
				erg = erg+a[y];
			}
			System.out.println("Summe: "+erg);
			System.out.println("Durchschnitt: "+(erg/nr));
		}
		catch(Exception e)
		{
				System.out.println("Eingabefehler: "+e);
		}
	}
	public static double doubleEingabe(String args) throws IOException
	{
		System.out.println(args);
		double value = Double.parseDouble(br.readLine().replace(',','.'));
		return value;
	}

}
