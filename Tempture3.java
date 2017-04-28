public class Tempture3 
{
	public static void main(String[] args)
	{
		Temp3 tagestemp;
		tagestemp = new Temp3();
		System.out.println(tagestemp.getCelsius()+" Grad Celsius");
		System.out.println(tagestemp.getFahrenheit()+" Grad Fahrenheit");
	}
}
class Temp3
{
	private double celsius;
	public Temp3(double grad) { setCelsius(grad); }
	public Temp3() { setCelsius(25); }
	public void setCelsius(double grad)
	{
		if(grad < -90) grad = -90;
		if(grad > 65)	grad = 65;
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