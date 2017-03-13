
public class Cube 
{
	private double height;
	
	public Cube(double h)
	{
		height = h;
	}
	
	public double getVolume()
	{
		return Math.pow(height, 3);
	}
	
	public double getSurfaceArea()
	{
		return 6.0*height*height;
	}
	
	
}
