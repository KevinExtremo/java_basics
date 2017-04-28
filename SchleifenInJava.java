
public class SchleifenInJava 
{
	/**
	 * @author Extremo
	 * @copyright 2009
	 */
	public static void main(String[] args) 
	{
		// 1a die kopfgesteuerte Schleife = While-Schleife

		// Dekleration der variablen

		int x = 0; // Anfangswert
		while(x<=10) // While-Schleife
		{
			System.out.print(x+" "); // Ausgabe der Variable mit Leerzeichen
			x=x+1; // Standardzaehler
		}
		System.out.println(); // Leerzeile
		// 1b die kopfgesteuerte Schleife = While-Schleife als countdown

		// Dekleration der variablen

		int f = 10; // Anfangswert
		while(f>=0) // While-Schleife
		{
			System.out.print(f+" "); // Output/Ausgabe
			f--; // Dekrementor standardmaeﬂiges decreasen der variable um 1
		}
		System.out.println(); // Leerzeile
		//2a.Fussgesteuerte Schleife = Do-While-Schleife

		//Dekleration der Variablen

		int c = 0; // Anfangswert

		do // Do-While Schleife
		{
			System.out.print(c+" "); // Output/Ausgabe
			c++; // Inkrementor standardmaeﬂiges erhoehen der Zahl um 1
		}while(c<=10);
		System.out.println(); // Leerzeile
		//2b.Fussgesteuerte Schleife = Do-While-Schleife als countdown


		// Dekleration der Variablen

		int y = 10;

		do // Do-While Schleife
		{
			System.out.print(y+" ");
			y--; // Dekrementor standardmaeﬂiges decreasen der variable um 1
		}while(y>=0);
		System.out.println(); // Leerzeile

		//3a.Zaehlergesteuerte Schleife = Zeahlschleife= For-Schleife
		for(int i = 0; i<= 10; i++) // For-Schleife
		{
			System.out.print(i+" "); // Output/Ausgabe
		}
		System.out.println(); // Leerzeile

		// 3b.Zaehlergesteuerte Schleife = Zaehlschleife= For-Schleife als countdown

		for(int k = 10; k>= 0; k--) // For-Schleife
		{
			System.out.print(k+" "); // Output/Ausgabe
		}
		System.out.println(); //Leerzeile
	}

}
