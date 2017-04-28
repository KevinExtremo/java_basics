import java.io.*;
import java.util.*;
public class Array_Noten 
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
			System.out.println("Bitte geben Sie die Anzahl an Noten die Sie haben ein:" );
			int nr = Integer.parseInt(br.readLine());
			int erg = 0;
			int a[] = new int[nr];
			for(int i = 0; i < nr; i++)
			{
				a[i] = IntEingabe("Bitte geben Sie ihre "+(i+1)+" ein: ");
				erg = erg+a[i];
			}
			Arrays.sort(a, 'Z', 'A');
			System.out.println("Durchnittsnote: "+(erg/nr));
		}
		catch(Exception e)
		{
			System.out.println("Eingabefehler: "+e);
		}
		
	}
	public static int IntEingabe(String str) throws IOException
	{	
		System.out.println(str);
		int x = Integer.parseInt(br.readLine());
		while(x<0||x>6)
		{
			System.out.println("Bitte wiederholen Sie diese Eingabe! Es ist keine Zahl zwischen 1-6 erkannt worden: ");
			x = Integer.parseInt(br.readLine());
		}
		return x;
	}

}
