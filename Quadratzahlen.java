import java.io.*;
public class Quadratzahlen 
{

	/**
	 * @author Extremo
	 * @copyright 2009
	 */
	public static void main(String[] args) throws IOException
	{
		// Deklaration
		BufferedReader br = null;
		int n = 0;
		int abfrage = 1;
		// Initialisierung
		br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
		char ende = 'f';
		
		while(ende == 'f')
		{
			try
			{
				//Eingabe
				System.out.println("Bitte ganze Zahl > 0 erfassen!");
				n = Integer.parseInt(br.readLine());
				if(n>0)
				{
					ende = 'w';
				}
			}
			catch(Exception e)
			{
				System.out.println("Fehler in der Eingabe: "+e);
			}
		}
		//Verarbeitung
		for(int x=1;x<=n;x++)
		{
			System.out.print(x*x+" ");
		}
		System.out.println("\nWeitere Aufgabe bearbeiten 1=ja / 0=nein:");
		abfrage = Integer.parseInt(br.readLine());
		}while(abfrage == 1);		
	}//main

}//class
