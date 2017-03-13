
public class Sphere 
{
	private double radius;
	
	public Sphere(double r)
	{
		radius = r;
	}
	
	public double getVolume()
	{
		return (4.0/3.0) * Math.PI * radius*radius*radius;
	}
	
	public double getSurfaceArea()
	{
		return 4.0*Math.PI*radius*radius;
	}
	
}
