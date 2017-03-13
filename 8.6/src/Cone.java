
public class Cone 
{
	private double radius;
	private double height;
	
	public Cone(double r, double h)
	{
		radius = r;
		height = h;
	}
	
	public double getVolume()
	{
		return Math.PI*radius*radius*(height/3.0);
	}
	
	public double getSurfaceArea()
	{
		return Math.PI * radius * (radius + Math.sqrt((height * height) + (radius*radius)));
	}
}
