
public class Cylinder 
{
	private double radius;
	private double height;
	
	public Cylinder(double r, double h)
	{
		radius = r;
		height = h;
	}
	
	public double getVolume()
	{
		return Math.PI*radius*radius*height;
	}
	
	public double getSurfaceArea()
	{
		return (2.0*Math.PI*radius*height) + (2.0*Math.PI*radius*radius);
	}
}
