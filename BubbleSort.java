public class BubbleSort 
{

    public static void main(String[] args) 
	{
		// Einlesen der Kommandozeilenargumente 'als integer' in Feld 'array'
		int[] array = new int[args.length]; 
		int i = 0;
		while ( i < args.length ) 
		{
			array[i] = Integer.parseInt(args[i]);
			i = i+1;
		}

		// Sortieren
		i = 1;
		while ( i < array.length ) 
		{
			int j = array.length - 1;
			while ( j >= i ) 
			{
				if ( array[j] < array[j-1] ) 
				{
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
				j = j-1;
			}
			i = i+1;
		}

		// Sortierte Liste ausgeben
		i = 0;
		while ( i < array.length ) 
		{
			System.out.println(array[i]);
			i = i+1;
		}
    }
}
