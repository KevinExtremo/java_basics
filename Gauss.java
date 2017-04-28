import java.io.*;

public class Gauss 
{	//Anfangsclass
	public static void main(String args[]) throws IOException
	{//Anfang der Main
		
		int i, j, k, h, n = 0;
		double q = 0, sum1 = 0, sum2 = 0;
		double a[][] 	= null;			//new double [10][10];
		double b[] 		= null;			//new double [10];
		double x[] 		= null;			//new double [10];
		
		BufferedReader tastatur = new BufferedReader (new InputStreamReader(System.in));
		
		//Beginn des Programms:
		//Eingabe:
		System.out.println("Gauss-Elemination mit n Variablen und n Bedingungen: ");
		try
		{
			System.out.println("Bitte Anzahl n eingeben: ");
			n = Integer.parseInt(tastatur.readLine());
			a = new double[n+1][n+1];
			b = new double[n+1];
			x = new double[n+1];
			
			for(i = 1; i<=n; i++)
			{
				for(k = 1; k<=n; k++)
				{
					System.out.println("Bitte a ("+(i)+"."+(k)+") eingeben: ");
					a[i][k] = Double.parseDouble(tastatur.readLine().replace(',','.')); //oder aelter
					//a[i][k] = Double.valueOf(din.readLine()).doubleValue();
				}
				
				System.out.println("Bitte b("+(i)+") eingeben: ");
				b[i] = Double.parseDouble(tastatur.readLine().replace(',', '.'));
			}
		} catch(Exception e){System.out.println("EingabeFehler!");};
		
		System.out.println(); //leer
		System.out.println(); //leer
		System.out.println("Ausgabe der Eingabewerte: ");
		
		
		//Elemination:
		for(i = 1; i <= n; i++)
		{
			for(k = 1; k <= n; k++)
			{
				System.out.print("a("+i+"."+k+")= "+a[i][k]+ " | ");
			}
			System.out.println("b("+i+")= "+b[i]+" | ");
		}
		System.out.println(); //leer
		System.out.println(); //leer
		
		//Elemination
		for(h = 1; h <= n-1; h++)
		{
			for(i = h+1; i <= n; i++)
			{
				if(a[h][h] != 0) q = -a[i][h] / a[h][h];
				System.out.println("q-Werte Lauf ("+h+")= "+runden(q));
				
				for(k = h; k <= n; k++)
				{
					a[i][k] = a[i][k] + a[h][k] * q;//Ende k
				}//Ende k
				
				b[i] = b[i] + b[h] * q;
			}//ende i
			
			//Ausgabe der Zwischenergebnisse
			for(i = 1; i <= n; i++)
			{
				for(k = 1; k <= n; k++)
				{
					System.out.print("a("+i+"."+k+")= "+runden(a[i][k])+" | ");
				}
				System.out.println("b("+i+")= "+runden(b[i])+" | ");
			}
			System.out.println(); //leer
		}
		
		//Rueksubstitution:
		for(i = n; i >= 1; i--)
		{
			sum1 = 0; sum2=0;
			for(j = i + 1; j <= n; j++) 
			{
				sum1 = sum1 - a[i][j] * x[j];
			}
			sum2 = b[i] + sum1;
			
			if(a[i][i] != 0)
			{
				x[i] = sum2 / a[i][i];
			}
		}
		
		//Ausgabe
		for(i = 1; i <= n; i++)
		{
			ausgabe("x["+i+"]= "+ runden(x[i]));
			System.out.println(); //leer
		}
	}
	
	
	
	
	//methoden
	public static double runden(double wert) //3 Stellen
	{
		return Math.floor(wert * 1000+.1)/1000;
	}
	
	public static void ausgabe(String satz)//Funktionsdefinition
	{
		System.out.println(satz);
	}
}
