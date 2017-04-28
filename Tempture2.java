
public class Tempture2 
{
	public static void main(String[] args)
	{
		Temperatur2 tagestemp = new Temperatur2(66);
		System.out.println(tagestemp.getCelsius());
	}
}
class Temperatur2
{
	private int celsius;
	public Temperatur2(int grad)
	{
		setCelsius(grad);
	}
	public void setCelsius(int grad)
	{
		if(grad<-90)
		{
			grad = -90;
		}
		if(grad > 65)
		{
			grad = 65;
		}
		celsius = grad;
	}
	public int getCelsius()
	{
		return celsius;
	}
}