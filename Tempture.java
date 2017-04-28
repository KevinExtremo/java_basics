public class Tempture 
{
	public static void main(String[] args)
	{
		Temp tagestemp;
		tagestemp = new Temp();
		tagestemp.setCelsius(45.6);
		System.out.println(tagestemp.getCelsius()+" Grad Celsius");
		System.out.println(tagestemp.getFahrenheit()+" Grad Fahrenheit");
	
	}
}
class Temp
{
	private double celsius;
	public void setCelsius(double grad)
	{
		if(grad < -90) grad = -90;
		if(grad > 65) grad = 65;
		celsius = grad;
	}
	public double getCelsius()
	{
		return celsius;
	}
	public double getFahrenheit()
	{
		return (9.0/5.0*celsius + 32.0);
	}
}