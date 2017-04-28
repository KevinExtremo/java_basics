import java.io.*;
public class GaussEleminierung
{

	/**
	 * @author: Extremo
	 * @copyright: 2009
	 * @credits: H. Friedrichs
	 */
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = null;
		br = new BufferedReader( new InputStreamReader(System.in));
		double [][]a = null;
		double [] b = null;
		double []x = null;
		int n = 0,spalte=0,zeile=0,richtig=0;
		boolean nochmal=true;
		//Eingabe der Groesse der Arrays
		System.out.print("Wie viele Gleichungen wollen Sie berechnen? ");
		try{
		n = Integer.parseInt(br.readLine());
		}
		catch(Exception eva){n=3;};
		n = Math.abs(n);
        System.out.println("Sie haben "+n+" Gleichungen eingegeben!");
        a = new double[n+1][n+1];
        b = new double[n+1];
        x = new double[n+1];
        //Eingabe der Werte
        for(int i = 1;i<=n;i++)
        {
        	for(int k = 1;k<=n; k++)
        	{
        	 System.out.print("Bitte a("+i+"."+k+") eingeben! ");
        	 try{
        	 a[i][k] = Double.parseDouble(br.readLine().replace(',','.'));
        	 } catch(Exception e){a[i][k]= 1;};
        	}//k
        	 System.out.print("Bitte b("+i+") eingeben! ");
        	 try{
        	 b[i]= Double.parseDouble(br.readLine().replace(',','.'));
        	 } catch(Exception e){b[i]= 1;};
        }//i
        
        System.out.println("\nAusgabe der Eingabematrix mit Bezeichnern");
        for(int i = 1;i<=n;i++)
        {
        	for(int k = 1;k<=n; k++)
        	{
        	 System.out.print("a("+i+"."+k+") = "+a[i][k]+"  ");
        	
        	}//k
        	 System.out.println("b("+i+") = "+b[i]+"  ");
        }//i
        // Korrektur der a(ik)-Eingaben!
        do{
        System.out.println("Sind alle a(ik)-Eingaben richtig?(ja=1,nein=0)");
        richtig = Integer.parseInt(br.readLine());
        if (richtig == 0)
        {
        System.out.print("Geben Sie Zeile und Spalte der falschen Zahl ein!");
        zeile = Integer.parseInt(br.readLine());
        spalte = Integer.parseInt(br.readLine());
        
        System.out.println("a("+zeile+"."+spalte+")  = " +a[zeile][spalte]);
        System.out.print("Geben Sie die richtige Zahl ein!");		
        a[zeile][spalte]= Double.parseDouble(br.readLine().replace(',','.'));
        }//if
        else nochmal = false; 
        }while(nochmal);
        // Korrektur der b(i)-Eingaben!
        do{
        System.out.println("Sind alle b(i)-Eingaben richtig?(ja=1,nein=0)");
        richtig = Integer.parseInt(br.readLine());
        if (richtig == 0)
        {
        System.out.print("Geben Sie b-Anzahl der falschen Zahl ein!");
        zeile = Integer.parseInt(br.readLine());
        
        System.out.println("b("+zeile+")  = " +b[zeile]);
        System.out.print("Geben Sie die richtige Zahl ein!");		
        b[zeile] = Double.parseDouble(br.readLine().replace(',','.'));
        }//if
        else nochmal = false; 
        }while(nochmal);
        
        
        System.out.println("\nAusgabe der korrigierten Eingabematrix");
        for(int i = 1;i<=n;i++)
        {
        	for(int k = 1;k<=n; k++)
        	{
        	 System.out.print("a("+i+"."+k+") = "+a[i][k]+"  ");
        	
        	}//k
        	 System.out.println("b("+i+") = "+b[i]+"  ");
        }//i
        // Rücksubstitution1:
        x[4]=b[4]/a[4][4];
        x[3]=(b[3]-a[3][4]*x[4])/a[3][3];
        x[2]=(b[2]-a[2][3]*x[3]-a[2][4]*x[4])/a[2][2];
        x[1]=(b[1]-a[1][2]*x[2]-a[1][3]*x[3]-a[1][4]*x[4])/a[1][1];
        System.out.println("x[4]= "+x[4]);
        System.out.println("x[3]= "+x[3]);
        System.out.println("x[2]= "+x[2]);
        System.out.println("x[1]= "+x[1]);
        // Rücksubstitution 2:
        double sum1=0,sum2=0;
        for(int i=n;i>=1;i--)
        {
        	sum1=0;sum2=0;
        	for(int k=i+1;k<=n;k++)
        		sum1=sum1-a[i][k]*x[k];//k
        	sum2=b[i]+sum1;
        	if(a[i][i]!=0) x[i] = sum2/a[i][i];
        }//i
        //Ausgabe:
        for(int i=1;i<=n;i++)
        {
        	System.out.println("x["+i+"]= "+df.format(x[i]));
        	System.out.println();//leer
        }
        
	}//main
}//class