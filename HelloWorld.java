/*
 *  Name: HelloWorld
 *  File: Starter program
 *  Date: 14.08.09
 *  Credits held by Extremo a.k.a. Kevin Sekin and BioTec Engine
 */

import java.util.Scanner;

public class HelloWorld 
{
	public static void main(String[] arg)
	{
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Bitte geben Sie eine Zahl ein");
			double first = Double.parseDouble(scan.next().replace(',','.'));
			System.out.println("Bitte geben Sie eine zweite Zahl");
			double second = Double.parseDouble(scan.next().replace(',','.'));
			System.out.println("Erste Zahl: "+ first +" Zweite Zahl: "+ second +".");
		}
		catch(Exception e)
		{
			System.out.println("Eingabefehler! "+e);
		}
	}
}
